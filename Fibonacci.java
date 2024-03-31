public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Change this to the desired number of terms in the series

        System.out.println("Fibonacci Series for " + n + " terms:");
        int firstTerm = 0, secondTerm = 1;
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
