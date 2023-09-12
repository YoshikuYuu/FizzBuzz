public class Multiples {
    public static void main(String[] args) {
        int multiplesOf3Or5 = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            if (divBy3 || divBy5) {
                multiplesOf3Or5++;
            }
        }
        System.out.println(multiplesOf3Or5);

    }
}
