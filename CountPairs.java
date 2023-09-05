//  Count pairs with given sum
import java.util.*;

public class Harshita {
    public static void main(String[] args) {
        int N = 4, K = 6;
        int arr[] = {1, 5, 7, 1};

     //   int N = 4, K = 2;
      //  int arr[] = {1, 1, 1, 1};
        int cnt=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==K){
                    cnt++;
                }
            }
        }
        System.out.println("Pairs with given sum "+cnt);
}
}
