 public class Main {
        public static void main(String[] args) {
            int numberMax = 0;
            int[] tab1 = {2, -5, -3, 5, 3, -2};

            for (int t = 0; t < tab1.length; t++) {
                for (int j = 0; j < tab1.length; j++) {
                    if (tab1[t] > numberMax && tab1[t] == Math.abs(tab1[j]) && tab1[j]<0) {
                        numberMax = tab1[t];
                    }
                }
            }
            for (int i = 0; i < tab1.length; i++) {
                for (int k : tab1) {
                    if ((Math.abs(tab1[i]) == Math.abs(k) && tab1[i] != k) && tab1[i] >= 0 && Math.abs(tab1[i])==numberMax) {
                        System.out.println(tab1[i]);
                        System.out.println(k);
                        return;
                    }

                }
            }
            System.out.println("lack of pair");
        }

}


