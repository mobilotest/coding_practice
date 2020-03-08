package Interview;

import java.text.DecimalFormat;

public class TextDollar {

    private static final String[] tensNames = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private static final String[] numNames = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private static String dollars = "Dollars";

    private TextDollar() {}

    private static String convertLessThanOneThousand(int number) {
        String soFar;

        if (number % 100 < 20){
            soFar = numNames[number % 100];
            number /= 100;
        }
        else {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0) return soFar;
        return numNames[number] + "Hundred" + soFar;
    }


    public static String convert(long number) {
        // 0 to 999 999 999
        if (number <= 0 || number >= 1000000000) {
            return "Your entered amount is out of boundary";
        }

        String sNumber = Long.toString(number);

        // pad with "0"
        String mask = "000000000";
        DecimalFormat df = new DecimalFormat(mask);
        sNumber = df.format(number);

        // XXXnnnnnn
        int millions  = Integer.parseInt(sNumber.substring(0,3));
        // nnnXXXnnn
        int hundredThousands = Integer.parseInt(sNumber.substring(3,6));
        // nnnnnnXXX
        int thousands = Integer.parseInt(sNumber.substring(6,9));

        String tradMillions;
        switch (millions) {
            case 0:
                tradMillions = "";
                break;
            case 1 :
                tradMillions = convertLessThanOneThousand(millions) + "Million";
                break;
            default :
                tradMillions = convertLessThanOneThousand(millions) + "Million";
        }
        String result = tradMillions;

        String tradHundredThousands;
        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1 :
                tradHundredThousands = "OneThousand";
                break;
            default :
                tradHundredThousands = convertLessThanOneThousand(hundredThousands) + "Thousand";
        }
        result =  result + tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result =  result + tradThousand;

        return result+dollars;
    }

    /**
     * testing
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(TextDollar.convert(0));
        System.out.println(TextDollar.convert(3));
        System.out.println(TextDollar.convert(466));
        System.out.println(TextDollar.convert(1234));
        System.out.println(TextDollar.convert(10));
        System.out.println(TextDollar.convert(21));
        System.out.println(TextDollar.convert(2200));
        System.out.println(TextDollar.convert(1000000000));
    }
}