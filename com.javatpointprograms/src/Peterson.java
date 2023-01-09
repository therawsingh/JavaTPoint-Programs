public class Peterson {

    public void pete(int num){

        int temp = num;
        int digit = 0;
        int sum = 0;

        for(; temp != 0;){
            int fact = 1;
            for(int j = 2; j <= temp % 10; j++){
                fact = fact * j;
            }
            sum = sum + fact;
            temp = temp / 10;
        }

        if(sum == num){
            System.out.println(num + " is a Peterson number");
        }

    }

    public static void main(String[] args) {

        Peterson obj = new Peterson();

        obj.pete(145);

    }

}
