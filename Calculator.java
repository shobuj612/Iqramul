import java.util.*;

public class Calculator {

    public static void main(String[] iqram){

         Scanner sc=new Scanner(System.in);
        
         System.out.println("enter the first number");
         int m=sc.nextInt();

         System.out.println("enter the second number");
         int n=sc.nextInt();

         System.out.println("enter the operational number");

         int p=sc.nextInt();

        int add=m+n;
        int sub=m-n;
        int mul=m*n;
        int  div=m/n;

        if (p==1) {

            System.out.println("add the two number is: "+add );
            
        }

        else if (p==2) {

         System.out.println("subtract the two number: " +sub);
               
    }
        else if (p==3) {

            System.out.println("multiplication the two number: " +mul);
               
    }
        else   {
        
            System.out.println("divide the two number:" +div);
               
    }

    sc.close();
}
}