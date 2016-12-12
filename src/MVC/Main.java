package MVC;


public class Main {
    public static void main(String[] args) {

        // Model to retrieve info about candy.
        Model model = retrieveCandyInfo();

        // Assign view to class designated as view. Will be used to write info about candy.
        ViewExample view = new ViewExample();

        //Controller passes model and view to controller.
        Controller controller = new Controller(model, view);

        // Display what is currently in model. Calls method in view using controller.
        controller.updateView();

        // Update data in model with something else.
        controller.setCandyBarName("Milky Way");
        controller.setDeliciousnessLevel(4);

        // Display what is in model. (with updated candy info)
        controller.updateView();

        // Update data in model with something else.
        controller.setCandyBarName("Hershey\'s");
        controller.setDeliciousnessLevel(8);

        // Display what is in model. (with updated candy info)
        controller.updateView();

        // Uses nastypaths
        controller.nastypath1();
        controller.nastypath2();
    }

    // Initial model
    private static Model retrieveCandyInfo(){
        Model candy = new Model();

        // Set initial values to model
        candy.setCandyName("Reese\'s");
        candy.setDeliciousnessLevel(10);

        return candy;
    }
}
