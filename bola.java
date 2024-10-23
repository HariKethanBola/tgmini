import java.util.*;

class Bola {
    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        n = obj.nextInt();
        
        for (int i = 0; i < n; i++) 
        {
            if (i % 2 == 0) 
            {
                System.out.printf("%d\n", i);
            }
        }
    }
}
