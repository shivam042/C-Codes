/*Shivam Tripathi Checking whether words in a file are identifiers*/
/*IMPORTANT*/
#include<stdio.h>
#include<string.h>
int main()
{
	int count=0;
	FILE *fp;
	char fil[100],ch,str[100];
	printf("Enter the filename for reading:");
	scanf("%s",fil);
	fp=fopen(fil,"r");
	/*while((ch=getc(fp))!=EOF)
		printf("%c",ch);*/
	

		
		fscanf(fp,"%[^\n]s",str);
				
	//	count++;
	//	int len=strlen(str);	
		fputs(str,stdout);
		//printf("\nPosition: %ld \n",ftell(fp));		
		//printf("\nLength: %d \n",len);
	//		}while(!feof(fp));

	printf("No of lines: %d",count);	
	printf("\n-----End----");
	fclose(fp);
	
	return 0;	
}
