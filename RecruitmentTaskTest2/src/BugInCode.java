public class BugInCode {
    ////2 44:25
    public static void main(String[] args){
        System.out.println("The sum: " + calcSumArray(new int[]{10, 1, 2, 3, 4, 5, -1, -3}));
    }
    public static int calcSumArray(int[] arr){
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }
}
