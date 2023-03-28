package bai1.controller;

import bai1.service.Servicer;

import java.util.Scanner;

public class ControllerFull {
    Servicer s=new Servicer();
    Scanner sc=new Scanner(System.in);
    public void searchChungTen(){
        System.out.println("Nhập tên");
        String ten=sc.nextLine();
        s.timKiemTenChung(ten);


    }
    public void searchChungMsv(){
        System.out.println("Nhập Msv");
        String msv=sc.nextLine();
        s.timKiemMsvChung(msv);


    }
}
