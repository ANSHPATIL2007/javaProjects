import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        //weight conversion

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("weight conversion program");
        System.out.println("1.convert lbs to kgs ");
        System.out.println("2.convert kgs to lbs ");

        System.out.println("choose your choice");
        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("enter the weight in lbs");
                weight = sc.nextDouble();
                newWeight = weight * 0.453592;
                System.out.println("your weight is "+ newWeight);
                break;
                case 2:
                    System.out.println("enter the weight in kgs");
                    weight = sc.nextDouble();
                    newWeight = weight * 2.20462;
                    System.out.println("your weight is "+ newWeight);
                    break;
                    default:
                        System.out.println("invalid choice");

        }
        sc.close();




    }
}
