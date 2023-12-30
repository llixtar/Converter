package App;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String textInp;
    static double length;
    static String lengthFormat;
    static String[] unitOfMeasurement = {"km", "mile"};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("\nChoose: \n 0 - km \n 1 - mile");
        textInp = sc.nextLine().trim();
        int num = (int) Utils.checkNumber(textInp);


        System.out.println("Enter the length, " + unitOfMeasurement[num] + ":");
        textInp = sc.nextLine().trim();
        length = Utils.checkNumber(textInp);
        lengthFormat = Utils.roundValue(length);

        switch (num) {
            case 0:

                break;
            case 1:
                break;
        }


        sc.close();

    }
}
