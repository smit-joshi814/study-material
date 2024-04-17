# Write a python program to find input string is alphabet,numeric and
# alphanumeric or is space.



testString=input("Enter Something... ")

print(f"{testString} is Alphabet: {testString.isalpha()}")
print(f"{testString} is Numeric: {testString.isnumeric()}")
print(f"{testString} is Alpha Numeric: {testString.isalnum()}")
print(f"{testString} is Space: {testString.isspace()}")