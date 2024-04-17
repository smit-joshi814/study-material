#include<stdio.h>

int main(){
    int a[10],n=10,i,find;
    
    for(i=0;i<n;i++){
    printf("Enter %d element ",i+1);
    scanf("%d",&a[i]);
    }
    printf("\n Enter element you want to find ");
    scanf("%d",&find);
    
    for(i=0;i<n;i++){
        if(a[i]==find){
            printf("Element Found");
            break;
        }
    }
    if(a[i]!=find){
        printf("Element Not exist");
    }
    
    return 0;
}
