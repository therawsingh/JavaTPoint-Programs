import java.util.HashSet;

public class Duplicate {

    public void dup(){

        int a[] = {1,2,3,4,2,7,8,8,3,1};

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dhs = new HashSet<>();

        for(int i : a){
            if(!hs.add(i)){
                dhs.add(i);
            }
        }

        for(int i : dhs){
            System.out.println(i + " is duplicate");
        }

    }

    public static void main(String[] args) {

        Duplicate obj = new Duplicate();

        obj.dup();

    }

}
