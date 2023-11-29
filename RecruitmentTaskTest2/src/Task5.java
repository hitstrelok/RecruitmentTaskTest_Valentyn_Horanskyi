public class Task5 {
    ///5
    public static void main(String[] args) {
        System.out.println((repFirstChar("test")));
    }
    public static String repFirstChar(String s){
        char c = s.charAt(0);
        boolean check;
        check=Character.isUpperCase(c);
        if(check){
            return "upper";
        }
        check =Character.isLowerCase(c);
        if(check){
            return "lower";
        }
        check =Character.isDigit(c);
        if(check){
            return "digit";
        }
        else{
            return "other";
        }

    }


}
