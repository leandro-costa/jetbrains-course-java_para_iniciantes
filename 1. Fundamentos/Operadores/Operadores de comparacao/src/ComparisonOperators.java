public class ComparisonOperators
{
   public static void main(String[] args)
   {
      int number1 = 1, number2 = 2;
      boolean value1 = number1 < number2;
      System.out.println("number1 é menor que number2? " + value1);
      boolean value2 = number1 >= number2;
      System.out.println("number1 é maior ou igual a number2? " + value2);
      boolean value3 = 2*number1 == number2;
      System.out.println(" number1 é duas vezes o valor de number2? " + value3);
      boolean value4 = !(number1 != number2);
      System.out.println("number1 não é diferente de number2? " + value4);
   }
}