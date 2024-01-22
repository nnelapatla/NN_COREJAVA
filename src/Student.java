public class Student {
    String name = "Naveena";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student myName = new Student();
        System.out.println(myName.getName());
    }
}
