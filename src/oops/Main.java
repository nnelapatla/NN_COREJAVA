package oops;

public class Main {
    public static void main(String[] args) {
        Department department = new SubDepartment(3);
        System.out.println(department.getDepartmenSize());


        Product product = new Product(12);
        System.out.println(product.getPrice());
        System.out.println(product.getPrice(4));


        Parent parent1 = new Parent();
        parent1.message();
        Child child1 = new Child();
        child1.message();
        Parent parent2 = new Child();
        parent2.message();

        Product p = new Product(20);
        p.getPrice();

        p.setPrice(25);

        p.getPrice();


    }
}
