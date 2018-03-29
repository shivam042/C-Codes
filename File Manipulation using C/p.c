#include<stdio.h>
int main()
{
      FILE *fp;
      char ch;
      int i,pos;
      fp=fopen("file.txt","r");
      if(fp==NULL)
      {
            printf("File does not exist..");
      }
      
	//pos=fseek(fp,i,SEEK_SET);;
       i=0;
        while(ch!=EOF)
         {
            
            fseek(fp,i,SEEK_SET);
            
            ch=fgetc(fp);
            printf("%c",ch);
	    i++;      
}
      return 0;
}
