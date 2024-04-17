
alphabet=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

def encryption(plain_text,shift_key):
    cipher_text=""
    for char in plain_text:
        position=alphabet.index(char)
        position=(position+shift_key)%26
        cipher_text+=alphabet[position]
    print("Encrypted Message is:",cipher_text)

def decryption(cipher_text,shift_key):
    plain_text=""
    for char in cipher_text:
        position=alphabet.index(char)
        position=(position-shift_key)%26
        plain_text+=alphabet[position]
    print("Decrypted Message:",plain_text)


again='yes'
while again=='yes':
    perform=input("type 'encrypt' for encryption, type 'decrypt' for decryption: ")
    message=input("Type your Message: ")
    shift=int(input("Type shift Number: "))

    if perform=='encrypt':
        encryption(message,shift)
    elif perform=='decrypt':
        decryption(message,shift)
    else:
        print("Please enter Correct Choice")
        
    again=input("Do you want to procees again 'yes' / 'no' ")