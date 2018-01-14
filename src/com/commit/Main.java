package com.commit;
/**
 * 有这样一个书店，它会根据书的不同种类计算出不同的折扣，下面为图书的折扣系数：

 新书=1.2
 常规图书=1.0
 滞销图书=0.6
 现在书店需要一个结账系统，请你使用Java 8完成编写这个程序。
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String []str = sc.nextLine().split(" ");
            String type = str[0];
            try{
                double price = Double.parseDouble(str[1]);
                Discount discount = new Discount();
                Book book = new Book(type, price);
                double totalPrice = discount.getDiscount(book);
                System.out.println(totalPrice);
            }catch (Exception e){
                System.out.println("PRICE ERROR");
            }
        }
        sc.close();
    }
}
