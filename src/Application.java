// The client code that uses the factory to create UI elements.
public class Application {

    private IButton button;
    private ICheckbox checkbox;

    // The application's constructor takes a factory. It doesn't know (or care)
    // what kind of factory it is (Windows, Mac, etc.).
    public Application(IGUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }

    // A helper method to initialize the application based on the OS.
    public static Application configureApplication() {
        IGUIFactory factory;

        // Simulate checking the operating system.
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            // Default to Windows for other OSes in this example.
            factory = new WindowsFactory();
        }

        return new Application(factory);
    }
}