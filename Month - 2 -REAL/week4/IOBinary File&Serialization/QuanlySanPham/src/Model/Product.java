package Model;

public class Product {
    private String id;
    private String name;
    private String producer;
    private String price;
    private String otherDescription;

    public Product() {

    }

    public Product(String id, String name, String producer, String price, String otherDescription) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }
}
