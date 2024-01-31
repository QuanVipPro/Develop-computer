package Controller;

import View.Menu;

public class Control extends Menu {

    private Calculator mg;
    public Control() {
        super(" Calculator Program", new String[]{"Normal Calculator", "BMI Calculator", "Exit"});
        mg = new Calculator();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                mg.normalCalculator();
                break;
            case 2:
                mg.bmiCalculator();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
