package lap04;

public class RunningNumberSequence {
    public static String runningNumberSequence(int n) {
        if ( n < 1) {
            return "Error!";
        }
        if (n == 1) {
            return "1";
        }
        return runningNumberSequence(n - 1) + n;
    }

    public static int len(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return len(n - 1) + (n + "").length();
    }

    public static void main(String[] args) {
        int num = 12;
        
        if ( num < 0) {
            System.out.println(runningNumberSequence(num));
            System.out.println(len(num));
        } else {
            System.out.println("S(" + num + ") = " + runningNumberSequence(num));
            System.out.println("S(" + num + ") length is " + len(num));
        }

    }
}
