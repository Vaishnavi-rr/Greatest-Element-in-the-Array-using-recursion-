import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int ans = maxelement(arr,0);
        System.out.println(ans);
    }

    public static int maxelement(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }

        int max = maxelement(arr,idx+1);
        if(max < arr[idx]){
            max = arr[idx];
        }
        return max;
    }
}
