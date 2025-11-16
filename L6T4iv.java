public class L6T4iv {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
