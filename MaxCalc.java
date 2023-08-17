public class MaxCalc {
 public static int max(int a, int b, int c) {
  int max = a;
  if(max < b){
   max = b;
  }
  if(max < c){
   max = c;
  }
  return max;
 }

 public static void main(String[] args){
  int[]japaneseScore = new int[3];
  japaneseScore[0] = 84;
  japaneseScore[1] = 92;
  japaneseScore[2] = 76;

  int maxJapaneseScore = max(japaneseScore[0],japaneseScore[1],japaneseScore[2]);

  System.out.println("国語の最大点数は" + maxJapaneseScore + "点です。");
 }
}