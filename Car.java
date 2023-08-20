public class Car implements CarService{
 private String model;
 private int height;
 private int width;
 private int fuel;

 //モデルを出力する
 public String getModel(){
  return model;
 }

 //モデルを入力する
 public void setModel(String model){
  this.model = model;
 }

 //車高を出力する
 public int getHeight(){
  return height;
 }

 //車高を入力する
 public void setHeight(int height){
  this.height = height;
 }

 //車幅を出力する
 public int getWidth(){
  return width;
 }

 //車幅を入力する
 public void setWidth(int width){
  this.width = width;
 }

 //燃料を出力する
 public int getFuel(){
  return fuel;
 }

 //燃料を入力する
 public void setFuel(int fuel){
  this.fuel = fuel;
 }

 //各出力メソッドを使い、詳細を表示
 public void show(){
  System.out.println("*" + getModel() + "の詳細*");
  System.out.println("モデル名:" + getModel());
  System.out.println("車高 :" + getHeight());
  System.out.println("車幅 :" + getWidth());
  System.out.println("燃料容量:" + getFuel());
 }
}