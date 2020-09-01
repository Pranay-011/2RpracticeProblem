/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Aug-20
 *  Time: 12:24 PM
 */
package databean;
//step 1
public class Employee {
    //step 2
    private String firstName;
    private String lastName;
    private double salary;
    private int empId;
    private double experience;
    private long mobile;
    private String email;

    //step 3
    //declare constructor parameterized or no-arguments, not defining any constructor
    // using the default constructor provided by java

    //step 4


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "[ " + firstName + ", " + lastName + ", " + salary +
                ", " + empId + ", " + experience + ", " + email + "," + mobile + " ] \n";
    }

}
