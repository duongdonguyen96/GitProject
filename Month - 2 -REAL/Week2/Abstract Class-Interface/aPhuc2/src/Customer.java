import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private String phone;
    private String email;
    String gender;
    public int oder = 0;

    public Customer() {
    }

    public Customer(String name, String address, String phone, String email, String gender) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.oder = oder;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOder() {
        return oder;
    }

    public void setOder(int oder) {

        this.oder = oder;
    }


    public void displayInformation() {
        System.out.println("Thong tin khach hang: ");
        System.out.println("Khach hang: " + this.getName());
        System.out.println("Dia chi: " + this.getAddress());
        System.out.println("Gioi tinh: " + this.getGender());
        System.out.println("So dien thoai: " + this.getPhone());
        System.out.println("So don da mua: " + this.getOder());
    }
}
