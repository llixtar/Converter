package App;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String textInp;
    static double length;
    static double cnvrtLength;
    static String[] unitOfMeasurement = {"km", "mile"};
    private static final double COEFFICIENT = 1.609;
    static Scanner sc;

    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        run();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void run() {
        int num = chooseMeasurement();

        switch (num) {
            case 0: {
                length = enterLength(num);
                if (length != -1) {
                    cnvrtLength = convertKmToMile(length);
                    showResultCnvrt(num, length, cnvrtLength);
                }

                break;
            }
            case 1: {
                length = enterLength(num);

                if (length != -1) {
                    cnvrtLength = convertMileToKm(length);
                    showResultCnvrt(num, length, cnvrtLength);
                }
                break;
            }
            default:
                System.out.println("¯\\_(ツ)_/¯");
        }

        quit();
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void quit() {
        System.out.println("\nEnter: \n 0 - quit \n 1 - continue");
        textInp = sc.nextLine().trim();

        int num = (int) Utils.checkNumber(textInp);

        switch (num) {
            case 0:
                sc.close();
                break;
            case 1:
                run();
                break;
            default:
                sc.close();
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public static int chooseMeasurement() {
        System.out.println("\nChoose: \n 0 - km \n 1 - mile");
        textInp = sc.nextLine().trim();
        return (int) Utils.checkNumber(textInp);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double enterLength(int num) {
        System.out.println("Enter the length, " + unitOfMeasurement[num] + ":");
        textInp = sc.nextLine().trim();

        return Utils.checkNumber(textInp);
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double convertKmToMile(double length) {
        return length / COEFFICIENT;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static double convertMileToKm(double length) {
        return length * COEFFICIENT;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void showResultCnvrt(int msrmnt, double length, double cnvrtLength) {
        String lengthFormat = Utils.roundValue(length);
        String cnvrtLengthFormat = Utils.roundValue(cnvrtLength);

        switch (msrmnt) {
            case 0:
                System.out.printf("%s %s = %s %s%n", lengthFormat, unitOfMeasurement[0], cnvrtLengthFormat, unitOfMeasurement[1]);
                break;
            case 1:
                System.out.printf("%s %s = %s %s%n", lengthFormat, unitOfMeasurement[1], cnvrtLengthFormat, unitOfMeasurement[0]);
                break;

        }
    }
    //------------------------------------------------------------------------------------------------------------------
}