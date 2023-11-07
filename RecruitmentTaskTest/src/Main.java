public class Main {
    public static void main(String[] args) {
        int numberMax=0;
        int numberMin=100;
        int[] tab1 = {3, 2, -2, 5, -3};
        int[] tab2 = {1, 1, 2, -1, 2, -1};
        int[] tab3 = {1, 2, 3, -4};
        int[] tab4 = {1, 1};

        for(int i=0; i<tab1.length;i++ ) {

            if(tab1[i]<numberMin){
                numberMin=tab1[i];
            }
            if(tab1[i]>numberMax){
                numberMax=tab1[i];
            }
            for (int k : tab1) {
                        if ((Math.abs(tab1[i]) == Math.abs(k) && tab1[i] != k) && tab1[i] >= 0) {
                            System.out.println(tab1[i]);
                            System.out.println(k);
                            return;
                        }

                }
            }
            System.out.println("lack of pair");
            return;
        }

}


