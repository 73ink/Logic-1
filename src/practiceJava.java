public class practiceJava {
    // start of main method
    public static void main(String[] args) {
    // task-1
        System.out.println(cigarParty(30, false)); // false

    }
    // end of main method
    //start of sub-methods
    // task-1 method
    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
        }

        return false;
    }
}
