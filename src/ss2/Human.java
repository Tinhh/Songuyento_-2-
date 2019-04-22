package ss2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Human {
    public int x;

    public int getX() {
        return this.x;
    }

    public void setX() {
        if (xacdinh_x(x)) {
            System.out.println(x + " la So nguyen to. ");
            return;
        } else {
            System.out.println("Day khong phai so nguyen to. Moi nhap lai:");
            khaibao_x();
        }
    }

    // hàm khai báo x và đưa ra câu kêt luận x có là số ng tố k
    public void khaibao_x(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so x");
        x = scanner.nextInt();
                setX();
                getX();
    }

    //Hàm check x có phải số nguyên tố không
    public static boolean  xacdinh_x(int x){
        if(x < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= squareRoot ; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public void tim_lienke_x(){
        for (int i = x + 1; i < 100000 ; i++) {
            if(xacdinh_x(i)){
                System.out.println(i +" "+"la so nguyen to lien ke cua"+ " " + x);
                break;
            }
        }
    }

//    public int getX() {
//        return x;
//    }
//
//    public void setX() {
//        if (xacdinh_x(x)) {
//            System.out.println(x + " la So nguyen to. ");
//            return;
//        } else {
//            System.out.println("Day khong phai so nguyen to. Moi nhap lai:");
//            khaibao_x();
//        }
//    }
}
