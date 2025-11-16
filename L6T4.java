import java.util.*;

public class L6T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean r = true;
        int rep;
        do {
            System.out.print("Enter the pattern you need to print(1-5): ");
            int c = sc.nextInt();
            if (c == 1) {
                int i;
                int j;
                for (i = 1; i <= 4; i++) {
                    System.out.println();
                    for (j = 1; j <= 10; j++) {
                        System.out.print("* ");
                    }
                }
            } else if (c == 2) {
                int i;
                int j;
                for (i = 1; i <= 5; i++) {
                    System.out.println();
                    for (j = 1; j <= i; j++)
                        System.out.print("*");
                }

            } else if (c == 3) {
                int i;
                int j;
                for (i = 1; i <= 5; i++) {
                    for (int k = i; k <= 5; k++) {
                        System.out.print(" ");
                    }
                    for (j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if (c == 4) {

                int i;
                int j;
                int k;

                for (i = 1; i <= 5; i++) {
                    for (j = i; j <= 5; j++) {
                        System.out.print(" ");
                    }
                    for (k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if (c == 5) {
                int i;
                int j;
                int k;

                for (i = 1; i <= 5; i++) {
                    for (j = i; j <= 5; j++) {
                        System.out.print(" ");
                    }
                    for (k = 1; k <= (2 * i - 1); k++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Invalid Input!");
                continue;
            }

            System.out.println("\n\nIf you want to print another pattern press 1 else press 0 to exit.");
            rep = sc.nextInt();
            if (rep == 1) {
                continue;
            } else if (rep == 0) {
                r = false;
            }
        } while (r);
        System.out.println("Program Exited!");
        sc.close();
    }

}
