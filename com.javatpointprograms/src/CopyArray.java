import java.io.IOException;
import java.io.*;

public class CopyArray {

    public void cpyarr() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of array");
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter elements of array to be copied");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        /* for(int i = 0; i < n; i++){
            b[i] = a[i];
        } */

        System.arraycopy(a, 0, b, 0, n);

        System.out.println(a);
        System.out.println(b);

    }




    public static void main(String[] args)throws IOException {

        CopyArray obj = new CopyArray();

        obj.cpyarr();

    }

}
