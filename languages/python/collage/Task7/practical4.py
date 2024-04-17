'''
Write a python program to demonstrate the concept of method overloading. Write three
functions named surface area() for calculating the surface area of cube, sphere and cylinder.
'''
from multipledispatch import dispatch
import math

class Area:

    @dispatch(int)
    def area(self,length):
       print("Area of cube is: ",6*length**2)

    @dispatch(float)
    def area(self,radious):
        print("Area of Shpare is: ",4*math.pi*radious**2)

    @dispatch(float,int)
    def area(self,radious,height):
        print("Area of cylinder is: ",2*math.pi*radious*(radious+height))

obj=Area()
obj.area(10)
obj.area(2.0)
obj.area(2.0,2)