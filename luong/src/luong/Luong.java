package luong;

import java.util.Scanner;

public class Luong {

    public static void main(String[] args) {
        double heSoLuong, soNamLamViec;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so luong: ");
        heSoLuong=sc.nextDouble();
        System.out.println("Nhap so nam lac viec: ");
        soNamLamViec=sc.nextDouble();
        double tongLuong;
        tongLuong=heSoLuong*4000000.0+soNamLamViec*500000.0;
        System.out.println("He so luong: "+heSoLuong);
        System.out.println("So nam lam viec: "+soNamLamViec);
        System.out.println("Luong cua ban la: "+(double)tongLuong);        
    }
    
}
