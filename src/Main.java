//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        classCreator firstObject = new classCreator();
        classCreator secondObject = new classCreator();
        firstObject.data=6;
        secondObject.data=7;
        firstObject =secondObject;
        firstObject.data=8;
        System.out.printf(String.valueOf(secondObject.data));

    }
}