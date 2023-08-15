import java.util.Scanner;

public class Variable {
    public static void main (String[] args) {
        //文字用の箱「str」を作成
        String str;

        //数値用の箱「i」を作成
        int i;

         //新しい変数 str_2 に 27 を代入
        String str_2 = "27";
        
        //新しい変数 j にキーボードから入力された値を代入
        System.out.println("数値を入力してください");

        //入力機能の設置(入力した内容が変数jへ入る)
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();

        //変数 str と i に変数 str_2 と j の値を代入
        str = str_2;
        i = j;

        //変数 c の値と変数 i の値を表示
        System.out.println("変数 str の値は" + str + "です。");
        System.out.println("変数 i の値は" + i + "です。");
    }
}