public class PrimeNumber {
    //this program takes in a number and returns prime or not

    public static boolean Prime(int N) {

        if(N == 2) {
            return true;
        }
        else if (N == 1){
            return false;
        }
        else {
            for (int i = 2; i <= 9; i++) {
                int b = N % i;
                if (b == 0) {
                    return false;
                }

            }
            return true;
        }
    }
}

