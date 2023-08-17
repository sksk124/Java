public class CarApp {
  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();

    car1.model = "車1号";
    car1.height = 1400;
    car1.width = 1600;
    car1.fuel = 90;

    car2.model = "車2号";
    car2.height = 1900;
    car2.width = 1800;
    car2.fuel = 100;

    System.out.println("*" + car1.model + "の詳細*");
    System.out.println("モデル名:" + car1.model);
    System.out.println("車高　　:" + car1.height);
    System.out.println("車幅　　:" + car1.width);
    System.out.println("燃料容量:" + car1.fuel);

    System.out.println("*" + car2.model + "の詳細*");
    System.out.println("モデル名:" + car2.model);
    System.out.println("車高　　:" + car2.height);
    System.out.println("車幅　　:" + car2.width);
    System.out.println("燃料容量:" + car2.fuel);
  }
}