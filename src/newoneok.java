public class newoneok {
    public class horrorStory {
        public static void main (String[] arg){

            String doOdwrucenia = "Czy tak sie da?";

            char[] newTable = doOdwrucenia.toCharArray();
            char[] transposition = new char[doOdwrucenia.length()];

            for(int i = 14, m = 0; i >= 0 ; i--, m++){

                transposition[m] = newTable[i];


            }
            System.out.println(transposition);


        }

    }

}
