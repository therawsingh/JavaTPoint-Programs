public class Fibonacci {

    int a, b, c;

    Fibonacci() {
        a = 0;
        b = 1;
        System.out.println(a);
        System.out.println(b);
    }

    //finds first 10 fibonacci numbers
    public void fib() {


        for (int i = 0; i <= 10; i++) {
            c = a + b;
            System.out.println(a + b);
            a = b;
            b = c;
        }

    }


    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();

        obj.fib();

    }

}
