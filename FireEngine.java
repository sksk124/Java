public class FireEngine extends Car{
 //消化用の水量を表すメンバ変数water
 private int water;

 //消化用の水量を出力する
 public int getWater(){
  return water;
 }

 //消化用水量を入力する
 public void setWater(int water){
  this.water = water;
 }

 //getメソッドを使い、それぞれのメンバ変数を表示
 //(親クラスのshowメソッドを呼び出し、かつshowメソッドをオーバーライド)
 public void show(){
  super.show();
  System.out.println("消化用水量" + getWater());
 }
}