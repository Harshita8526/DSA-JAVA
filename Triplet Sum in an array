import java.util.*;
public class Triplet {
    public static void main(String[] args) {

        int n = 5, X = 10;
        int arr[] = {1 ,2, 4, 3 ,6};
        int a[]=new int[3];
        int c=0;

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==X){
                        a[0]=arr[i];
                        a[1]=arr[j];
                        a[2]=arr[k];
                        c++;
                    }
                }
            }
        }
        System.out.println("Triplet count is "+c);
        for(int b=0;b<a.length;b++){
            System.out.print(a[b]+" ");

        }
    }
}
