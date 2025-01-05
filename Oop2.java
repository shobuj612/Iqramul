public class Oop2 {
    

    public static void main(String[] args) {


        Oop2 object1=new Oop2();

        Oop2 object2=new Oop2(15,25);

        Oop2 object3=new Oop2(30,40);

         System.out.println("height is:"+" "+ object1.height+"and"+" "+"witdth is :"+ object1.width+ "area is:" +object1.getArea());

         System.out.println("height is:"+ object2.height+"and"+" "+"witdth is :"+ object2.width+"sum is:"+object2.sum+ "subtraction is:"+object2.sub+"area is:" +object2.getArea());

         System.out.println("height is:"+ object3.height+"and"+" "+"witdth is :"+ object3.width+ "sum is :"+object3.sum+"subtracition is :"+object3.sub+"area is:" +object3.getArea());
        

    }

   // this is the scope of class


   // they are all global or 

    int height;     //instance variable


    int  width ;     //instance variable

    int sum;        //instance variable

    int sub;         //instance variable

    // this is method special name is constructor


    Oop2(){
      
        height=10;

        width=20;

        
    }


    Oop2(int height1,int width1){

       //height1 and width1 is local vaiable

        height=height1;

        width=width1;

       sum=height+width;

       sub=height-width;
          
    }

         int getArea(){

        return height*width;
    }
}
