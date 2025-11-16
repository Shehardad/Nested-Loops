import java.util.*;
public class L6T3 {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int n;
    int o;
    System.out.print("Input: ");
    n = sc.nextInt();
    o = n;
    int i = 0;
    do {
        n = sc.nextInt();
        
        
        if (n > o) {
            i++;
            
        }
        o = n;
    } while(n != 0);
    System.out.print("Output:" + i);
sc.close();
    }
}
