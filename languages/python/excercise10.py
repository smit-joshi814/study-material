name1=input("Enter your Name : ").lower()
name2=input("Enter your Crush name: ").lower()

trueS="true"

count_t=0

for i in trueS:
    count_t+=name1.count(i)
    count_t+=name2.count(i)

loveS="love"
count_l=0
for i in loveS:
    count_l+=name1.count(i)
    count_l+=name2.count(i)

score=int(str(count_t)+str(count_l))

if score< 10 and score>90:
    print("Your score is",score,"You will go like a Shiv and parvati")
elif score >=40 and score <= 50:
    print("your score is",score,"You are Alright together")
else:
    print("your score is",score)





