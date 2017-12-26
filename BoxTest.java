package q4;

/**
 * Class BoxTest.
 * <p>
 * Creates two box objects to test methods of box class. Prints information 
 * to indicate that the methods worked correctly.
 * </p>
 *
 * @author Zhang Yuanyuan
 * @version 2017-10-29
 */
public class BoxTest {
    /**
     * <p>
     * Drives the program.
     * </p>
     * @param args
     *            unused.
     */
    public static void main(String[] args) {
        final double test1 = 1.0;
        final double test2 = 2.0;
        final double test3 = 3.0;
        final double test4 = 4.0;
        final double height1 = 1.5;
        final double width1 = 2.5;
        final double depth1 = 3.5;
        final double height2 = 4.5;
        final double width2 = 5.5;
        final double depth2 = 6.5;

        Box b1 = new Box(test1, test2, test3);
        Box b2 = new Box(test2, test3, test4);

        System.out.println(b1.getHeight() + "\n" + b1.getWidth());
        System.out.println(b1.getDepth() + "\n" + b1.isFull());
        System.out.println(b2.getHeight() + "\n" + b2.getWidth());
        System.out.println(b2.getDepth() + "\n" + b2.isFull());
        
        b1.setHeight(height1);
        b1.setWidth(width1);
        b1.setDepth(depth1);
        b1.setFull(true);
        b2.setHeight(height2);
        b2.setWidth(width2);
        b2.setDepth(depth2);
        b2.setFull(true);
        
        System.out.println("\n" + b1.getHeight() + "\n" + b1.getWidth());
        System.out.println(b1.getDepth() + "\n" + b1.isFull());
        System.out.println(b2.getHeight() + "\n" + b2.getWidth());
        System.out.println(b2.getDepth() + "\n" + b2.isFull());
        
        System.out.println("\n" + b1.toString() + "\n" + b2.toString());
        System.out.println("Question four was called and ran sucessfully.");
    }
};
