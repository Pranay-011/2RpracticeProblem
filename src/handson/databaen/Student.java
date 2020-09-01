/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 01-Sep-20
 *  Time: 5:10 PM
 */
package handson.databaen;

public class Student {
    private String name;
    private int rollNo;
    private String email;
    private long mobile;

    public Student(String name, int rollNo, String email, long mobile) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
