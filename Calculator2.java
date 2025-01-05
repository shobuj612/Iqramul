import java.util.*;

public class Calculator2 {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();

        //System.out.print("+");
        
        int b=sc.nextInt();

        int c=calculaor(a, b);
        int d=calculaor1(a, b);
        int e=calculaor2(a, b);
        int f=calculaor3(a, b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        sc.close();
    }

         public static int calculaor(int a,int b){

            return a+b;
         }
         public static int calculaor1(int a,int b){

            return a-b;
         }
         public static int calculaor2(int a,int b){

            return a*b;
         }
         public static int calculaor3(int a,int b){

            return a/b;
         }


}
