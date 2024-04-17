def paintTheWall(height,width,coverage):
    import math
    noOfCans=(height*width)/coverage
    
    print("no of cans needes is:",math.ceil(noOfCans))

height=int(input("Enter Height in meters: "))
width=int(input("Enter width in meters: "))
coverage=7
paintTheWall(height,width,coverage)