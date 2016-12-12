package MVC;

import java.io.*;
import java.util.Scanner;

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

    // This method requests for user input to pass into the model
    public void nastypath1() {
        Scanner scanner = new Scanner(System.in);
        String bogus1 = scanner.nextLine();
        int bogus2 = scanner.nextInt();

        //set based on user input
        model.setCandyName(bogus1);
        model.setDeliciousnessLevel(bogus2);

        // Display - This should be handled in the view, not controller.
        System.out.println(model.getCandyBarName());
        System.out.println(model.getDeliciousnessLevel());
    }

    // This method gets candy names from strange file and Candy Name and DeliciousnessLevel will be the same.
    public void nastypath2() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File("C:\\Users\\colby\\Desktop\\CIT 360\\CIT360\\test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(fileReader);

        String line = null;
        // if no more lines the readLine() returns null
        try {
            while ((line = br.readLine()) != null) {
                model.setCandyName(line);
                model.setDeliciousnessLevel(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
