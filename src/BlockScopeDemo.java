public class BlockScopeDemo {
    public static void main(String[] args) {
// Local variable (Scope: whole main method)
        int outerX = 5;
        System.out.println("Before block: outerX = " + outerX);
        if (outerX > 0) {
// Block variable (Scope: only this if-block)
            int innerY = 15;
            System.out.println("Inside block: outerX = " + outerX); // outerX is accessible
            System.out.println("Inside block: innerY = " + innerY); // innerY is accessible
        } // innerY is destroyed (goes out of scope) here
        System.out.println("After block: outerX = " + outerX);
// The line below would cause a compile-time error:
// System.out.println("After block: innerY = " + innerY);
// innerY is out of scope and no longer accessible.
    }
}
