#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
#include<string.h>
#include<ctype.h>
int main()
{
char str[100];
int i,n,flag=0;
printf("\nEnter the String:");
fgets(str,100,stdin);
n=strlen(str)-1;
if(isalpha(str[0]) || isdigit(str[0]))
{
	for(i=1;i<n;i++)
	{
		if(!isalpha(str[i]) && !isdigit(str[i]) && str[i]!='_')
		{

			flag=1;			
			printf("\nNot Valid String");
			break;
		}

	}	
	if(flag==0){printf("\nValid String");}
	
}
else
printf("\nNot Valid String");
return 0;
}
