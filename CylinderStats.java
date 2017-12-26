package q2;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Class CylinderStats.
 * <p>Prompts to get user inputs for radius and height of a cylinder,
 * then calculates the cylinder's surface value and volume. Prints output
 * to four decimal places.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class CylinderStats {
    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please input the radius of the cylinder:");
        double radius = scan.nextDouble();
        System.out.println("please input the height of the cylinder:");
        double height = scan.nextDouble();
        
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * Math.pow(radius, 2) * height;
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("the surface area is: " + df.format(surfaceArea) 
            + "\nthe volume is: " + df.format(volume));
        scan.close();
        System.out.println("Question two was called and ran sucessfully.");
    }

};
