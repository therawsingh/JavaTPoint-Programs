public class Sunny {

    public void sun(int num){

        int n1 = num + 1;

        double sqrt1 = Math.sqrt(n1);
        int sqrt2 = (int)Math.sqrt(n1);

        if(sqrt1 == sqrt2){
            System.out.println(num + " is a Sunny number");
        }

    }

    public static void main(String[] args) {

        Sunny obj = new Sunny();

        obj.sun(10);

    }

}
