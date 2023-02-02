import java.util.Scanner;

public class SelectionControlExample {
    public static void main(String[] args) {

        // if, else if, else example
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer value for x: ");
        int x = scanner.nextInt();
        System.out.print("Please enter an integer value for y: ");
        int y = scanner.nextInt();
        System.out.print("Please enter an integer value for z: ");
        int z = scanner.nextInt();
        if(x>y) {
            if(x>z) {
                System.out.println("The largest number is x = " + x);
            }
            else if(x==z) {
                System.out.println("The largest two numbers are x = z = " + x);
            }
            else {
                System.out.println("The largest number is z = " + z);
            }
        }
        else if(x==y) {
            if(x>z) {
                System.out.println("The largest two numbers are x = y = " + x);
            }
            else if(x==z) {
                System.out.println("The largest three numbers are x = y = z = " + x);
            }
            else {
                System.out.println("The largest number is z = " + z);
            }
        }
        else {
            if(y>z) {
                System.out.println("The largest number is y = " + y);
            }
            else if(y==z) {
                System.out.println("The largest two numbers are y = z = " + y);
            }
            else {
                System.out.println("The largest number is z = " + z);
            }
        }
        System.out.println();

        // conditional operator example
        System.out.println("The result of (x>y && x>z || y<z) is " + (x>y && x>z || y<z) + ".");
        System.out.println("The result of (x<y && (x<z || y>z)) is " + (x<y && (x<z || y>z)) + ".");
        System.out.println("The result of (!(x<y) && (x<z || y>z)) is " + (!(x<y) && (x<z || y>z)) + ".");
        System.out.println();

        // switch example
        // what will happen if we remove all the breaks?
        System.out.print("Please enter an integer value from 1 to 5 for num: ");
        int num = scanner.nextInt();
        switch(num) {
            case 1:
                System.out.println("The value stored in variable num is 1.");
                break;
            case 2:
                System.out.println("The value stored in variable num is 2.");
                break;
            case 3:
                System.out.println("The value stored in variable num is 3.");
                break;
            case 4:
                System.out.println("The value stored in variable num is 4.");
                break;
            case 5:
                System.out.println("The value stored in variable num is 5.");
                break;
            default:
                System.out.println("The value stored in variable num is out of the range of 1 to 5.");
        }
    }
}
