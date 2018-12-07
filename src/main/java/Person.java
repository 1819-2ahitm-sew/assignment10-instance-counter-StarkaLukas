public class Person {
    private String vorname = "";
    private String nachname = "";
    private static int instanzen = 0;
    private String ausgabe = "";

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        instanzen++;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public static int getInstanzen() {
        return instanzen;
    }

    public String getAusgabe() {
        ausgabe = getVorname() + " " + getNachname();

        return ausgabe;
    }
}
