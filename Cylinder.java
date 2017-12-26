package q3;

/**
 * Class Cylinder.
 * <p>Contains a constructor to accept and initialize the radius and height.
 * Includes setters and getters for each variable and methods to calculate
 * the cylinder's surface are and volume.</p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class Cylinder {
    /**Declares instance variable radius as a double type.*/
    private double radius;
    /**Declares instance variable height as a double type.*/
    private double height;
    /**
     * Constructs a new cylinder accepting radius and height as 
     * its parameters. 
     * @param radius a double for radius
     * @param height a double for height
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    /**
     * Returns the radius as a double.
     * @return radius as a double
     */
    public double getRadius() {
        return radius;
    }
    /**
     * Sets the radius.
     * @param radius a double
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * Returns the height as a double.
     * @return height as a double
     */
    public double getHeight() {
        return height;
    }
    /**
     * Sets the height.
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Calculates surface area of a cylinder.
     * @return surfaceArea as a double
     */
    public double surfaceArea() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        return surfaceArea;
    }
    /**
     * Calculates volume of a cylinder.
     * @return volume as a double
     */
    public double volume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    /**
     * Returns a one-line description of cylinder.
     * @return information of cylinder as a String
     */
    public String toString() {
        return "Cylinder [radius=" + radius + ", height=" + height + ", "
            + "getRadius()=" + getRadius() + ", getHeight()=" + getHeight() 
            + ", " + "surfaceArea()=" + surfaceArea() + ", volume()=" 
            + volume() + "]";
    }
    
    
};  
