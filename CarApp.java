public class CarApp {
 public static void main(String[] args) {
  Car car1 = new Car();
  Car car2 = new Car();

  //各メsetソッドを使い、car1のメンバ変数へ代入
  car1.setModel("車1号");
  car1.setHeight(1400);
  car1.setWidth(1600);
  car1.setFuel(90);

  //各setメソッドを使い、car2のメンバ変数へ代入
  car2.setModel("車2号");
  car2.setHeight(1900);
  car2.setWidth(1800);
  car2.setFuel(100);

  //car1の詳細を表示
  car1.show();

  //car2の詳細を表示
  car2.show();
 }
}