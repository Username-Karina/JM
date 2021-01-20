package program;


public class Arabic {


    public static String arabicToRoman(int result) {
        RomanNumber[] romanNumbers = RomanNumber.values();

        StringBuilder total = new StringBuilder();
        if (result < 0){
            total.append("-");
            int j = Math.abs(result);
            total.append(romanNumbers[j]);

        }else if (result > 0 && result <= 100) {
            total.append(romanNumbers[result]);

        }else if (result == 0){
            total.append(romanNumbers[0]);
        }
        return total.toString();


    }



}
