import java.util.*;
public class L6T1 {
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int n;
    
    n = sc.nextInt();
    System.out.print("Input: ");
    System.out.print(n + " ");
    int o = n;
    do {
        n = sc.nextInt();
        System.out.print(n + " ");

        if(n > o){
            o = n;
        }
    } while(n != 0);
    System.out.print("\t\tOutput: " + o);
    sc.close();
    

}    
}
