//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding toString to print the object's state easily
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }
}

public class ReferenceDemonstration {

    // A method to attempt to change both a primitive and an object reference
    public static void makeChanges(int number, Student studentParam) {

        System.out.println("--- Inside Method: Start ---");
        System.out.println("Parameter Student (studentParam) reference/value: " + studentParam);
        System.out.println("Parameter int (number) value: " + number);

        // 1. Primitive Type Change: A new VALUE is assigned inside the method.
        number = 99;
        System.out.println("\n*** Primitive Type Change (number = 99) ***");
        System.out.println("Inside Method New int Value (number): " + number);

        // 2. Object Content Change:
        // We modify a field of the *same* object pointed to by both references.
        studentParam.name = "Ayşe";
        studentParam.id = 101;
        System.out.println("\n*** Changing the Object's Content (studentParam.name = Ayşe) ***");
        System.out.println("Inside Method Student Object State: " + studentParam);

        // 3. Re-assigning the Reference itself:
        // The local parameter 'studentParam' now points to a brand new object.
        // IMPORTANT: This change DOES NOT affect the 'student1' reference in the main method.
        studentParam = new Student("NEW OBJECT", 555);
        System.out.println("\n*** Re-directing the Local Reference ***");
        System.out.println("Inside Method New Reference State: " + studentParam);

        System.out.println("--- Inside Method: End ---");
    }

    public static void main(String[] args) {

        // Primitive Type (Holds Value)
        int x = 10;

        // Object Type (Holds Reference)
        Student student1 = new Student("Ahmet", 100);

        /*System.out.println("--- BEFORE METHOD CALL STATE ---");
        System.out.println("main: Primitive (x): " + x);
        System.out.println("main: Object (student1): " + student1);
        System.out.println("---------------------------------");*/

        // Calling the method
        makeChanges(x, student1);

        System.out.println("\n--- AFTER METHOD CALL STATE ---");

        // RESULT 1: Primitive type (x) DID NOT change!
        // Only a copy of the value was passed and modified.
        System.out.println("RESULT 1 (int): main: x = " + x + " (Did NOT change!)");

        // RESULT 2: The Object's CONTENT DID change!
        // The method received a copy of the reference and used it to access and modify the ONE object.
        System.out.println("RESULT 2 (Object Content): main: student1 = " + student1 + " (Content CHANGED!)");

        // RESULT 3: The Object's REFERENCE DID NOT change!
        // The re-assignment inside the method only affected the local 'studentParam' variable.
        // 'student1' still points to the original (now modified) object.
        System.out.println("---------------------------------");
    }
}