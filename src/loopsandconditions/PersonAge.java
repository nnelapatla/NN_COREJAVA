package loopsandconditions;
public class PersonAge {
    public static void randomAge(int age) {
        if (age < 13) {
            System.out.println("This person is a kid.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This person is a teen.");
        } else {
            System.out.println("This person is an adult.");
        }
    }

    public static void main(String[] args) {
        randomAge(15);
        randomAge(10);
        randomAge(25);
    }
}
