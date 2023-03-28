package bai1.service;

import bai1.Lecturers;
import bai1.Student;

import java.util.ArrayList;

public class Servicer {
    LecturersService ls=new LecturersService();
    StudentService ss=new StudentService();
    public void timKiemTenChung(String ten){
        ArrayList<Lecturers> list= ls.xem();
        ArrayList<Student> list2=ss.xem();
        for(int i=0;i<list.size();i++){
            if (list.get(i).getTenGv().equals(ten)){
                System.out.println(list.get(i));
                break;
            }
        }
        for (int j=0;j<list2.size();j++){
            if (list2.get(j).getTenSv().equals(ten)){
                System.out.println(list2.get(j));
                break;
            }
        }

    }
    public void timKiemMsvChung(String msv){
        ArrayList<Lecturers> list1= ls.xem();
        ArrayList<Student> list3=ss.xem();
        for(int i=0;i<list1.size();i++){
            if (list1.get(i).getMgv().equals(msv)){
                System.out.println(list1.get(i));
                break;
            }
        }
        for (int j=0;j<list3.size();j++){
            if (list3.get(j).getMsv().equals(msv)){
                System.out.println(list3.get(j));
                break;
            }
        }
    }
}
