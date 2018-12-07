import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe = "";
        String vorname = "";
        String nachname = "";
        Person[] people = new Person[1000];
        int count = 0;

        do {
            System.out.print("Geben Sie einen Vornamen ein: ");
            vorname = scanner.nextLine();

            System.out.print("Geben Sie einen Nachnamen ein: ");
            nachname = scanner.nextLine();

            people[count] = new Person(vorname, nachname);
            count++;

            System.out.printf("%nWenn Sie das Programm beenden wollen, schreiben Sie beenden: ");
            eingabe = scanner.nextLine();

        } while (!eingabe.equalsIgnoreCase("beenden"));

        printPeopleandInstances(people, count);
    }

    private static void printPeopleandInstances(Person[] people, int count) {
        for (int i = 0; i < count; i++) {
            System.out.printf("Person %d: %s%n", ++i, people[--i].getAusgabe());
        }
        System.out.printf("Instanzen: %s", Person.getInstanzen());
    }
}
