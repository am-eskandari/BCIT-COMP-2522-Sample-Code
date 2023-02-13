package week2;

public class VariableParametersExample {

    public static void printGrades(int ... grades) {
        for(int grade : grades) {
            System.out.println(grade);
        }
        System.out.println(grades.length + " grades printed!");
    }

    public static void main(String[] args) {
        printGrades(42, 69, 37);
        System.out.println();
        printGrades(35, 43, 93, 23, 40, 21, 75);
    }
}
