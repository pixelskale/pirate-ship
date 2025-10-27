import java.util.HashMap;
import java.util.Map;

public class Kite extends Quadrilateral {
    public Kite(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    public double area() {
        // In a kite, there are two pairs of adjacent sides of equal length,
        // and the diagonals that are of different lengths.
        double[] ultimate = this.getSortedDist();
        // Works in this specific scenario, but not a guaranteed outcome for every kite.
        //return (ultimate[2] * ultimate[5]) / 2;
        // Using HashMap, we can accurately find the diagonal lines in a kite (works with rhombuses too!).
        Map<Double, Integer> uniqueMap = new HashMap<>();
        for (double distance : ultimate) {
            uniqueMap.put(distance, uniqueMap.getOrDefault(distance, 0) + 1);
        }
        double result = 1;
        for (Map.Entry<Double, Integer> entry : uniqueMap.entrySet()) {
            if (entry.getValue() == 1) {
                result *= entry.getKey();
            }
        }
        return result / 2;
    }
}
