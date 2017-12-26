package q1;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * Class PhoneNumbers creates and prints a random phone number.
 * <p>
 * The phone number is in the form XXX-XXX-XXXX.
 * The first three digits does contain 8 or 9 and the second set of 
 * three digit is not greater than 635.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class PhoneNumbers {
    /** 
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        final int hundred = 100;
        final int ten = 10;
        final int firstLimit = 8;
        final int secondLimit = 636;
        final int thirdLimit = 10000;
        Random ran = new Random();
        int num1 = (ran.nextInt(firstLimit) * hundred 
            + ran.nextInt(firstLimit) * ten + ran.nextInt(firstLimit));
        int num2 = ran.nextInt(secondLimit);
        int num3 = ran.nextInt(thirdLimit);

        DecimalFormat df1 = new DecimalFormat("000");
        DecimalFormat df2 = new DecimalFormat("0000");

        System.out.println(df1.format(num1) + "-" + df1.format(num2) + "-" 
            + df2.format(num3));

        System.out.println("Question one was called and ran sucessfully.");
    }

};
