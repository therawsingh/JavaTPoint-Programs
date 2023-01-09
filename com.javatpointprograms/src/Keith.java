public class Keith {

    public void keith(int num) {

        int a[] = new int[3];

        a[0] = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)));
        a[1] = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(1)));
        a[2] = Integer.parseInt(String.valueOf(String.valueOf(num).charAt(2)));

        int res = 0;
        boolean found = false;
        while (res <= num) {

            int sum = a[0] + a[1] + a[2];
            if (sum == num) {
                found = true;
                System.out.println(num + " is a Keith number");
                break;
            } else {

                a[0] = a[1];
                a[1] = a[2];
                a[2] = sum;
                res = sum;
            }

        }

        if (!found) {
            System.out.println(num + " is not a Keith number");
        }

    }

    public static void main(String[] args) {

        Keith obj = new Keith();

        obj.keith(742);

    }

}
