public class StatementFor{
 public static void main(String[]args){
  //変数sumを生成し、0を代入
  int sum = 0;

  //変数iが10以下であれば繰り返す
  for (int i = 0; i <= 10; i++){
   //変数sumにsumとiを足した値を代入
   sum += i;
  }

  System.out.println("合計値は" + sum + "です。");
 }
}