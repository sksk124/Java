import java.util.Scanner;

public class StatementDoWhile{
 public static void main(String[]args){
  //キーボード入力を受け付ける
  Scanner numIn = new Scanner(System.in);

  //変数xを生成
  int x;

  //必ず一度は実行
  do{
   //ユーザーに数字の入力を促す
   System.out.println("一桁の数字を入力してください");

   //ユーザーから入力された数字を変数xに代入
   x = numIn.nextInt();
  }while(x < (-9) || (x > 9));

  //反転した数字を表示
  System.out.println("あなたが入力した数字を符号反転した数字は" + (-1 * x) + "になります。");
 }
}