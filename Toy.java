public class Toy {
    private int id;
    private static int count = 0;
    private String name;
    private int quantity;
    private int weight;

    public Toy(String name, int quantity, int weight) {
        this.id = ++count;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void decreaseQuantity() {
        --this.quantity;
    }


    public String toString() {
        int var10000 = this.getId();
        return "ID: " + var10000 + ", Название игрушки: " + this.getName() + ", количество: " + this.getQuantity() + ", вес " + this.getWeight();
    }
}
