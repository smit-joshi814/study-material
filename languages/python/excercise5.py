# how many days, weeks and months we have left if we live 90 year old
# 1 year =365 days
# 1 year =52 weeks
# 1 year = 12 months

year=365
weeks=52
months=12
assumedAge=90
age=int(input("Enter your age "))
ageInWeeks=age*52
ageInMonths=age*months
ageInDays=age*year

daysLeft= assumedAge * year - ageInDays
weeksLeft=assumedAge * weeks - ageInWeeks
monthsLeft=assumedAge * months - ageInMonths

print(f"You have {daysLeft} days, {weeksLeft} weeks, and {monthsLeft} months Left")