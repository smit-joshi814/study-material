'''
3. Create class point with members x and y. Create method for finding the euclidian distance
between two points.
'''

import math

class PointOperations(object):
	"""docstring for PointOperations"""
	def __init__(self, x,y):
		super(PointOperations, self).__init__()
		self.x=x
		self.y=y

	def getX(self):
		return self.x
	def getY(self):
		return self.y

	def distance(self,point):
		return math.sqrt(((self.x-point.x)**2)+((self.y-point.y)**2))
		
def main():
	obj1=PointOperations(4,3)
	obj2=PointOperations(0,0)

	print(f"Distance is: {obj2.distance(obj1)}")

main()