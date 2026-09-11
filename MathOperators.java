/** 
// This program displays various math calculations 
@author Shem
@version 1.0
@since
2026-11-9
*/
public final class MathOperators{
    /** This is a private constructore used to satisfy the style check 
    @exception IllegalStateException Utility class
    @see IllegalStateException 
    */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method
     * 
     * @param args Unused
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("2 + 3 = " + (2 + 3));
        // subtraction 
        System.out.println("4 - 5=" + (4 - 5));
        // Multiplication 
        System.out.println("3 * 9 =" + (3 * 9));
        // Division with integers 
        System.out.println("4 / 2 =" + (4 / 2));
        // division with float 
        System.out.println("2 / 3" + (2f / 3f));
        // Division with double number 
        System.out.println("2 / 3" + (2d / 3d));
        // Exponets to power of 2 
        System.out.println("5^2=" + (Math.pow(5, 2)));
        // Exponets to power of 3
        System.out.println("2^3=" + (Math.pow(2, 3)));
        // square root 
        System.out.println("square root of 16=" + (Math.sqrt(16)));
    }
}