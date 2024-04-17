from geometry import circle, rectangle, triangle


circleObj=circle.Circle(radius=5)
rectangleObj = rectangle.Rectangle(length=4, width=6)
triangleObj =triangle.Triangle(base=4, height=3, side1=5, side2=5, side3=5)


print(f"Circle Area: {circleObj.area()}")
print(f"Circle Perimeter: {circleObj.perimeter()}")

print(f"Rectangle Area: {rectangleObj.area()}")
print(f"Rectangle Perimeter: {rectangleObj.perimeter()}")

print(f"Triangle Area: {triangleObj.area()}")
print(f"Triangle Perimeter: {triangleObj.perimeter()}")
