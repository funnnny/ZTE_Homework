package com.commit;

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
