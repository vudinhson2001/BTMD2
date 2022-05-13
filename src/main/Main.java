package main;

import danhba.People;
import filecsv.FileCSV;
import manage.PeopleManage;
import menu.Menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PeopleManage peopleManage = new PeopleManage();
        peopleManage.add(new People(999, "Nguoi Than", "Vu", "Nam", "Ha Noi"));
        peopleManage.add(new People(666, "Ban Be", "Son", "Nam", "Quang Ninh"));
        peopleManage.add(new People(222, "Doi Tac", "Bich", "Nam", "Thai Nguyen"));
        peopleManage.add(new People(333, "Nguoi Than", "Linh", "Nu", "Thai Binh"));
        peopleManage.add(new People(555, "Doi Tac", "Lan", "Nu", "Nam Dinh"));
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int choice = -1;
        do {
            Menu.menuList();
            try {
                choice = scanner1.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("vui long nhap lai lua chon ");
                scanner1.nextLine();
            }
            scanner1.nextLine();
            if (choice == 1) {
                peopleManage.display();
            } else if (choice == 2) {
                System.out.println("nhap sdt : ");
                int nhapPhone = -1;
                boolean checkInput1 = true;
                do {
                    try {
                        nhapPhone = scanner1.nextInt();
                        checkInput1 = false;
                    } catch (InputMismatchException e) {
                        System.err.println("Vui long nhap lai !!!");
                        scanner1.nextLine();
                        checkInput1 = true;
                    }
                } while (checkInput1);
                System.out.println("Nhap nhom : ");
                String nhapNhom = scanner.nextLine();
                System.out.println("nhap ten : ");
                String nhapTen = scanner.nextLine();
                System.out.println("Nhap gioi tinh :");
                String nhapSex = scanner.nextLine();
                System.out.println("nhap dia chi : ");
                String nhapDiaChi = scanner.nextLine();
                People people = new People(nhapPhone, nhapNhom, nhapTen, nhapSex, nhapDiaChi);
                peopleManage.add(people);
            }
            if (choice == 3) {
                System.out.println("nhap ten can cap nhap :");
                String suaTen = scanner.nextLine();
                System.out.println("nhap sdt : ");
                int nhapPhone1 = -1;
                boolean checkInput1 = true;
                do {
                    try {
                        nhapPhone1 = scanner1.nextInt();
                        checkInput1 = false;
                    } catch (InputMismatchException e) {
                        System.err.println("Vui long nhap lai !!!");
                        scanner1.nextLine();
                        checkInput1 = true;
                    }
                } while (checkInput1);
                System.out.println("Nhap nhom : ");
                String nhapNhom1 = scanner.nextLine();
                System.out.println("nhap ten : ");
                String nhapTen1 = scanner.nextLine();
                System.out.println("Nhap gioi tinh :");
                String nhapSex1 = scanner.nextLine();
                System.out.println("nhap dia chi : ");
                String nhapDiaChi1 = scanner.nextLine();
                People people1 = new People(nhapPhone1, nhapNhom1, nhapTen1, nhapSex1, nhapDiaChi1);
                peopleManage.edit(suaTen, people1);
            } else if (choice == 4) {
                System.out.println("nhap ten can xoa : ");
                String xoaTen = scanner.nextLine();
                peopleManage.delete(xoaTen);
            }
            if (choice == 5) {
                System.out.println("nhap ten can tim kiem : ");
                String timKiemTen = scanner.nextLine();
                peopleManage.search(timKiemTen);
            } else if (choice == 6) {
                FileCSV.readFromFile();
            } else if (choice == 8) {
                System.exit(0);
            }
        } while (choice != 8);
    }
}
