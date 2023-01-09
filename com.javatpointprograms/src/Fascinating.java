public class Fascinating {

    public void fasc(int num) {

        String result = String.valueOf(num) + String.valueOf(num * 2) + String.valueOf(num * 3);

        System.out.println(result);

        boolean found = true;

        for (char a = '1'; a <= '9'; a++) {

            if(!found){
                break;
            }

            int flag = 0;

            for (int i = 0; i < result.length(); i++) {

                if(result.charAt(i) == a){
                    flag++;
                }

            }

            if(flag == 0 || flag > 1){
                System.out.println(num + " is not a Fascinating number");
                found = false;
                break;
            }

        }

        if(found){
            System.out.println(num + " is a Fascinating number");
        }

    }


    public static void main(String[] args) {

        Fascinating obj = new Fascinating();

        obj.fasc(1922);

    }

}
