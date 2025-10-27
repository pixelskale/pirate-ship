class Rectangle:
  def __init__(self, length, width):
    self.length = length
    self.width = width

  def calculate_area(self):
    return self.length * self.width
    
  def calculate_perimeter(self):
    return (self.length + self.width) * 2
