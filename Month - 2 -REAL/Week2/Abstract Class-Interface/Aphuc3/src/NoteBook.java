import java.util.Date;

public class NoteBook {
    private String title;
    private String content;
    private String taskList;
    private Date timeOfCreate;
    private Date timeOfEdit;

    public NoteBook() {

    }

    public NoteBook(String title, String content, String taskList, Date timeOfCreate, Date timeOfEdit) {
        this.title = title;
        this.content = content;
        this.taskList = taskList;
        this.timeOfCreate = timeOfCreate;
        this.timeOfEdit = timeOfEdit;
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

    public String getTaskList() {
        return taskList;
    }

    public void setTaskList(String taskList) {
        this.taskList = taskList;
    }

    public Date getTimeOfCreate() {
        return timeOfCreate;
    }

    public void setTimeOfCreate(Date timeOfCreate) {
        this.timeOfCreate = timeOfCreate;
    }

    public Date getTimeOfEdit() {
        return timeOfEdit;
    }

    public void setTimeOfEdit(Date timeOfEdit) {
        this.timeOfEdit = timeOfEdit;
    }

    public void displayInformation() {
        System.out.println("Tieu de: " + this.getTitle());
        System.out.println("Noi dung: " + this.getContent());
        System.out.println("Danh sach viec: " + this.getTaskList());
        System.out.println("Ngay tao: " + this.getTimeOfCreate());
        System.out.println("Sua cuoi: " + this.getTimeOfEdit());
    }
}

