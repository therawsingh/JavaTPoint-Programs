public class Largest {

    public void large() {

        int a[] = {25, 11, 7, 75, 566};

        int l = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < l) {
                l = a[i];
            }

        }

        System.out.println(l);


    }

    public static void main(String[] args) {

        Largest obj = new Largest();

        obj.large();

    }

}
