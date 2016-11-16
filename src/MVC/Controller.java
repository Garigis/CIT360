package MVC;

/**
 * Created by Colby Cooley on 10/15/2016.
 */

public class Controller {
    private Model model;
    private ViewExample view;

    // The model and view are passed from Main.
    public Controller(Model passedModel, ViewExample passedView){
        this.model = passedModel;
        this.view = passedView;
    }

    // String passed to method from main. Passes to model.
    public void setCandyBarName(String CandyName){
        model.setCandyName(CandyName);
    }

    // Int passed to method from main. Passes to model.
    public void setDeliciousnessLevel(int level){
        model.setDeliciousnessLevel(level);
    }

    // This method is called from Main. Parameters retrieved from the model are passed to the view.
    public void updateView(){
        view.printCandyBarDetails(model.getCandyBarName(), model.getDeliciousnessLevel());
    }
}
