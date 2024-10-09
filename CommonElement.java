import java.util.*;
public class CommonElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        int arr1[] = {1,2,3,4};
        int arr2[] = {2,3,6,7};

        ArrayList<Integer> elt = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    elt.add(arr1[i]);
                }
            }
        }
        System.out.print(elt);
    }

    // public static int common(int[]arr1, int[]arr2){
    //     ArrayList<Integer> elt = new ArrayList<>();
    //     for(int i=0;i<arr1.length;i++){
    //         for(int j=0;j<arr2.length;j++){
    //             if(arr1[i] == arr2[j]){
    //                 elt.add(arr1[i]);
    //             }
    //         }
    //     }
    //     return elt;
    // }
}
