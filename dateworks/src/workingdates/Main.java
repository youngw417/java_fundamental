package workingdates;
import java.util.*;
import java.text.*;

public class Main
{
    private static SimpleDateFormat dateFormat =  new SimpleDateFormat("MMM dd yyyy hh:mm:ss z Z");
    private static SimpleDateFormat date2Format = new SimpleDateFormat("MMM dd yyyy hh:mm:ss");

    public static void main(String[] args) throws Exception
    {
        Date myDate = new Date();
        System.out.println(dateFormat.format(myDate));

        Date thisDate = date2Format.parse("MAR 14 3141 03:14:14");
        System.out.println(dateFormat.format(thisDate));

        Calendar c = Calendar.getInstance();
        c.setTime(thisDate);
        c.add(Calendar.DATE, 1);
        thisDate = c.getTime();
        System.out.println(dateFormat.format(thisDate));


        
    }
}