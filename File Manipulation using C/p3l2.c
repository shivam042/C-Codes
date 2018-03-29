#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
#include<string.h>
int check_abstar(char *str,int n)
{
int i,flag=0;

if(str[n-1]=='b')
{
	for(i=0;i<n-1;i++)
	{
	if(str[i]!='a')
	{
		flag=1;
		return 0;
	}
	}
	if(flag==0)
	{
		return 1;
	}
}
else
return 0;
}
int check_astarb(char *str,int n)
{
int i,flag=0;

if(str[0]=='a')
{
	for(i=1;i<n;i++)
	{
	if(str[i]!='b')
	{
		flag=1;
		return 0;
	}
	}
	if(flag==0)
	{
		return 1;
	}
}
else
return 0;
}


int main()
{
char str[100];
int i,n,temp1,temp2;


printf("\nEnter the String:");
fgets(str,100,stdin);
n=strlen(str)-1;

temp1=check_abstar(str,n);
temp2=check_astarb(str,n);
if((temp1==1 && temp2==0)||(temp1==0 && temp2==1)||(temp1==1 && temp2==1))
printf("\nValid");
else
printf("\nNot Valid");

return 0;
}
