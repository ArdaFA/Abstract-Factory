// ConcreteFactory1: Implements the creation operations for the Windows family.
// it ensures that only Windows-related objects are created.

public class WindowsFactory implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}