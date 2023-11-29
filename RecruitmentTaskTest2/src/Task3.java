import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {
    ////3 20:00
    public static void main(String[] args) {
        int n=6;
        int result=1;
        int[] array = new int[n];

        while(true) {
            if(result==0){
                System.out.println(Arrays.toString(array));
                return;
            }
            result=0;
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 99) + (int) (Math.random()* (-99));
                result += array[i];
                for (int j = 0; j < n; j++){
                    if(array[i]==array[j]){
                        array[i]+=1;
                    }
                }
            }
        }
    }
}
