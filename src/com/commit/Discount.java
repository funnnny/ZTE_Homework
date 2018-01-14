package com.commit;

class Discount {

    private double totalPrice = 0;

    double getDiscount(Book book){
        if(book.getPrice() > 0.0){
            switch (book.getType()) {
                case "new":
                    totalPrice += book.getPrice() * 1.2;
                    break;
                case "old":
                    totalPrice += book.getPrice() * 0.6;
                    break;
                case "normal":
                    totalPrice += book.getPrice();
                    break;
                default:
                    System.out.println("TYPE ERROR");
                    break;
            }
        }else{
            System.out.println("PRICE ERROR");
        }
        return totalPrice;
    }
}

