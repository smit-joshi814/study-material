'''
1. Write a python program for creating class Fraction with members numerator and
denominator to represent rational numbers like 1/2 and -3/8. Create a constructor to
initialize the objects and write the method for addition and multiplication of two fractions
and display the result in proper fraction format
'''

class Fraction(object):
	"""docstring for Fraction"""
	numerator=1
	denominator=1
	def __init__(self, numerator,denominator):
		super(Fraction, self).__init__()
		self.numerator=numerator
		self.denominator=denominator

	def add(self,fraction):
		if self.denominator==fraction.denominator:
			return (self.numerator+fraction.numerator),self.denominator
		else:
			n1=(self.numerator*fraction.denominator)+(self.denominator*fraction.numerator)
			n2=self.denominator*fraction.denominator
			return n1,n2

		 
	def multiply(self,fraction):
		if self.denominator==fraction.denominator:
			return (self.numerator*fraction.numerator),self.denominator
		else:
			n1=(self.numerator*fraction.denominator)*(self.denominator*fraction.numerator)
			n2=self.denominator*fraction.denominator
			return n1,n2


def main():
	obj1=Fraction(1,2)
	obj2=Fraction(3,8)

	num,deno=obj2.add(obj1)
	print(f"Addition => {num}/{deno}")

	num,deno=obj2.multiply(obj1)
	print(f"multiplication => {num}/{deno}")	

main()
