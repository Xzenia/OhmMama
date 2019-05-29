package com.treskie.conrad.ohm_mama;

public class ProcessInputClass {
    public String outputCalc = "";
    public String[] comboBoxContents1 = {"Black", "Brown", "Red", "Orange","Yellow", "Green", "Blue", "Violet", "Gray", "White"};
    public String[] comboBoxContents2 = {"Black", "Brown", "Red", "Orange","Yellow", "Green", "Blue", "Violet", "Gray", "White", "Gold", "Silver"};
    private int digits;
    private double result = 0, percentage;

    public String processInputFourBands(int input1, int input2, int input3, int input4){
        digits = Integer.parseInt(input1+""+input2);
        result = 0;
        percentage = 0;
        outputCalc = digits+" * ";

        if (input3 < 10) {
            result = digits * Math.pow(10, input3);
            outputCalc += Math.pow(10, input3);
        }

        if (input3 >= 10){
            if (input3 == 10) {
                result = digits * Math.pow(10, -1);
                outputCalc += Math.pow(10, -1);
            } else {
                result = digits * Math.pow(10, -2);
                outputCalc += Math.pow(10, -2);
            }
        }

        if (input4 < 10){
            percentage = result * 0.20;
            outputCalc += "\n\nTolerance: "+percentage;
        }

        if (input4 >= 10) {
            if (input4 == 10) {
                percentage = result * 0.5;
                outputCalc += "\n\nTolerance: "+percentage;
            } else {
                percentage = result * 0.10;
                outputCalc += "\n\nTolerance: "+percentage;
            }
        }
        return "\n"+String.valueOf(result)+"Ω";
    }

    public String processInputFiveBands(int input1, int input2, int input3, int input4, int input5){
        digits = Integer.parseInt(input1+""+input2+""+input3);
        outputCalc = digits+" * ";

        if (input4 < 10) {
            result = digits * Math.pow(10, input4);
            outputCalc += Math.pow(10, input4);
        }

        if (input4 >= 10){
            if (input4 == 10) {
                result = digits * Math.pow(10, -1);
                outputCalc += Math.pow(10, -1);
            } else {
                result = digits * Math.pow(10, -2);
                outputCalc += Math.pow(10, -2);
            }
        }

        if (input5 < 10){
            percentage = result * 0.20;
            outputCalc += "\n\nTolerance: "+percentage;
        }

        if (input5 >= 10) {
            if (input5 == 10) {
                percentage = result * 0.5;
                outputCalc += "\n\nTolerance: "+percentage;
            } else {
                percentage = result * 0.10;
                outputCalc += "\n\nTolerance: "+percentage;
            }
        }
        return "\n"+result+" Ω";
    }

    public String processInputSixBands(int input1, int input2, int input3, int input4, int input5, int input6){
        digits = Integer.parseInt(input1+""+input2+""+input3+""+input4);
        outputCalc = digits+" * ";

        if (input5 < 10) {
            result = digits * Math.pow(10, input5);
            outputCalc += Math.pow(10, input5);
        }

        if (input5 >= 10){
            if (input5 == 10) {
                result = digits * Math.pow(10, -1);
                outputCalc += Math.pow(10, -1);
            } else {
                result = digits * Math.pow(10, -2);
                outputCalc += Math.pow(10, -2);
            }
        }

        if (input6 < 10){
            percentage = result * 0.20;
            outputCalc += "\n\nTolerance: "+percentage;
        }

        if (input6 >= 10) {
            if (input6 == 10) {
                percentage = result * 0.5;
                outputCalc += "\n\nTolerance: "+percentage;
            } else {
                percentage = result * 0.10;
                outputCalc += "\n\nTolerance: "+percentage;
            }
        }
        return "\n"+result+" Ω";
    }
}
