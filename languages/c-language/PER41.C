#include<stdio.h>
//#include<conio.h>
int main()
{
int r,s1,s2,s3,t,n,i;
char name,c;
float per;
FILE *p;
//clrscr();
printf("how many number you want ro enter ?");
scanf("%d",&n);
printf("\nRoll no\tname\tSub1\tsub2\tsub3\n");
p=fopen("Data","w");
for(i=1;i<=n;i++)
{
	scanf("%d %s %d %d %d",&r,name,&s1,&s2,&s3);
	t=s1+s2+s3;
	per=t/3;
	if(per>=70)c='a';
	else if(per>=60&&per<70)c='b';
	else if(per>=50&&per<60)c='c';
	else c='d';
	fprintf(p,"\n%d\t%s\t%d\t%d\t%d\t%d\t%2f\t%c",r,name,s1,s2,s3,t,per,c);
}
fclose(p);
//getch();
return 0;
}


