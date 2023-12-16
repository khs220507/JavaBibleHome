//package ch7;
//
//class Product {
//    int price;
//    int bonusPoint;
//
//    Product(int price){
//        this.price = price;
//        bonusPoint = (int) (price/10.0);
//    }
//}
//
//class Tv extends Product{
//    Tv() {
//        super(100);
//    }
//
//    public String toString(){ return "Tv";}
//}
//
//class Buyer {
//    int money = 1000;
//    int bonusPoint = 0;
//    void buy(Product p){
//        if(money<p.price){
//            System.out.println("잔액 부족");
//        }
//        money -= p.price;
//        bonusPoint += p.bonusPoint;
//        System.out.println(p + " 구매");
//    }
//}
//
//public class PolyArgumentTest {
//    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv());
//        System.out.println("현재 남은 돈은 " + b.money);
//        System.out.println("현재 보너스 점수는 " + b.bonusPoint);
//    }
//}
