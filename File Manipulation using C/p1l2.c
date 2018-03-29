#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
#include<string.h>
int main()
{
char str[100];
int i,n,flag=0;


printf("\nEnter the String:");
fgets(str,100,stdin);
n=strlen(str)-1;
printf("%d",n);
if(str[0]=='a' && str[1]=='b')
{
	for(i=2;i<n;i++)
	{
	if(str[i]!='b')
	{
		printf("\nNot Accepted.");
		flag=1;
		break;
	}
	}
	if(flag==0)
	{
		printf("\nAccepted");
	}
}
else
printf("\nNot Accepted.");

return 0;
}
