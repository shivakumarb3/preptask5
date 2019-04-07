import java.util.*;
class queuestacks
{
  public static void main(String args[])
  {
    Scanner as=new Scanner(System.in);
	int s1[]=new int[100000+1];int tos1=-1;
	int s2[]=new int[100000+1];int tos2=-1;
	int q=as.nextInt();
	for(int i=0;i<q;i++)
	{
		 int a=as.nextInt();
		 if(a==1)
	      s1[++tos1]=as.nextInt();
	     if(a==2)
		 {
			  if(tos2==-1)
			  {
				  while(tos1!=-1)
				  {
					  s2[++tos2]=s1[tos1];
					  tos1--;
				  }
			  }
			  //delete the element
			  tos2=tos2-1;
		 }
		 if(a==3)
		 {
			 if(tos2==-1)
			  {
				  while(tos1!=-1)
				  {
					  s2[++tos2]=s1[tos1];
					  tos1--;
				  }
			  }
			  //print the first element in queue
			  System.out.println(s2[tos2]);
		 }
	}
  }
}
			 
				  
	
	