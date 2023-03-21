package entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class EmployeePersonalInfo {
    private String fName;
    private String lName;
    private LocalDate birthday;
    private List<Contact> contacts;

    public EmployeePersonalInfo(String fName, String lName, LocalDate birthday, List<Contact> contacts) {
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.contacts = contacts;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeePersonalInfo that = (EmployeePersonalInfo) o;
        return Objects.equals(fName, that.fName) && Objects.equals(lName, that.lName) && Objects.equals(birthday, that.birthday) && Objects.equals(contacts, that.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, birthday, contacts);
    }

    @Override
    public String toString() {
        return "EmployeePersonalInfo{" +
               "fName='" + fName + '\'' +
               ", lName='" + lName + '\'' +
               ", birthday=" + birthday +
               ", contacts=" + contacts +
               '}';
    }
}
