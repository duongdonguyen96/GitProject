package model;

public class Blog {
    private int id_blog;
    private String title;
    private String content;


    public Blog() {
    }

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Blog(int id_blog, String title, String content) {
        this.id_blog = id_blog;
        this.title = title;
        this.content = content;
    }

    public int getId_blog() {
        return id_blog;
    }

    public void setId_blog(int id_blog) {
        this.id_blog = id_blog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
