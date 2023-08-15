public class Array{
 public static void main(String[] args){
  //5個の配列本体を生成
  int[] num = new int[5];

  //配列numの要素数未満繰り返す
  for(int i = 0; i < num.length; i++){
   num[i] = i + 1;
  }

  //配列numの要素を先頭から、変数jに代入する処理を、numの要素数分繰り返す
  for(int j : num){
   System.out.println(j);
  }
 }
}