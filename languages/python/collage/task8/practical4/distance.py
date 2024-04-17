class Distance():
    def __init__(self,feet,inch):
        self.feet=feet
        self.inch=inch


    def sumFitInch(self,obj):
        Sumfeet=self.feet+obj.feet
        SumInchs=self.inch+obj.inch
        if SumInchs>12:
            Sumfeet+=SumInchs//12
            SumInchs=SumInchs%12
        return Sumfeet,SumInchs