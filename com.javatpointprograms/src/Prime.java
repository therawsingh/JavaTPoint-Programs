public class Prime {

    //finds prime number between the specified range
    public void prime(int start, int end){

        for(int i = start; i <= end; i++){
            int flag = 0;
            for(int j = 2; j < i; j++){

                if(i%j == 0){
                    flag++;
                    break;
                }

            }

            if(flag != 1){
                System.out.println(i + " is a prime number");
            }/*
            else{
                System.out.println(i + " is a prime number");
            }*/

        }

    }

    public static void main(String[] args) {

        Prime obj = new Prime();

        obj.prime(1,100);

    }

}
