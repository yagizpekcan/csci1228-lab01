public class Trace1 {

    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println(a / b);              // 3
        System.out.println(a / (double) b);     // 3.5
        System.out.println((double) (a / b));   // 3.0
        System.out.println(1 / 2 + 0.5);        //0.5
        System.out.println(0.1 + 0.2);          //0.3
    }
}
