public class VariableScopeDemo {
    // Class (Static) Variable
    static int classVar = 100;
    // Instance Variable
    String instanceVar = "Hello";
    public void scopeExample(int paramVar) {
// Local Variable (Method Scope)
        int localVar = 20;
        System.out.println("--- Inside scopeExample Method ---");
// Accessible: classVar (static), instanceVar (instance), localVar (local), paramVar (parameter)
        System.out.println("Static Variable (classVar): " + classVar);
        System.out.println("Instance Variable (instanceVar): " + instanceVar);
        System.out.println("Local Variable (localVar): " + localVar);
        System.out.println("Parameter Variable (paramVar): " + paramVar);
// Block Scope Example
        if (localVar > 10) {
// Block Variable (Local to this if block)
            int blockVar = 5;
            System.out.println("Block Variable (blockVar): " + blockVar);
        } // blockVar is destroyed here
// System.out.println(blockVar); // COMPILE ERROR: blockVar is out of scope
    }
    public static void main(String[] args) {
// Accessing Static Variable using class name
        System.out.println("Static Variable in main (classVar): " + VariableScopeDemo.classVar);
// Need an object to access instance variables and methods
        VariableScopeDemo obj = new VariableScopeDemo();
// Accessing Instance Variable via object
        System.out.println("Instance Variable in main (obj.instanceVar): " + obj.instanceVar);
        obj.scopeExample(30);
// Local variables of scopeExample are destroyed after the method returns
// System.out.println(obj.localVar); // COMPILE ERROR: localVar is out of scope
    }
}
