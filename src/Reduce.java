public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n != 0) {
            n = ReduceStep(n);
            steps++;
        }
        System.out.println(steps);
    }

    public static int ReduceStep(int n) {
        if (n % 2 == 0) {
            return n / 2;
        }
        else {
            return n - 1;
        }
    }
}
