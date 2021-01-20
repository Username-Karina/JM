package program;

public class Roman {


    public static int romanToArabic (String string) {

        int number = 0;

        if(string.matches("I")){ number = 1;}
        if(string.matches("II")){number = 2;}
        if(string.matches("III")){number = 3;}
        if(string.matches("IV")){number = 4;}
        if(string.matches("V")){number = 5;}
        if(string.matches("VI")){number = 6;}
        if(string.matches("VII")){number = 7;}
        if(string.matches("VIII")){number = 8;}
        if(string.matches("IX")){number = 9;}
        if(string.matches("X")){number = 10;}
        else if(number < 1){
            System.out.println("Not roman");}
        return number;


    }


}
