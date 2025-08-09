// AbstractFactory: Declares an interface for operations that create abstract product objects.
public interface IGUIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}