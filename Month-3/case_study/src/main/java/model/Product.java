package model;

public class Product {
    private int id;
    private int price;
    private String description;
    private String name;
    private int amount;
    private String image;
    private int amountSold;
    private int evaluate;
    private int discount;
    private int idProducer;
    private int idType;

    public int getIdProducer() {
        return idProducer;
    }

    public void setIdProducer(int idProducer) {
        this.idProducer = idProducer;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    private Producer producer;

    public model.Producer getProducer() {
        return producer;
    }

    public void setProducer(model.Producer producer) {
        producer = producer;
    }

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


    public Product() {
    }

    public Product(int price, String description, String name, int amount, String image, int amountSold, int evaluate, int discount) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.amount = amount;
        this.image = image;
        this.amountSold = amountSold;
        this.evaluate = evaluate;
        this.discount = discount;

    }

    public Product(int id, int price, String description, String name, int amount, String image, int amountSold, int evaluate, int discount, int idType, int idProducer) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
        this.amount = amount;
        this.image = image;
        this.amountSold = amountSold;
        this.evaluate = evaluate;
        this.discount = discount;
        this.idProducer = idProducer;
        this.idType = idType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(int amountSold) {
        this.amountSold = amountSold;
    }

    public int getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(int evaluate) {
        this.evaluate = evaluate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Product(int id, int price, String description, String name, int amount, String image, int amountSold, int evaluate, int discount, Type type, Producer producer) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
        this.amount = amount;
        this.image = image;
        this.amountSold = amountSold;
        this.evaluate = evaluate;
        this.discount = discount;
        this.type = type;
        this.idType = type.getId();
        this.producer = producer;
        this.idProducer = producer.getId();

    }

    public Product(int price, String description, String name, int amount, String image, int amountSold, int evaluate, int discount, int idType, int idProducer) {

        this.price = price;
        this.description = description;
        this.name = name;
        this.amount = amount;
        this.image = image;
        this.amountSold = amountSold;
        this.evaluate = evaluate;
        this.discount = discount;
        this.idProducer = idProducer;
        this.idType = idType;
    }
}
