package constandstatandfinal;

public class ItemBrand extends Item {
    String name;
    public ItemBrand(String name, String itemtype ) {
        super(itemtype);
        this.name = name;
    }

    public ItemBrand(String name) {
        super("Coke");
        this.name = name;
    }

    public static void main(String[] args) {
        ItemBrand item = new ItemBrand("Limca");
        System.out.println(item.itemtype);
        System.out.println(item.name);

        item = new ItemBrand("Sprite", "Fanta");
        System.out.println(item.name);
        System.out.println(item.itemtype);
    }
}
