'''
Create a dictionary with key as country and their capitals as values with 5 countries spain,
france, germany, norway. Perform the following operations on this dictionary.
(i) Print the capital of germany
(ii) Remove norway and its capital from dictionary
(iii) Take one country from user and print the capital if it is present else print it is not present
in the dictionary.
(iv) Add India with capital in the dictionary
'''

country={
	"capitals":{
		"spain":"Madrid",
		"france":"Paris",
		"germany":"Berlin",
		"norway":"Oslo"
	}
}

print(country["capitals"]["germany"])
del country["capitals"]["norway"]
print(country)


u_in=input("Enter Country ")
for i in country["capitals"]:
	if u_in==i:
		print(f"{i}:{country['capitals'][i]}")
		break
else:
	print("it is not present in the dictionary")


country["capitals"]["india"]="delhi"

print(country)