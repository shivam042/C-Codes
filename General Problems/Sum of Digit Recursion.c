#include<stdio.h>
int digSum(int n)
{
	if(n/10==0)
		return n;
	else
		return((n%10)+digSum(n/10));	
}

int main()
{
	int num,sum=0;
	printf("Enter the number:");
	scanf("%d",&num);
	printf("\nSum:  %d",digSum(num));
	return 0;
}
