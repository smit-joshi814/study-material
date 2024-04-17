sub_list1=['😊','😊','😊']
sub_list2=['😊','😊','😊']
sub_list3=['😊','😊','😊']
main_list=[sub_list1,sub_list2,sub_list3]

hide_money=int(input("Enter location to hide your money: "))

row=int(hide_money/10)
column=int(hide_money%10)

row_selected=main_list[row-1]
row_selected[column-1]='💵'

print(f"{sub_list1}\n{sub_list2}\n{sub_list3}")
