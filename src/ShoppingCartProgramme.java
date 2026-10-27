import java.util.Scanner;
public class ShoppingCartProgramme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String item ;
        double price ;
        int quantity;
        char currency = '$';
        double total ;

        System.out.println("Enter the item name to buy :");
        item = sc.nextLine();

        System.out.println("Enter the item price:");
        price = sc.nextDouble();

        System.out.println("Enter the item quantity:");
        quantity = sc.nextInt();

        total = price*quantity;
        System.out.println("you have bought "+ quantity +" "+ item +" ");
        System.out.println("Your total is "+ total+currency);
        sc.close();
    }
}
