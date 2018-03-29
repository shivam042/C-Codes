#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
int check_identifier(char *str,int size)
{
int i=1,flag=0;

	if(str[0]=='_' || isalpha(str[0]))
	{
		for(i=1;i<size;i++){
			if(str[i]!='_' && !(isalpha(str[i])) && !(isdigit(str[i])))
			{flag=1;				
			return 0;}
		}	
	if(flag==0) return 1;
	}
	else
	return 0;

}
int main()
{
int i;
char str[100];
printf("\nEnter the string:");
fgets(str,100,stdin);

int len=strlen(str)-1;
int check=check_identifier(str,len);
if(check==0) printf("\nNOT Identifier");
else printf("\nYes Identifier");

return 0;
}
