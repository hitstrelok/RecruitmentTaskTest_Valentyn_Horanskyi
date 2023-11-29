import java.util.Arrays;

public class Task4 {
   ///4
    public static void main(String[] args) {
        int n=73647378;
        String result="";
        String number = String.valueOf(n);
        char[] arrayChar = new char[number.length()];
        int[] arrayFamily = new  int[number.length()];

        for(int i=0; i<number.length(); i++){
            arrayChar[i]=number.charAt(i);
            arrayFamily[i] = Character.getNumericValue(arrayChar[i]);
        }
        for(int i=1; i<arrayFamily.length; i++){
            for(int j=0; j<arrayFamily.length-i; j++){
                if(arrayFamily[j]<arrayFamily[j+1]){
                    int temp=0;
                    temp=arrayFamily[j+1];
                    arrayFamily[j+1]=arrayFamily[j];
                    arrayFamily[j]=temp;
                }
            }

        }
        number="";
        for(int i=0; i<arrayFamily.length; i++){
            number+=arrayFamily[i];
        }
        n=Integer.parseInt(number);
        System.out.println(n);
    }
}
