package q3;

/**
 * Class MultiCylinder.
 * <p>Creates two cylinder objects.Prints radius and height before
 * and after modification. Last, prints the final volume and surface 
 * area of each cylinder.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class MultiCylinder {
    /**
     * <p>Drives the program.</p>
     *
     * @param args 
     *            unused.
     */
    public static void main(String[] args) {
        final double radius1 = 3.0;
        final double height1 = 5.0;
        final double radius2 = 4.0;
        final double height2 = 6.0;
        final double radius3 = 7.0;
        final double height3 = 8.0;
        final double radius4 = 9.0;
        final double height4 = 10.0;
        Cylinder c1 = new Cylinder(radius1, height1);
        Cylinder c2 = new Cylinder(radius2, height2);
        
        System.out.println("the radius of the first cylinder is:" 
            + c1.getRadius());
        System.out.println("the height of the first cylinder is:" 
            + c1.getHeight());
        System.out.println("the radius of the second cylinder is:" 
            + c2.getRadius());
        System.out.println("the height of the second cylinder is:" 
            + c2.getHeight());
        
        c1.setRadius(radius3);
        c1.setHeight(height3);
        c2.setRadius(radius4);
        c2.setHeight(height4);
        
        System.out.println("\nthe modified radius of the first cylinder is:"
            + c1.getRadius());
        System.out.println("the modified height of the first cylinder is:"
            + c1.getHeight());
        System.out.println("the modified radius of the second cylinder is:"
            + c2.getRadius());
        System.out.println("the modified height of the second cylinder is:"
            + c2.getHeight());
        
        System.out.println("\nthe volume of the first cylinder is: "
            + c1.volume());
        System.out.println("the surface area of the first cylinder is: "
            + c1.surfaceArea());
        System.out.println("the volume of the second cylinder is: "
            + c2.volume());
        System.out.println("the surface area of the second cylinder is: "
            + c2.surfaceArea());
        System.out.println("Question three was called and ran sucessfully.");
    }

};
