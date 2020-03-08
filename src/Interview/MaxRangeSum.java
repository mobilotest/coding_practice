package Interview;

public class MaxRangeSum {

    public static void main(
            String[] args) {
        String input = "10 -10 4 2 8 -2 4 -5 -6";
        System.out.println(parseInputAndCalcMaxGain(input));
    }


    public static int parseInputAndCalcMaxGain(String input) {
        int result = 0; // initiate return with 0
        int temp = 0;
        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            temp += Integer.valueOf(arr[i]);
            if (temp < 0) {
                temp = 0;
            }else if (result < temp) { // if result is always negative it will return initial 0
                    result = temp;
                }
            }
        return result;
    }
}

