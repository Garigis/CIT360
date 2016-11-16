package MVC;

public class Model {
    private String name;
    private int level;

    // This model used for sets and gets.

    // SETS
    public void setCandyName(String name) {
        this.name = name;
    }

    public void setDeliciousnessLevel(int level) {
        this.level = level;
    }


    // GETS
    public int getDeliciousnessLevel() {
        return level;
    }

    public String getCandyBarName() {
        return name;
    }
}
