//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // The configuration happens once at the start.
        Application app = Application.configureApplication();

        // The rest of the application just works with the created UI elements.
        app.renderUI();
    }
}