public class ChangingValues
{
   public static void main(String[] args)
   {
      int hoursInADay = 24;
      int workHours = 9;
      int sleepHours = 8;
      int freeHours = hoursInADay - (workHours + sleepHours);

      System.out.println("Eu tenho " + freeHours + " horas livre por dia.");

      workHours = workHours + 5;
      freeHours = hoursInADay - (workHours + sleepHours);

      System.out.println("Eu consegui um emprego de meio periodo. Agora so tenho " + freeHours + " horas livre por dia :(" );
   }
}
