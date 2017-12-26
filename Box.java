package q4;

/**
 * Class Box.
 * <p>
 * Declares instance variables height, width, and depth of the box. 
 * Defines a constructor accept and initialize the height, width, and 
 * depth of the box. Includes setters and getters for each variable 
 * and a toString method raturns a one-line description of the box.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class Box {
    /** Declares instance varible height as a double. */
    private double height;
    /** Declares instance varible width as a double. */
    private double width;
    /** Declares instance varible depth as a double. */
    private double depth;
    /** Declares instance varible full as a boolean. */
    private boolean full;

    /**
     * <p>
     * Constructs a new box accepting height, width, 
     * and depth as its parameters.
     * </p>
     *
     * @param height
     *            a double for height
     * @param width
     *            a double for width
     * @param depth
     *            a double for depth
     */
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        full = false;
    }

    /**
     * Returns the height as a string.
     * 
     * @return height as a string
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height.
     * 
     * @param height
     *            a double
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the width as a double.
     * 
     * @return width as a double
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width.
     * 
     * @param width
     *            a double
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the depth as a double.
     * 
     * @return depth as a double
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Sets the depth.
     * 
     * @param depth
     *            a double
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * Returns full as a boolean.
     * 
     * @return full as a boolean
     */
    public boolean isFull() {
        return full;
    }

    /**
     * Sets the box to be full.
     * 
     * @param full
     *            a boolean
     */
    public void setFull(boolean full) {
        this.full = full;
    }

    /**
     * Returns a one-line description of box.
     * 
     * @return information of box as a String
     */
    public String toString() {
        return "Box [height=" + height + ", width=" + width + ", "
            + "depth=" + depth + ", " + "full=" + full + ", "
            + "getHeight()=" + getHeight() + ", getWidth()=" 
            + getWidth() + ", getDepth()=" + getDepth()
            + ", isFull()=" + isFull() + "]";
    }

};
