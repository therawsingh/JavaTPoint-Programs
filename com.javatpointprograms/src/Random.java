public class Random {

    public int ran(){

        java.util.Random r = new java.util.Random();
        return r.nextInt(500);

    }

    public static void main(String[] args) {

        Random obj = new Random();

        System.out.println(obj.ran());
    }

}
