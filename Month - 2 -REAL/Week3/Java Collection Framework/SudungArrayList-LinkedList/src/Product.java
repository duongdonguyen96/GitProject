public class Product implements Comparable<Product> {
    public String name;
    public int id;
    public int price;

    public Product() {
    }

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
