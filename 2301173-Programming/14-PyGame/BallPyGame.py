# Import the pygame library
import pygame

# Import system
import sys

# Import random
import random

# 1. Initialize the pygame library
pygame.init()

# 2. Create clock
clock = pygame.time.Clock()

# 3. Set up the drawing window with (800,600)
screen = pygame.display.set_mode((800,600))

# Set up the drawing window with "title"
pygame.display.set_caption("Ball PyGame")

# Define backgound color
bgB = pygame.Color(0, 0, 0)
bgG = pygame.Color(0, 255, 0)
background = bgB

# Ball class
class Ball():
    def __init__(self, screen, screenWidth, screenHeight):
        self.screen = screen
        self.screenWidth = screenWidth
        self.screenHeight = screenHeight

        # 4. Load ball image (ball.png)
        self.ballImage = pygame.image.load('ball.png')

        # 5. Define self.width and self.height
        self.width = self.ballImage.get_width()
        self.height = self.ballImage.get_height()
        self.maxWidth = screenWidth - self.width
        self.maxHeight = screenHeight - self.height

        # Pick a random starting position
        self.x = random.randrange(0, self.maxWidth)
        self.y = random.randrange(0, self.maxHeight)

        # Choose a random speed between -3 and 3
        speedsList = [-3, -2, -1, 1, 2, 3]
        self.xSpeed = random.choice(speedsList)
        self.ySpeed = random.choice(speedsList)

    def update(self):
        # 6. Check for hitting a wall and change the direction
        if self.x not in range(1, self.maxWidth):
            self.xSpeed = (self.xSpeed)*(-1)
        if self.y not in range(1, self.maxHeight):
            self.ySpeed = (self.ySpeed)*(-1)
        # Create the rectangle object to be used in collision check
        self.ballRect = pygame.Rect(self.x, self.y, self.width, self.height)

    def draw(self):
        # 7. Display balls on screen
        screen.blit(self.ballImage, (self.x, self.y))

ballList = []
ball1 = Ball(screen, 800, 600)
ballList.append(ball1)
ball2 = Ball(screen, 800, 600)
ballList.append(ball2)

# Run until the user asks to quit
running = True
while running:
    # 8. Detect all events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_ESCAPE or event.key == pygame.K_q:
                running = False
    
    # MOVE THE BALLS!
    for objBall in ballList:
        objBall.x += objBall.xSpeed
        objBall.y += objBall.ySpeed
    # UPDATE THE BALLS!
    for objBall in ballList:
        objBall.update()
    
    # 9. Check collision and change background color
    if ball1.ballRect.colliderect(ball2.ballRect):
        if background == bgB:
            background = bgG
        else:
            background = bgB

    # 10. Fill the screen background
    screen.fill(background)

    # 11. Draw balls
    for objBall in ballList:
        objBall.draw()

    # 12. Update the screen
    pygame.display.flip()

    # Slow things down a bit
    clock.tick(80)

pygame.quit()
sys.exit()
