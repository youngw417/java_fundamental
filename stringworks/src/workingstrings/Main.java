package workingstrings;

import java.text.DecimalFormat;

public class Main
{
    private static DecimalFormat df = new DecimalFormat("$#,##0.00");

    public static void main(String[] args)
    {
        String myStr = "Lambda School";

        myStr.charAt(0);
        System.out.println(myStr);

        System.out.println(myStr.charAt(0));
        System.out.println(myStr.charAt(5));
        // System.out.println(myStr.charAt(100));
        String strResult = myStr.substring(5, 8);
        System.out.println(strResult);

        System.out.println(myStr.length());

        strResult = myStr + "John";
        strResult = myStr.toLowerCase();
        System.out.println(strResult);

        strResult = myStr.toUpperCase();
        System.out.println(strResult);

        double myDouble = 12344552242342.434220;
        strResult = df.format(myDouble);
        System.out.println(strResult);

        myDouble = .3;
        strResult = df.format(myDouble);
        System.out.println(strResult);

    }
}