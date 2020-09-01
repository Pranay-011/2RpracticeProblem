/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Aug-20
 *  Time: 12:31 PM
 */
package main;

import databean.Employee;

import java.util.Arrays;
import java.util.Scanner;

//step 5
public class EmployeeMain {
    //step 6
    public static void main(String[] args) {
        //step 7
        //creating array of employee
        //example fro int[]
        //int[] arr = new int[5];
        Employee[] arr = new Employee[3];
        System.out.println(Arrays.toString(arr));
        //creating object of Employee to print it using sout
        //scanner for user input
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {


            Employee employee = new Employee();
            System.out.println("enter first name");
            employee.setFirstName(sc.nextLine());
            System.out.println("enter last name");
            employee.setLastName(sc.nextLine());
            System.out.println("enter salary");
            employee.setSalary(sc.nextDouble());
            System.out.println("enter emp id");
            employee.setEmpId(sc.nextInt());
            System.out.println("enter experience");
            employee.setExperience(sc.nextDouble());
            System.out.println("enter mobile");
            employee.setMobile(sc.nextLong());
            sc.nextLine();
            System.out.println("enter email");

            employee.setEmail(sc.nextLine());

            arr[i] = employee;

        }

        System.out.println(Arrays.toString(arr));
        //calong sort funtion
        Employee[] sorted = sortSalaryOrder(arr);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(sorted));


    }
    //sorting by salary in descending order
    public static Employee[] sortSalaryOrder(Employee[] arr){
        Employee[] response = arr.clone();
        for (int i = 0; i < response.length; i++) {
            for (int j = 0; j < response.length - 1 ; j++) {
                if(response[i].getSalary() < response[j+1].getSalary()){
                    //swapping
                    Employee temp = response[j];
                    response[j] = response[j+1];
                    response[j+1] = temp;
                }

            }
        }
        return response;
    }
}
