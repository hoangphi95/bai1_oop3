package bai1.service;

import bai1.Lecturers;

import java.util.ArrayList;

public class LecturersService {
    Lecturers lecturers = new Lecturers();
    private static ArrayList<Lecturers> list = new ArrayList<>();

    public void Create(Lecturers lecturers) {
        list.add(lecturers);

    }

    public ArrayList<Lecturers> xem() {
        if (list != null) {
            Lecturers lt = new Lecturers("12", "Lan", "Văn", "10A3");
            Lecturers lt2 = new Lecturers("13", "Phượng", "Toán", "10A4");
            Lecturers lt3 = new Lecturers("15", "Ngọc", "Anh", "10A5");
            Lecturers lt4 = new Lecturers("18", "Nam", "ly", "10A8");
            Lecturers lt5 = new Lecturers("20", "thiếp", "địa", "10A11");
            list.add(lt);
            list.add(lt2);
            list.add(lt3);
            list.add(lt4);
            list.add(lt5);
        }
        return list;
    }

    public void update(Lecturers lecturers) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(lecturers.getMgv())) {
                list.add(lecturers);

            }
        }
    }

    public void delele(Lecturers lecturers) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && list.get(i).equals(lecturers.getMgv())) {
                list.remove(lecturers);
            }
        }
    }

    public void timKiemMgv(String tk2) {
        xem();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getMgv().equals(tk2)) {
                System.out.println(list.get(i).toString());
            }
        }

    }

    public void timKiemTenGV(String tk) {
        xem();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMgv().equals(tk)) {

            }
        }

    }

    public boolean KtMgv(String kt2) {
        xem();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getMgv().equals(kt2)) {
                return true;
            }
            else {
                return false;
            }
        }
        return true;

    }

    public boolean KTTenGV(String kt) {
        xem();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMgv().equals(kt)) {
                return true;
            }else {
                return false;
            }


        }
        return true;

    }
}