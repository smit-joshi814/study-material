# Write a program to split the input data into rupees and paisa (For eg. INPUT
# 59.47 as Rs 59 and 47 paisa ).

number=input("Enter Money: ")
money=number.split('.')
print(f"rupees: {money[0]} and paisa: {money[1]}")

