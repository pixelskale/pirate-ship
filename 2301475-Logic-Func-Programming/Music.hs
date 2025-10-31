module Music where

data Note = C | Cs | D | Ds | E | F | Fs | G | Gs | A | As | B
  deriving (Eq, Ord, Enum, Bounded, Show)

data Interval = H | W deriving (Show)

type ScalePattern = [Interval]

majorPattern :: ScalePattern
majorPattern = [W, W, H, W, W, W, H]

minorPattern :: ScalePattern
minorPattern = [W, H, W, W, H, W, W]

intervalToInt :: Interval -> Int
intervalToInt H = 1
intervalToInt W = 2

intToNote :: Int -> Note
intToNote n = toEnum (n `mod` 12)

buildScale :: Note -> ScalePattern -> [Note]
buildScale root pattern =
  init $ map intToNote $ scanl (+) (fromEnum root) (map intervalToInt pattern)

type Motif = [Int]

transposeMotif :: Motif -> [Note] -> [Note]
transposeMotif motif scale =
  map (\degree -> scale !! (degree - 1)) motif

main :: IO ()
main = do
  let twinkleMotif = [1, 1, 5, 5, 6, 6, 5, 4, 4, 3, 3, 2, 2, 1]

  let cMajorScale = buildScale C majorPattern
  let eMajorScale = buildScale E majorPattern
  let aMinorScale = buildScale A minorPattern

  putStrLn "==> Scales"
  putStr "C Major Scale:   " >> print cMajorScale
  putStr "E Major Scale:   " >> print eMajorScale
  putStr "A Natural Minor: " >> print aMinorScale
  putStrLn ""

  putStrLn "==> Transposed Motif"
  putStr "Twinkle in C Major: " >> print (transposeMotif twinkleMotif cMajorScale)
  putStr "Twinkle in E Major: " >> print (transposeMotif twinkleMotif eMajorScale)
  putStr "Twinkle in A Minor: " >> print (transposeMotif twinkleMotif aMinorScale)
