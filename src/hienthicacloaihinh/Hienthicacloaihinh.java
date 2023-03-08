package hienthicacloaihinh;

import java.util.Scanner;

public class Hienthicacloaihinh {
    public static void main(String[] args) {
        // In ra hình chữ nhật
        int width = 7;
        int height = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();


        //In hình tam giác vuông, có cạnh góc vuông ở botton-left
        for (int i = 1; i <= 7 ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
            sc.close();



            //In hình tam giác vuông, có cạnh góc vuông ở top-left
            for (int i = 7; i >=1; i--) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        System.out.println();
                sc.close();
                
                // In ra hình tam giác cân
              // số hàng của tam giác là 8
        for (int i = 0; i < 8; i++) {
            for (int j = 8 - i; j > 1; j--) {
                System.out.print(" "); // in ra các khoảng trống
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // in ra các dấu *
            }
            System.out.println(); // xuống dòng
            
        }
        }

        }





