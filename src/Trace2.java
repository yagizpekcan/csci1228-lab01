public class Trace2 {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 5; i++) {
            total += i;
        }
        System.out.println(total);

        int n = 5;
        while (n > 0) {
            n = n - 2;
        }
        System.out.println(n);
    }
}
