public class TwoDimensionalArray{
 public static void main(String[] args){
  //3×4の配列本体を生成(初期値あり)
  int[][] num = {{1,5,3},{2,3,6},{7,9,5},{4,1,8}};

  //配列numの要素を先頭から、変数iに代入する処理を、numの要素数分繰り返す
  for(int[] i : num){
   //配列iの要素を先頭から、変数jに代入する処理を、iの要素数分繰り返す
   for(int j : i){
    System.out.print(""+j);
   }
   System.out.println();
  }
 }
}