package App;

import java.text.DecimalFormat;

public class Utils {

    public static String roundValue(double value) {

        return new DecimalFormat("0.00").format(value);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double checkNumber(String inputText) {
        try {
            return Double.parseDouble(inputText);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
