import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }

        System.out.print(average(arr));
    }
    public static int average(int[] arr){
        int sum = 0;
        int len = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                len++;
                sum += arr[i];
            }
        }
        return sum/len;
    }
}
