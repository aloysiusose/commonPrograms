public class StringReversal {
    //This program takes in a string and reverse the characters

    public static String reverse(String string){
        int N = string.length();
        String str = "";

        for(int i = N-1; i >0; i--){

            str = str+ string.charAt(i);
        }

        return str;
    }
}
