public class MyCons{

    int x;
    int y;

    int sum;

   // double mySum;

    MyCons(){

        x=10;
        y=20;
    }


    MyCons(int p,int q){

         sum=p*q;

         System.out.println("this is from 47 second constructor"+" "+sum);
    }


    MyCons(double b,double c){

        double mySum =b+c;

        System.out.println("this is from 33 third constructor"+" "+mySum);
    }

    public static void main(String[] args) {

        MyCons m1=new MyCons();

        MyCons m2=new MyCons(10,12);

        MyCons m3=new MyCons(12.2d,15.12d);

       System.out.println("this is value of x:"+" "+m1.x);

       System.out.println("this is value of x:"+" "+m1.y);

       System.out.println("this is value of second constructor"+" "+m1.sum);

     //  System.out.println("this is the third constructor"+m1.mySum);
       System.out.println("this is value of x:"+" "+m2.x);

       System.out.println("this is value of x:"+" "+m2.y);

       System.out.println("this is value of second constructor"+" "+m2.sum);

      // System.out.println("this is the third constructor"+m2.mySum);
       System.out.println("this is value of x:"+" "+m3.x);

       System.out.println("this is value of x:"+" "+m3.y);

       System.out.println("this is value of second constructor"+" "+m3.sum);

       //System.out.println("this is the third constructor"+m3.mySum);

         

        
    }
}