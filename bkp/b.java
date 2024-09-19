import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int total =0;
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
            total = total + arr2[i];
        }        
        int shift = total % n;
        
        if (shift < 0) {
            shift += n;
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[(i + shift) % n] = arr1[i];
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
