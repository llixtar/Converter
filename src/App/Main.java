package App;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String textInp;
    static double length;
    static double cnvrtLength;
    static String[] unitOfMeasurement = {"km", "mile"};
    private static final double COEFFICIENT = 1.609;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("\nChoose: \n 0 - km \n 1 - mile");
        textInp = sc.nextLine().trim();
        int num = (int) Utils.checkNumber(textInp);

        if (num >= 0 && num <= 1) {

            System.out.println("Enter the length, " + unitOfMeasurement[num] + ":");
            textInp = sc.nextLine().trim();
            length = Utils.checkNumber(textInp);


            switch (num) {
                case 0:
                    cnvrtLength = convertKmToMile(length);

                    String lengthFormat = Utils.roundValue(length);
                    String cnvrtLengthFormat = Utils.roundValue(cnvrtLength);

                    System.out.printf("%s km = %s mile%n", lengthFormat, cnvrtLengthFormat);

                    break;
                case 1:
                    break;
            }

        } else System.out.println(":(");

        sc.close();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static double convertKmToMile(double length) {
        return length / COEFFICIENT;
    }
    //------------------------------------------------------------------------------------------------------------------
}
