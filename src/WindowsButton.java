// ConcreteProductA1: Implements the IButton interface for the Windows family.

public class WindowsButton implements IButton {

    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

