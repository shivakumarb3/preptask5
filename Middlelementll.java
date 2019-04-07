import java.util.*;
class Node
{
   int data;
   Node next;
   }
class Middlelementll
{
  public static void main(String args[])
  {
     Node head=null;Node dup=null;
	 
	 System.out.println("enter number of nodes");
	 Scanner as=new Scanner(System.in);
	 int n=as.nextInt();
	 for(int i=0;i<n;i++){
	 Node cn=createNode(as.nextInt());
	 if(head!=null){
	 head.next=cn;
	 head=cn;
	 }
	 else
	 {
	 head=cn;
	 dup=cn;
	 }
	 }
	 System.out.println("The middle element is"+middlenode(dup,n).data);
  }
	 static Node createNode(int d)
	 {
	     Node s=new Node();
		 s.data=d;
		 s.next=null;
		 return s;
	 
	 }
	 static Node  middlenode(Node head,int n)
	 {
		 Node slow=head,fast=head;
		 while(fast.next!=null&&fast.next.next!=null)
		 { 
		    slow=slow.next;
			fast=fast.next.next;
	    }
		if(n%2==0)
		return slow.next;//it gives higher mid
		//if we want lower mid just return slow;
		else
			return slow;
		
}
}
	 