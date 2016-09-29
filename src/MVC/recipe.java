package MVC;

/**
 * Created by colbycooley on 6/3/16.
 */
public class recipe {
    public static void main (String args[]) {
        recipeView view = new recipeView();
        recipeModel model = new recipeModel();
        recipeControl control = new recipeControl(view, model);
        control.hibernateExample();
        //control.register();
    }
}
