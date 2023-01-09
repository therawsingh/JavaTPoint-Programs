public class Tech {

    public void tech(int num){

        if(String.valueOf(num).length() % 2 != 0){
            System.out.println(num + " is not Sunny number");
        }
        else{
            int fHalf = Integer.parseInt(String.valueOf(num).substring(0,String.valueOf(num).length()/2));
            int sHalf = Integer.parseInt(String.valueOf(num).substring(String.valueOf(num).length()/2));

            int sum = fHalf + sHalf;
            int sqre = sum * sum;

            if(sqre == num){
                System.out.println(num + " is a Sunny number");
            }
            else{
                System.out.println(num + " is not Sunny number");
            }

        }

    }

    public static void main(String[] args) {

        Tech obj = new Tech();

        obj.tech(1312);

    }

}
