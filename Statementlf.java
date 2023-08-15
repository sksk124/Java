import java.util.Scanner;

public class Statementlf{
 public static void main(String args[]){
   Scanner numIn = new Scanner(System.in);
   System.out.println("数字を入力してください");

   int x = numIn.nextInt();


   //ここか条件分岐
   switch(x){
    case 0://xの値が0の時
     System.out.println("xの値は0です。");
     break;
    case 1://xの値が1の時
     System.out.println("xの値は1です。");
     break;
    case 2://xの値は2の時
     System.out.println("xの値は2です。");
     break;
    default://それ以外の時
     System.out.println("xの値は正か負です。");
   }
  }
}