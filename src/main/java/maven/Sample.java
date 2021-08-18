package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
    //    StringUtils
        //1. Prompt user to enter string...sout
        //2. Get string from user scanner
        //3. Determine whether user string is a number use StringUtils.
        //4. Flip case of StringUtils
        //5. Reverse the StringUtils
        //6. Print out result from steps 3-5

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter a word: ");
        String usersWord = scanner.nextLine();
        System.out.printf("You entered: %s\n", usersWord);
        String isWordANumberMessage;
        if(StringUtils.isNumeric(usersWord)) {
            isWordANumberMessage = "is a number";
        } else {
            isWordANumberMessage = "is not a number";
        }
        System.out.printf("\"%s\" %s", usersWord, isWordANumberMessage);
        System.out.printf("Flipped Case: %s", StringUtils.swapCase(usersWord));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(usersWord));
    }
}
