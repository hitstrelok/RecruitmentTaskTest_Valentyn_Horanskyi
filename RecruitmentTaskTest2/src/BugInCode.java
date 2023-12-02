public class BugInCode {

    public static void main(String[] args){
        System.out.println("The sum: " + calcSumArray(new int[]{10, 9000, 1, 3, 4, 5, -1, -3, 5, 7, 9, -4}));
    }
    public static int calcSumArray(int[] arr){
        int result = 0;
        for (int i=0; i<arr.length; i++) { // The bug was here when "for (int i=1; i<arr.length; i++)"
            result += arr[i];               // i cannot be 1 because in this case it will avoid first element of an array
        }
        return result;
    }
}
