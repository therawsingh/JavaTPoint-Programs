import java.util.HashSet;

public class Frequency {

    public void freq(){

        int a[] = {1,2,8,3,2,2,2,5,1};

        HashSet<Integer> hs = new HashSet<>();

        for(int b : a){
            hs.add(b);
        }

        for(Integer i : hs){
            int count = 0;
            for (int k : a) {
                if (i == k) {
                    count++;
                }
            }
            System.out.println(i + " : " + count);
        }

    }

    public static void main(String[] args) {

        Frequency obj = new Frequency();

        obj.freq();

    }

}
