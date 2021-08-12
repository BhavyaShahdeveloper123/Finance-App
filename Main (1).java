import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nameInput = "";
        int age = 0;
        int choice = 0;
        String disability = "";

        System.out.println("       Beyond Finance");
        System.out.println("______________________________");

        System.out.print("Hello! Before we get started, we would like to know if you may have any disabilities so our services can ease the process for you :): ");
        disability = in.nextLine();

        System.out.print("Perfect! Would you please enter your name: ");
        nameInput = in.nextLine();

        System.out.print("Please enter your age: ");
        age = in.nextInt();

        in.nextLine();

        System.out.println("\nBelow is the list of options to help you in your financial journey:");

        System.out.println("1) Savings and Budget Tracker");
        System.out.println("2) Stock Simulator");
        System.out.println("3) Financial Aid Finder");
        System.out.println("4) Recommended Financial Books");
        System.out.println("5) Invest into Savings");

        System.out.print("\nPlease enter your desired choice: ");
        choice = in.nextInt();

        if (choice == 1) {
            saveBudget(nameInput);
        } else if (choice == 2) {
            stockSim();
        } else if (choice == 3) {
            scholarshipFinder();
        } else if (choice == 4) {
            finBooks();
        }
    }

    public static void saveBudget(String name) {
        double spending = 0;
        double income = 0;
        double savings = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("\nHello, " + name + ". Welcome to the savings and budget tracker! Let us get started :)");

        System.out.print("\nPlease enter your weekly income amount in dollars (to 2 decimals): $");
        income = in.nextDouble();
        in.nextLine();

        System.out.print("Please enter your weekly spending amount in dollars (to 2 decimals): $");
        spending = in.nextDouble();
        in.nextLine();

        System.out.print("Please enter your weekly savings goal amount in dollars (to 2 decimals): $");
        savings = in.nextDouble();
        in.nextLine();

        System.out.print("\nYou currently have: $" + (income - spending) + " in your account. ");

        if (income - spending >= savings) {
            System.out.print("You are on track for your savings goal. Congratulations!");
        } else {
            System.out.print("You should try to spend less. Try spending $" + (Math.round(((income - savings)/7))) + ".00 per day.");
        }

    }

    public static void stockSim() {
        System.out.println("\nYou are given $10,000 to invest into stocks. Have fun investing!");

        System.out.println("1) Uber Technologies | Buy @ $43.00 | Sell @ $42.00");
        System.out.println("2) Amazon.com | Buy @ $3300.00 | Sell @ $3291.00");
        System.out.println("3) Apple Inc. | Buy @ $145.00 | Sell @ $146.00");

        System.out.println("\nWhich stocks would you like to invest in?");
    }

    public static void scholarshipFinder() {
        double income = 0;
        String school = "";

        Scanner in = new Scanner(System.in);

        System.out.println("\nLet us help you find some financial aid! We would require you to fill out some information to see what you may be eligible for.");

        System.out.println("What is your yearly income in dollars (to 2 decimals): $");
        income = in.nextDouble();
        in.nextLine();

        System.out.println("Are you currently attending school/post-secondary education (Y for yes, N for no): ");
        school = in.nextLine();

        if (school.equals("Y")) {
            System.out.println("Below are some scholarships we found for you!");
            System.out.println("1) OSAP");
            System.out.println("2) Scholarship 1");
            System.out.println("3) Scholarship 2");
        } else {
            System.out.println("Below are some financial aids we found for you!");
            System.out.println("1) Aid 1");
            System.out.println("2) Aid 2");
            System.out.println("3) Aid 3");
        }

    }

    public static void finBooks() {

        System.out.println("\nHere are some recommended financial books to help you on your journey!");

        System.out.println("1) The Intelligent Investor: The Definitive Book on Value Investing");
        System.out.println("2) Think and Grow Rich");
        System.out.println("3) Rich Dad Poor Dad");
        System.out.println("4) The Theory of Investment Value");
        System.out.println("5) The Investment Answer ");
    }

}
