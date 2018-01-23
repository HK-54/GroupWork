import java.util.Scanner;
/**
 * Program displays the smallest number of the 10 user entered numbers.
 *
 * @author Dennis Case
 */
public class DennisCaseClass {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double aList[] = new double[10];
        System.out.println("Enter 10 numbers here: ");
        for(int i = 0; i < 10; i++){
            aList[i] = input.nextDouble();
        }
        double minimum = aList[0];
        for(int i = 0; i < 10; i++){
            if(aList[i] <= minimum){
                minimum = aList[i];
            }
        }
        System.out.println("The minimum number is: " + minimum);
    }
}
