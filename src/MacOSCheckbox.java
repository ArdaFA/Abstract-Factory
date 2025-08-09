// ConcreteProductB2: Implements the ICheckbox interface for the macOS family.

public class MacOSCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in MacOS style.");
    }
}
