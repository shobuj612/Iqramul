public class MyConstructor {

    int x;
    int y;

    int a;

    int b;

    // first constructor
    MyConstructor() {

        x = 10;
        y = 20;
    }

    // this is second constructor

    MyConstructor(int p, int q) {

        System.out.println("dfdfd" + (p + q));
    }

    public int bangladesh(int p, int q) {

        return p * q;
    }

    public static void main(String[] args) {

        MyConstructor myConstructor = new MyConstructor();

        MyConstructor myConstructor2 = new MyConstructor(20, 30);

        System.out.println(myConstructor.x);

        System.out.println(myConstructor.y);

        System.out.println(myConstructor.a);

        System.out.println(myConstructor.b);

        System.out.println("this is bangladesh menthod" + " "
                + myConstructor2.bangladesh(12, 25));

        /*
         * echo "# Iqramul" >> README.md
         * git init
         * git add README.md
         * git commit -m "first commit"
         * git branch -M main
         * git remote add origin https://github.com/shobuj612/Iqramul.git
         * git push -u origin main
         * 
         */

    }
}
