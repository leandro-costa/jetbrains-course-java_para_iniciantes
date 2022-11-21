public class ShortcutOperators
{
   public static void main(String[] args)
   {
      int x = 1, y = 3, z = -2;
      x++;
      System.out.println("x agora é " + x);
      z--;
      System.out.println("z agora é " + z);
      y += x;
      System.out.println("y agora é " + y);
      z *= x-y;
      System.out.println("z finalmente é " + z);
   }
}