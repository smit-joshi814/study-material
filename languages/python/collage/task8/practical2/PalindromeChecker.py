# is Pelendrom

def isPelendrome(num):
    rev=0
    temp=num
    while(temp>0):
        i=temp % 10
        rev= rev * 10 + i
        temp=temp//10

    if rev == num: return True 
    else: return False
    