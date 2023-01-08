public class Factorial {

    public void fact(int num) {

        long f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {

        Factorial obj = new Factorial();

        obj.fact(5);

    }

}
