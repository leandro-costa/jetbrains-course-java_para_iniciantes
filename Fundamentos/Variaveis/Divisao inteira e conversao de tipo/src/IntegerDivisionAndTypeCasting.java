public class IntegerDivisionAndTypeCasting
{
   public static void main(String[] args)
   {
      int pessoas = 4, bolinhos = 14;
      double preço = 150;

      System.out.println("Nós pedimos" + bolinhos + " bolinhos; custo R$" + preço + ".");
      System.out.println("Cada um de nós tem que pagar R$" + preço/pessoas + ".");
      System.out.println("E cada um de nós comemos " + bolinhos/pessoas + " bolinhos.");

      System.out.println("...erro meu, eu estava fazendo uma divisão inteira.");
      System.out.println("Cada um de nós comemos " + (double) bolinhos/pessoas + " bolinhos.");
   }
}
