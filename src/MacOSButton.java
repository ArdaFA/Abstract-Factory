// ConcreteProductA2: Implements the IButton interface for the macOS family.

public class MacOSButton implements IButton {

    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS style.");
    }
}
