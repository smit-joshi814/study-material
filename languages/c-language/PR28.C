#include<stdio.h>
#include<conio.h>
#include<string.h>
int main()
{
	int n,j,i;
	float a[100],t,median;
//	clrscr();
	printf("how many no do ou want to enter ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("\nEnter the no ");
		scanf("%f",&a[i]);
	}
	for(i=1;i<=n;i++)
	{

		for(j=1;j<=n;j++)
		{
			if(a[i]<=a[j])
			{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
			}
		}
	}
	if(n%2==0)
	median=(a[n/2]+a[(n/2)+1])/2;
	else
	median=a[(n/2)+1];
	printf("\n the median of given no is %5.2f ",median);
	getch();
	return 0;
}
