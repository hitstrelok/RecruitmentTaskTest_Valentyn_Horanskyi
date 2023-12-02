import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int n=15;
        int[] array = new int[n];


        if(n%2==0) {
            for (int i = 0; i < n - n / 2; i++) {
                array[i] = (int) (Math.random() * 99);
                array[i+(n/2)]= array[i]*(-1);
            }
        }
        if(n%2==1){
            for (int i = 0; i < n - (n/2+1); i++) {
                array[i] = (int) (Math.random() * 99);
                array[n/2+1+i]= array[i]*(-1);
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
