public class Solution {
    /**
     * public String mathFunction(1,2,3) returns "+",
     * public String mathFunction(2,2,4) returns "+*", (+ and *)
     * public String mathFunction(3,-3,-9) returns "*",
     * public String mathFunction(1,2,-1) returns "-",
     * public String mathFunction(3,3,1) returns "/",
     * public String mathFunction(7,1,11) returns "None".
     * @return
     */
    public static String mathFunction(int number1, int number2, int number3){

        StringBuilder sb= new StringBuilder();
        if(number3 == number1 + number2){
            sb.append("+");
        }
        if (number3 == number1 * number2){
            sb.append("*");
        }
        if (number3 == number1 - number2){
            sb.append("-");
        }
        if (number2 != 0 && number3 == number1 / number2){
            sb.append("/");
        }

        if (sb.length() == 0){
            return "None";
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mathFunction(1,2,3));
        System.out.println(mathFunction(2,2,4));
        System.out.println(mathFunction(3,-3,-9));
        System.out.println(mathFunction(1,2,-1));
        System.out.println(mathFunction(3,3,1));
        System.out.println(mathFunction(7,1,11));
    }
}
