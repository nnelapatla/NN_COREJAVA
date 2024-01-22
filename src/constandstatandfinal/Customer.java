package constandstatandfinal;

public class Customer {
    static int custNumber = 987654321;

    public static int getCustomerNumber() {
        return custNumber;
    }
    public static void main(String[] args) {

        System.out.println(getCustomerNumber());

    }
}
