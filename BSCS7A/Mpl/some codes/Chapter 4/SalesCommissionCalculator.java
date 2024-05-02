import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double commission, earnings, gross_sales_in_the_week, sold_1_items, sold_2_items;
        double sold_3_items, sold_4_items, weekly_salary;
        System.out.print("Enter the value of sold 1 items: ");
        sold_1_items = in.nextDouble();
        in.nextLine();
        System.out.print("Enter the value of sold 2 items: ");
        sold_2_items = in.nextDouble();
        in.nextLine();
        System.out.print("Enter the value of sold 3 items: ");
        sold_3_items = in.nextDouble();
        in.nextLine();
        System.out.print("Enter the value of sold 4 items: ");
        sold_4_items = in.nextDouble();
        in.nextLine();
        weekly_salary=200;
        gross_sales_in_the_week=sold_1_items*239.99+sold_2_items*129.75+sold_3_items*99.95+sold_4_items*350.89;
        commission=gross_sales_in_the_week*0.09;
        earnings=weekly_salary+commission;
        System.out.println("Value of commission: " + commission);
        System.out.println("Value of earnings: " + earnings);
        System.out.println("Value of gross sales in the week: " + gross_sales_in_the_week);
        System.out.println("Value of weekly salary: " + weekly_salary);
    }

}