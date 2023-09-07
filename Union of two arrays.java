
import java.util.*;

class Hello{
    static ArrayList<Integer> Union(int arr1[], int arr2[], int n, int m) {
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > union=new ArrayList<>();
        for (int i = 0; i < n; i++){
            s.add(arr1[i]);
        }
        for (int i = 0; i < m; i++){
            s.add(arr2[i]);
        }
        for (int it: s){
            union.add(it);
        }
        return union;
    }
    public static void main(String args[]) {
        int n = 5, m = 6;
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = { 5, 11, 12,1,2,30};
        ArrayList<Integer> Union = Union(arr1, arr2, n, m);
        System.out.println("Union of is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}
