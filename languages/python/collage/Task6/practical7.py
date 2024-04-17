'''
Create class date with members day, month and year. Create constructor for initialising the
values. Write a function for validation of the date. If date is not valid display proper
message
'''

class CustomDate():
    def __init__(self,day,month,year) :
        self.day=day
        self.month=month
        self.year=year

    def validate(self):
        if self.isYear() and self.isMonth() and self.isDay():
            print("Date is Correct")
        else:
            print("Invalid Date")

    def isLeapYear(self):
        if self.year % 4 == 0:
            if self.year % 100 != 0 or self.year % 400 == 0:
                return True
        else: return False

    def isYear(self):
        if self.year>=1 and self.year<=9999:
            return True
        else: return False
            
    def isMonth(self):
        if self.month >=1 and self.month<=12:
            return True
        else: return False

    def isDay(self):
        feb=28
        if self.isLeapYear():
            feb=29

        match(self.month):
            case 1, 3, 5, 7, 8, 10, 12:
                return self.day>=1 and self.day<=31
            case 2:
                return self.day>=1 and self.day <= feb
            case default:
                return self.day >= 1 and self.day <= 30

def main():
    mdate=CustomDate(day=10,month=8,year=2023)
    mdate.validate()

main()