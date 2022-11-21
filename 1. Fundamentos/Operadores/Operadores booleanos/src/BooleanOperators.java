public class BooleanOperators
{
   public static void main(String[] args)
   {
      boolean declaracao1 = true, declaracao2 = false;
      System.out.print("Não verdade é ");
      System.out.println(!declaracao1);
      System.out.print("Verdadeiro e falso é ");
      System.out.println(declaracao1 && declaracao2);
      System.out.print("Verdadeiro ou falso é ");
      System.out.println(declaracao1 || declaracao2);
      System.out.print("Não (Verdadeiro e não falso) é ");
      System.out.println(!(declaracao1 && !declaracao2));
   }
}