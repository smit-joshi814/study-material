'''
2. Write a python program to create a class Room with members length and breadth. Initialize
the attributes and find the area of the room and display the result.
'''

class Area(object):
	"""docstring for Area"""
	def __init__(self, length,bredth):
		super(Area, self).__init__()
		self.length=length
		self.bredth=bredth

	def area(self):
		return self.bredth*self.length
		
def main():
	obj1=Area(4,3)
	print(f"Area of Room Is : {obj1.area()}")

main()