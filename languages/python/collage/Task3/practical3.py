# Write a program to calculate number of seconds given by user into h:m:s.

seconds=int(input("Enter Seconds: "))
minutes=0
hour=0
for i in range(1,seconds):
    if i%60==0:
        minutes+=1
        if minutes>60:
            hour+=1
            minutes=0

seconds%=60
print(f"{hour}:{minutes}:{seconds}")
