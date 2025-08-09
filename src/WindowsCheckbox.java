// ConcreteProductB1: Implements the ICheckbox interface for the Windows family.

public class WindowsCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}
