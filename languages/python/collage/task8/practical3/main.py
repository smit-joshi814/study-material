import euclideanCalculator as cal

def getPoints(n):
   return int(input(f"Point {n} "))

point1=[]
point1.append(getPoints(1))
point1.append(getPoints(2))
print("---")
point2=[]
point2.append(getPoints(1))
point2.append(getPoints(2))

print("euclidean distance is",cal.euclidean_distance(point1,point2))