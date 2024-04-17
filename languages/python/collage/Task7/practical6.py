'''
Write a python program for creating class Vehicle with members Model no, type and price.
Derive class car and bike from class vehicle. Class car has members engine number, color
and fueltype. Class Bike has members as machine CC and mileage. Write proper
constructors and display functions to display all the dettails
'''

class Vehicle():
    def __init__(self,modelNo,type,price):
        self.modelNo=modelNo
        self.type=type
        self.price=price

    def display(self):
        print()
        print("Model No:",self.modelNo)
        print("Type:",self.type)
        print(f"Price: ₹{self.price}")


class Car(Vehicle):
    def __init__(self,modelNo,type,price,engineNumber,color,fuelType):
        super().__init__(modelNo,type,price)
        self.engineNumber=engineNumber
        self.color=color
        self.fuelType=fuelType

    def display(self):
        super().display()
        print("Engine Number:",self.engineNumber)
        print("Color:",self.color)
        print("Fuel Type:",self.fuelType)

class Bike(Vehicle):
    def __init__(self, modelNo, type, price,machineCC,mileage):
        super().__init__(modelNo, type, price)
        self.machineCC=machineCC
        self.mileage=mileage

    def display(self):
        super().display()
        print("Machine CC:",self.machineCC)
        print("Mileage:",self.mileage)


# Bike Objects
Hero=Bike("Hero Splendor Plus","Commuter",65000,97.2,65)
Bajaj=Bike("Bajaj Pulsar 180","StreetFighter",120000,178.6,45)

# Car Objects
Sedun=Car(1, 'Sedan', 20000, '1234567890', 'Red', 'Gasoline')
SUV=Car(2, 'SUV', 30000, '9876543210', 'Blue', 'Diesel')
Truck=Car(3, 'Truck', 40000, '0987654321', 'Green', 'Electric')


# printing All The Objects Data
print('\n------HERO------')
Hero.display()
print('\n------BAJAJ------')
Bajaj.display()
print('\n------SEDUN------')
Sedun.display()
print('\n------SUV------')
SUV.display()
print('\n------TRUCK------')
Truck.display()










