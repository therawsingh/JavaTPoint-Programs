public class Automorphic {

    public void auto(int num){

        int length = String.valueOf(num).length();
        int square = num*num;

        if(String.valueOf(square).substring(String.valueOf(square).length()-length).equals(String.valueOf(num))){
            System.out.println(num + " is an Automorphic number");
        }
        else{
            System.out.println(num + " is not an Automorphic number");
        }

    }

    //test

    public static void main(String[] args) {

        Automorphic obj = new Automorphic();

        obj.auto(25);

    }

}
