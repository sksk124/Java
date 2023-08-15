public class Ex{
 public static void main(String args[]){
  String str1 = "ほげー";
  String str2 = "ほげー";
  str1 = str1 + "!";
  str2 = str2 + "!";

  if(str1.equals(str2)){
   System.out.println("文字列は同じです。");
  }else{
   System.out.println("文字列は異なります");
  }
 }
}