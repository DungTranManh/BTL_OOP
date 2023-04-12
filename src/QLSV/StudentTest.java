package QLSV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class StudentTest {
    static void showMenu(){
        System.out.println("1. Nhap vao N sinh vien: ");
        System.out.println("2. Hien thi thong tin sinh vien: ");
        System.out.println("3. Hien thi max va min theo gpa.");
        System.out.println("4. Tim kiem theo MSV.");
        System.out.println("5. Sort A -> Z theo ten SV & hien thi");
        System.out.println("6. Hien thi SV duoc hoc bong & sap xep diem theo thu tu giam dan.");
        System.out.println("7.Exit");
    }
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    int n;
                    System.out.println("Nhap so sinh vien can them: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.inputInfor();
                        studentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfor();
                    }
                    break;
                case 3:
                    int minIndex = 0;
                    int maxIndex = 0;
                    float minMark = studentList.get(0).getMark();
                    float maxMark = studentList.get(0).getMark();
                    for (int i = 1; i < studentList.size(); i++) {
                        if (studentList.get(i).getMark() < minMark) {
                            minIndex = i;
                            minMark = studentList.get(i).getMark();
                        }

                        if (studentList.get(i).getMark() > maxMark) {
                            maxIndex = i;
                            maxMark = studentList.get(i).getMark();
                        }
                    }

                    System.out.println("Sinh vien co gpa cao nhat: " + studentList.get(maxIndex).getMark());
                    System.out.println("Sinh vien co gpa thap nhat: " + studentList.get(minIndex).getMark());
                    break;
                case 4:
                    System.out.println("Nhap MSV can tim kiem: ");
                    String searchString = sc.nextLine();
                    Boolean flag = false;
                    for (Student student : studentList) {
                        if (student.getMsv().equals(searchString)) {
                            student.showInfor();
                            flag = true;
                        }
                    }

                    if(!flag){
                        System.out.println("Khong ton tai sinh vien co MSV la " + searchString);
                    }
                    break;
                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if (cmp >= 0) {
                                return -1;
                            }else{
                                return 1;
                            }
                        }
                        
                    });

                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfor();
                    }
                    break;
                case 6:
                    Collections.sort(studentList,  new Comparator<Student>(){
                        @Override
                        public int compare(Student o1, Student o2){
                            if (o1.getMark() >= o2.getMark()) {
                                return -1;
                            }else{
                                return 1;
                            }
                        }
                    });
                    for (int i = 0; i < studentList.size(); i++) {
                        if(studentList.get(i).checkScholarship()){
                            studentList.get(i).showInfor();
                        }  
                    }

                    break;
                case 7:
                System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Nhap sai!");
                    break;
            }
        } while (choice != 7);
    }

}
