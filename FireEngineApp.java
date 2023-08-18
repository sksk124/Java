public class FireEngineApp{
 public static void main(String[] args){
  Car car1 = new Car();
  Car car2 = new Car();
  //FireEngineクラスをfireEngine1という名称でインスタンス化
  FireEngine fireEngine1 = new FireEngine();

  car1.setModel("車1号");
  car1.setHeight(1400);
  car1.setWidth(1600);
  car1.setFuel(90);

  car2.setModel("車2号");
  car2.setHeight(1900);
  car2.setWidth(1800);
  car2.setFuel(100);

  //各setメソッドを使い、fireEngine1のメンバ変数へ代入
  fireEngine1.setModel("消防車");
  fireEngine1.setHeight(2500);
  fireEngine1.setWidth(2000);
  fireEngine1.setFuel(200);
  fireEngine1.setWater(500);

  car1.show();

  car2.show();

  //fireEngine1の詳細を表示
  fireEngine1.show();
 }
}