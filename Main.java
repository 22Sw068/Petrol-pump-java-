import java.util.Scanner;

class PetrolPump {

    private int choice;
    private float rupees;
    private float liter;

    public void welcomeMessage() {
        System.out.println("\n\n\t\t Welcome to the Khan's Petrol pump project:");
    }

    public void fillPetrol() {
        System.out.println("\n\t\t Welcome to the petrol unit");
        System.out.print("\n\nEnter the Rupees: ");
        Scanner scanner = new Scanner(System.in);
        rupees = scanner.nextFloat();

        for (float i = 1; i <= rupees; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clearScreen();
            System.out.print("\n\n\n Rupees : Rs." + i);
            System.out.print("\n\n liters : " + i / 270.50);
            System.out.print("\n\n\n Rs/liter : 270.50");
        }
    }

    public void displayMenu() {
        System.out.println("\n\n\t Please Select your option :");
        System.out.println("1.Petrol: \t\t\t liter Rs.267.90");
        System.out.println("2.Disel:  \t\t\t liter Rs.295.30");
        System.out.println("3.Direct petrol filling ");
        System.out.println("4.Direct Disel filling  ");
        System.out.println("5.fill out in liter");
        System.out.println("6.Press 6 go to setting ");
    }

    public void handleChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice (1, 2, 3, 4, 5, 6) for Fuellling");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                fillPetrol();
                break;

            case 2:
                System.out.println("\n\t\t Welcome to Disel unit");
                System.out.print("\n\nEnter the Rupees: ");
                rupees = scanner.nextFloat();

                for (float i = 1; i <= rupees; i++) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    clearScreen();
                    System.out.println("\n\n\n Rupees : Rs." + i);
                    System.out.println("\n\n liters : " + i / 295.30);
                    System.out.println("\n\n\n Rs/liter : 295.30");
                }
                break;

            case 6:
                System.out.println("\n\t No:1 Average setting      8950");
                System.out.println("\n\t No:2 price setting        5846");
                System.out.println("\n\t No:3 Meter speed setting  3546");
                break;
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t Welcome To ");
        sleep(800);
        System.out.println("\t  MY  PETROL PUMP");
        sleep(800);
        System.out.println("\t Petrolium Service ");
        sleep(800);
        System.out.println("\n\t Roll No 22SW068");
        sleep(800);
        clearScreen();

        PetrolPump pump = new PetrolPump();
        pump.welcomeMessage();
        pump.displayMenu();
        pump.handleChoice();
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
