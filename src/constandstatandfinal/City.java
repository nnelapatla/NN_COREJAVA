package constandstatandfinal;

public class City {
    final String name = "Delhi";

    final String getName(){

        return name;
    }

    public static void main(String[] args) {
        City details = new City();
        System.out.println(details.getName());
    }
}