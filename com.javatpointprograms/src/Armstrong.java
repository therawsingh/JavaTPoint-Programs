public class Armstrong {

    public void arm(Integer num){
        int length = num.toString().length();
        System.out.println(length);
        int sum = 0;
        int temp = num;
        for(int i = 0; i < length; i++){
            sum = sum + (int)Math.pow(temp % 10,length);
            temp = temp / 10;
        }

        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }

    }

    public static void main(String[] args) {

        Armstrong obj = new Armstrong();

        obj.arm(1634);

    }

}
