import java.util.Scanner;


//Almin Kadiric, 11933491

public class EinstiegsBeispiel {


    public static int binaryToDecimal(int[] binaryArray) {
        int decimalNumber = 0;
        int baseNumber = 1;
        for (int i = binaryArray.length - 1; i >= 0; i--) {
            if (binaryArray[i] == 1) {
                decimalNumber += baseNumber;
            } else if (binaryArray[i] != 0) {
                throw new IllegalArgumentException("Invalid Binary numbers: " + binaryArray[i]);
            }
            baseNumber *= 2;
        }

        return decimalNumber;
    }


}

