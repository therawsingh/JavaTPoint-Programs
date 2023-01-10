public class Sort {

    public void sort() {

        int a[] = {5, 2, 8, 7, 1};
        int b[] = a;

        for (int i = 0; i < b.length; i++) {

            for (int j = i + 1; j < b.length; j++) {

                if (b[j] < b[i]) {

                    int temp;
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;

                }

            }

        }

        for (int k : b) {
            System.out.print(k + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Sort obj = new Sort();

        obj.sort();

    }

}
