package QLSV;

import java.util.Scanner;

public class Student extends Person {
    String msv;
    String email;
    float mark;

    
    public Student() {
    }
    public String getMsv() {
        return msv;
    }
    // B19DCVT060
    public boolean setMsv(String msv) {
        if(msv != null && msv.length() == 10){
            this.msv = msv;
            return true;
        }else{
            System.err.println("Nhap lai ma sinh vien: ");
            return false;
        }
        
    }
    public String getEmail() {
        return email;
    }
    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")){
            this.email = email;
            return true;
        }else{
            System.err.println("Nhap lai email sinh vien: ");
            return false;
        }
        
    }
    public float getMark() {
        return mark;
    }
    public boolean setMark(float mark) {
        if(mark >= 0 && mark <= 10){
            this.mark = mark;
            return true;
        }else{
            System.err.println("Nhap lai diem: ");
            return false;
        }
        
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        while(true){
            String inputMSV = input.nextLine();
            boolean flag = setMsv(inputMSV);
            if (flag) {
                break;
            } 
        }

        System.out.println("Nhap diem sinh vien: ");
        while(true){
            Float markInput = Float.parseFloat(input.nextLine());
            boolean flag = setMark(markInput);
            if (flag) {
                break;
            } 
        }

        System.out.println("Nhap email sinh vien: ");
        while(true){
            String inputEmail = input.nextLine();
            boolean flag = setEmail(inputEmail);
            if (flag) {
                break;
            } 
        }
    }

    // Phương thức kiểm tra xem học sinh có được học bổng hay không?
    public boolean checkScholarship() {
        if(mark >= 8.0){
            return true;
        }
        return false;
    }

    
}
