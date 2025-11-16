import java.util.*;

public class L6T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        System.out.print("Enter first day of the year(1 = Sun ... 7 = Sat): ");
        int first = sc.nextInt();
        int days_mnth;

        for (int m = 1; m <= 12; m++) {
            System.out.println();
            System.out.println();
            System.out.println();
            switch (m) {
                case 1:
                    System.out.println("        January  " + y);
                    break;
                case 2:
                    System.out.println("        February  " + y);
                    break;
                case 3:
                    System.out.println("          March  " + y);
                    break;
                case 4:
                    System.out.println("          April  " + y);
                    break;
                case 5:
                    System.out.println("           May  " + y);
                    break;
                case 6:
                    System.out.println("          June  " + y);
                    break;
                case 7:
                    System.out.println("          July  " + y);
                    break;
                case 8:
                    System.out.println("        August  " + y);
                    break;
                case 9:
                    System.out.println("        September  " + y);
                    break;
                case 10:
                    System.out.println("        October  " + y);
                    break;
                case 11:
                    System.out.println("        November  " + y);
                    break;
                case 12:
                    System.out.println("        December  " + y);
                    break;

                default:
                    break;
            }
            System.out.println("---------------------------------");
            System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

            if (m == 2) {
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                    days_mnth = 29;
                } else {
                    days_mnth = 28;
                }

            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                days_mnth = 30;
            } else {
                days_mnth = 31;
            }

            for (int space = 1; space < first; space++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= days_mnth; day++) {
                System.out.printf("%4d", day);

                if ((first + day - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            first = (first + days_mnth) % 7;
            if (first == 0) {
                first = 7;
            }

        }
        sc.close();
    }
}
