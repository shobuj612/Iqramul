public class MultiplicationTable {
     public static void main(String[] args) {
        
        // dislplay table heading

        System.out.println("    MultiplicationTable");

        // Dispaly the number title

        System.out.print("");

        for(int j=1;j<=9;j++)

            System.out.print("    "+j);

            System.out.println("\n------------------------------------------------------");

            // displa table body

            for(int i=1;i<=9;i++){


                System.out.print(i + " | ");

                for(int j=1;j<=9;j++){

                    // display the product and the alignment properly

                    System.out.printf("%4d",i*j);
                }

                System.out.println();
            }
        }
     }

