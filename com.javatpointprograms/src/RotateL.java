public class RotateL {

    public void rotate(int n) {

        int a[] = {1, 2, 3, 4, 5};

        int temp;

        for (int j = 1; j <= n; j++) {
            temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i-1] = a[i];
            }
            a[a.length-1] = temp;
        }

        for(int i : a){
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        RotateL obj = new RotateL();

        obj.rotate(4);

    }

}
