public class Sorting {
    //this program takes in an array and returns a sorted array

    public static int[] sort(int[] array){
        boolean swapped = true;
        int N = array.length;
        while(swapped){
            swapped = false;
            for(int i = 0; i < N-1; i++){
                if(array[i]> array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]= temp;
                    swapped = true;
                }
            }

        }

        return array;
    }
}
