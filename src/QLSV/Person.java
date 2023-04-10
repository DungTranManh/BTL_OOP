package QLSV;

import java.util.Scanner;

public class Person {
    String name;
    String gender;
    String dob;
    String address;

    public Person() {
    }
    public Person(String name, String gender, String dob, String address) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getDob() {
        return dob;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public void inputInfor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = input.nextLine();

        System.out.println("Nhap gioi tinh: ");
        gender = input.nextLine();

        System.out.println("Nhap ngay sinh: ");
        dob = input.nextLine();

        System.out.println("Nhap dia chi: ");
        address = input.nextLine();

    }

    public void showInfor() {
        System.out.println("Ten: " + name + ";gioi tinh: " + gender + ";ngay sinh: " + dob + ";dia chi: " + address);                
    }
    

    
    
}
