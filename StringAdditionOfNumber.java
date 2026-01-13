import java.util.Scanner;
public class StringAdditionOfNumber{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter String line abc457hdjd799: ");
	  String data=sc.nextLine();
	  int sum=0;
	  for(int i=0;i<data.length();i++)
	  {
	     char ch=data.charAt(i);
		 if(ch>='0' && ch<='9')
		 {
		 int ascii=(int)ch;
		 int num=ascii-48;
		 sum=sum+num;
	  }
   
   }
   System.out.println("sum is: "+sum);
}
}