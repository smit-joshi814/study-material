#include<stdio.h>
#include<conio.h>
main()
{
	int eno[3],i,n,basic[5],da[5],hra[5],ma=100,pf[3],gross[6],n_pay[6];
	FILE*p;
	char name[20];
	clrscr();
	printf("how many no you want to enter");
	scanf("%d",&n);
	p=fopen("edata","w");
	for(i=1;i<=n;i++)
	{
	scanf("%d%s%d",&eno[i],name[i],basic[i]);
	da[i]=basic[i]*0.5;
	hra[i]=basic[i]*0.1;
	pf[i]=basic[i]*0.1;
	gross[i]=basic[i]*da[i]*hra[i]+ma;
	n_pay[i]=gross[i]-pf[i];
	fprintf(p,"%d\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d",eno[i],name[i],basic[i],ma,pf[i],gross[i],n_pay[i]);
	}
fclose(p);
getch();
return 0;
}