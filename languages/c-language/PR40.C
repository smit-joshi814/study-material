#include<stdio.h>
#include<conio.h>
int main()
{
int no,quantity,i;
float price;
char name[20];
FILE *f1;
//clrscr();
f1=fopen("smit","wt");
printf("name\tno\tprice\tquantity\n");
	for(i=1;i<3;i++)
	{
	fscanf(stdin,"%s%d%f%d",name,&no,&price,&quantity);
	fprintf(f1,"\t%s\t%d\t%f\t%d\n",name,no,price,quantity);
	}
	fclose(f1);
	printf("\n\titem name\t no\tprice\tquantity\n");
	fopen("smit","r");
	for(i=1;i<3;i++)
	{
	fscanf(f1,"%s%d%f%d",name,&no,&price,&quantity);
	fprintf(stdout,"\t%s\t%d\t%f\t%d\n",name,no,price,quantity);
	}
	fclose(f1);
	getch();
	return 0;
}
