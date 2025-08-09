// ConcreteFactory2: Implements the creation operations for the macOS family.
// it ensures that only macOS-related objects are created.

public class MacOSFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}