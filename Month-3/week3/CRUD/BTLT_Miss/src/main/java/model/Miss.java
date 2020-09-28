package model;

public class Miss {
    Province province1 = new Province();
    private int id;
    private String name;
    private String dateOfBirth;
    private String address;
    private String phone;
    private String email;
    private String idCard;
    private String job;
    private String educationalLevel;
    private String nation;
    private String workOrStudyUnit;
    private float height;
    private float weight;
    private String otherGifted;
    private String image;
    private String province = province1.getName();
    boolean checkStatus = false;


    public Miss() {
    }

    public Miss(int id, String name, String dateOfBirth, String address, String phone, String email, String idCard, String job, String educationalLevel, String nation, String workOrStudyUnit, float height, float weight, String otherGifted, String image, String province) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.idCard = idCard;
        this.job = job;
        this.educationalLevel = educationalLevel;
        this.nation = nation;
        this.workOrStudyUnit = workOrStudyUnit;
        this.height = height;
        this.weight = weight;
        this.otherGifted = otherGifted;
        this.image = image;
        this.province = province;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getWorkOrStudyUnit() {
        return workOrStudyUnit;
    }

    public void setworkOrStudyUnit(String workOrStudyUnit) {
        workOrStudyUnit = workOrStudyUnit;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getOtherGifted() {
        return otherGifted;
    }

    public void setOtherGifted(String otherGifted) {
        this.otherGifted = otherGifted;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public boolean isCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(boolean check) {
        this.checkStatus = check;
    }
}
