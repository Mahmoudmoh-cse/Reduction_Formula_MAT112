import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("array size");


        System.out.println("choose 1 for sin ,2 for tan or 3 for sec");
        int choose = input.nextInt();
        if (choose!=1 && choose!=2 && choose!=3 ){System.out.println("WRONG INPUT");}
        else {
            switch (choose) {
                case (1):
                    System.out.println("ENTER THE POWER");
                    int n = input.nextInt();
                    int[] sinarray=new int[n];
                    if (n % 2 == 0) {
                        System.out.println("THE POWER IS EVEN");
                        for (int i = n; i - 2 >= 0; i = i - 2) {
                            System.out.print("((sin(x)^" + (i - 1) + "*cos(x))/" + i + " +" + (i - 1) + "/" + i + ")");

                        }
                    } else if (n % 2 != 0) {
                        System.out.println("THE POWER IS ODD");
                        for (int i = n; i >= 1; i = i - 2) {
                            System.out.print("((sin(x)^" + (i - 1) + "*cos(x))/" + i + " +" + (i - 1) + "/" + i + ")");
                        }
                    }
                    break;
                case (2):
                    System.out.println(" ENTER THE POWER");
                    int d = input.nextInt();
                    if (d % 2 == 0) {
                        System.out.println("THE POWER IS EVEN");
                        for (int i = d; i - 2 >= 0; i = i - 2) {
                            System.out.print("(tan(x)^" + (i - 1) + ")/" + (i - 1) + " - " );
                        }
                    } else if (d % 2 != 0) {
                        System.out.println("odd power for tan");
                        for (int i = d; i >= 1; i = i - 2) {
                            System.out.print("(tan(x)^" + (i - 1) + ")/" + (i - 1) + "-" );
                        }
                    }
                    break;
                case (3):
                    System.out.println("put valu for the power");
                    int c = input.nextInt();
                    if (c % 2 == 0) {
                        System.out.println("eveen power for sec");
                        for (int i = c; i - 2 >= 0; i = i - 2) {
                            System.out.print("(tan(x)*sec(x)^"+(i-2)+")/"+(i-1)+" +"+(i-2)+"/"+(i-1)+" *");
                        }
                    } else if (c % 2 != 0) {
                        System.out.println("odd power for sec");
                        for (int i = c; i > 1; i = i - 2) {
                            System.out.print("(tan(x)*sec(x)^"+(i-2)+")/"+(i-1)+"+"+(i-2)+"/"+(i-1));
                        }
                    }
                    break;
            }
        }

    }
}