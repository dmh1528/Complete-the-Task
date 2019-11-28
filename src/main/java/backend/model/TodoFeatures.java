package backend.model;

public class TodoFeatures {

    private int id;
    private String userName;
    private String task;
    private String startDate;
    private String endDate;
    private Boolean isComplete;

    public TodoFeatures(int id, String userName, String task, String startDate, String endDate, Boolean isComplete) {
        this.id = id;
        this.userName = userName;
        this.task = task;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isComplete = isComplete;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }
}
