public class ReturnInIfStatements { public static void main(String[] args) {
        System.out.println(isEven(4));
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;

        } else {
         return false;

        }


    }

    public static boolean positiveOrNegative(int num) {
        if (num >= 0) {
            return true;

        } else  {
            return false;
        }

    }

    public static int ChooseOne2(int num){

    int value = 0;
    if (num == 1) {
        value = 1;

    }else if (num == 2){
        value = 2;
    }else if (num == 3) {
        value = 3;
    }else if (num ==4) {

    }
    return value;


    }

}