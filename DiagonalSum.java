import java.util.*;
public class DiagonalSum{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int m = sc.nextInt();
        System.out.print("Enter number of column : ");
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        //for sum of square of each diagonal element
        int min = m;
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter values at "+i+" "+j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given metric is : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        if(m != n){
            System.out.println("Metric is not a square metric\nSum of square of partial diagonal ");
            if(n<min){
                min = n;
            }
        }
        
        for(int i=0;i<min;i++){
            for(int j=0;j<min;j++){
                sum = sum + a[i][j]*a[i][j];
            }
        }
        System.out.println("Sum of square of each diagoal element = "+sum);
        

    }
}
