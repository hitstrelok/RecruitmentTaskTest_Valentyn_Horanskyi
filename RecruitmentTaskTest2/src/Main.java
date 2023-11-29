public class Main {
    ////1 55:00
    public static void main(String[] args) {
        String plus_minus="";
        int n=8;
        boolean flag=true;
        for(int i =1; i<=n;i++){
            if(flag==true){
                plus_minus+="+";
                flag=false;
            }
            else{
                plus_minus+="-";
                flag=true;
            }
        }
        System.out.println(plus_minus);


    }
}
