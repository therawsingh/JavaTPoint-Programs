public class Palindrome {

    public void pal(Integer num){

        System.out.println(new StringBuffer(num.toString()).toString()
                .equals(new StringBuffer(num.toString())
                        .reverse().toString()) ? num + " is Palindrome" : num + " is not palindrome");

    }

    public static void main(String[] args) {

        Palindrome obj = new Palindrome();

        obj.pal(1442441);

    }

}
