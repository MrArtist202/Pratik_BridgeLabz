import java.util.*;
public class LongestLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int x4 = in.nextInt();

        int l1 = x2-x1;
        int l2 = x4-x3;

        if(l1 > l2){
            System.out.print(l1/2);
        }
        else{
            System.out.print(l2/2);
        }
    }
}
