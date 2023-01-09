public class Autobiographical {

    public void auto(int num) {

        boolean found = true;

        for (int i = 0; i < String.valueOf(num).length(); i++) {

            int count = 0;

            for (int j = 0; j < String.valueOf(num).length(); j++) {

                if (Integer.parseInt(String.valueOf(String.valueOf(num).charAt(j))) == i) {
                    count++;
                }

            }

            if (count != Integer.parseInt(String.valueOf(String.valueOf(num).charAt(i)))) {
                System.out.println(num + " is not an Auto number");
                found = false;
                break;
            }

        }

        if (found) {
            System.out.println(num + " is an Auto number");
        }

    }

    public static void main(String[] args) {

        Autobiographical obj = new Autobiographical();

        obj.auto(3211000);

    }

}
