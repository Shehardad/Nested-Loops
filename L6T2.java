import java.util.Scanner;
public class L6T2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Input: ");
    do {
        n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    } while(n != 0);
sc.close();
    }
    
}
