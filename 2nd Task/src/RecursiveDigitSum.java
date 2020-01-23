

public class RecursiveDigitSum {
//		We define super digit of an integer using the following rules:
//		Given an integer, we need to find the super digit of the integer.
//		- If x has only 1 digit, then its super digit is x.
//		- Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
//		For example, the super digit of 9875 will be calculated as:
//
//		superDigit(9875) [9+8+7+5 = 29] => 
//		superDigit(29) [2 + 9 = 11] =>
//		superDigit(11) [1 + 1 = 2] =>
//		superDigit(2) = 2

 static long superDigit(long x) {
     // TODO
     Long num = x;

     if (num.toString().length() == 1) {
         return x;
     } else {
         long sum = 0;
         for (int i = 0; i < num.toString().length(); i++) {
             sum += Long.parseLong(num.toString().substring(i, i + 1));
         }
         System.out.println(sum);
         return superDigit(sum);

     }

 }

 public static void main(String[] args) {
     System.out.println(superDigit(9875));

 }

}