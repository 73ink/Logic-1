public class practiceJava {
    // start of main method
    public static void  main(String[] args) {
    // task-1
//    practiceJava t1 = new practiceJava();
//    System.out.println(t1.cigarParty(30, false)); // false
    // task-2
        practiceJava t2 = new practiceJava();
        System.out.println(t2.caughtSpeeding(65, true));
    // task-3
    // task-4
    // task-5
    // task-6
    // task-7
    // task-8
    // task-9
    // task-10
    // task-11
    // task-12
    // task-13
    // task-14
    // task-15
    }
    // end of main method
    //start of sub-methods
    // task-1 method
    public boolean cigarParty(int cigars, boolean isWeekend) {

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
    public int caughtSpeeding (int speed, boolean isBirthday){
        if (isBirthday){
            if (speed <= 65){
                return 0 ;
            } else if (speed >=66 && speed <=85) {
                return 1 ;
            } else { return 2; }
        }
        else {
            if (speed <= 60){
                return 0 ;
            } else if (speed >=61 && speed <=80) {
                return 1 ;
            } else { return 2; }
        }
        }

}
