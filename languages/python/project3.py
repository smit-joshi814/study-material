import random

word_list=["tejasv","smit","tabbssum","rahil","switi","nisha","tanish","vanish","umang"]
random.shuffle(word_list)
word_element_list=[]
chosen_word=random.choice(word_list)

for i in range(len(chosen_word)):
    word_element_list+="_"

# print(chosen_word)

print(word_element_list)
lives=6
game_over=False

while not game_over:
    gussed_latter=input("Guss a latter: ").lower()
    for i in range(len(chosen_word)):
        if gussed_latter==chosen_word[i]:
            word_element_list[i]=gussed_latter
    print(word_element_list)
    if gussed_latter not in chosen_word:
        lives-=1
        print("Lives Remaining: ",lives)
        if lives==0:
            game_over=True
            print("You Loose it was",chosen_word)
    if '_' not in word_element_list:
        game_over=True
        print("You Win")