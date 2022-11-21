public class CafeReceipt
{
    public static void main(String[] args)
    {
        String customerName = "Pedro";
        int cupsOfCoffee = 1;
        double costOfCoffee = 9.9;
        boolean tip = true;

        System.out.println("Caro " + customerName + ", obrigado por apoiar nosso negócio!");
        System.out.println("Xícaras de café compradas: " + cupsOfCoffee + ".");
        System.out.println("Custo de " + cupsOfCoffee + " xícara(s) de café: R$ " + costOfCoffee + ".");
        System.out.println("Seu total é: R$ "+costOfCoffee+".");
        System.out.print("A gorjeta está incluída? " + tip + ".");
    }
}