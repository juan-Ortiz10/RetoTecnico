package model;

public class StarSharpData {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String unitName;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    private String meetName;
    private String meetNumber;
    private String meetDateStart;
    private String meetDateEnd;

    public String getMeetName() {
        return meetName;
    }

    public void setMeetName(String meetName) {
        this.meetName = meetName;
    }

    public String getMeetNumber() {
        return meetNumber;
    }

    public void setMeetNumber(String meetNumber) {
        this.meetNumber = meetNumber;
    }

    public String getMeetDateStart() {
        return meetDateStart;
    }

    public void setMeetDateStart(String meetDateStart) {
        this.meetDateStart = meetDateStart;
    }

    public String getMeetDateEnd() {
        return meetDateEnd;
    }

    public void setMeetDateEnd(String meetDateEnd) {
        this.meetDateEnd = meetDateEnd;
    }
}
