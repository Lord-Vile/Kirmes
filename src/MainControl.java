public class MainControl {

    private static Visitor person1, person2, person3;
    private static Attraction attraktion1, attraktion2, attraktion3;

    public static void main(String[] args) {
        person1 = new Visitor("Olaf", 500);
        person2 = new Visitor("Thomas", 800);
        person3 = new Visitor("Günther", 1200);
        attraktion1 = new Attraction("Achterbahn", "Schnell", 35);
        attraktion2 = new Attraction("Gruselachterbahn", "gruselig", 45);
        attraktion3 = new Attraction("Riesenrad", "groß", 50);
        System.out.println(person1.getName() + " (" + person1.getMoney() + "€) geht zu: " + attraktion1.getAttraktion() + " und "  + attraktion3.getAttraktion() + "; Preis: " + attraktion1.getPrice() + "€ + " + attraktion3.getPrice() + "€; Beschreibung: " + attraktion1.getDescription() + " und " +  attraktion3.getDescription());
        System.out.println(person2.getName() + " (" + person2.getMoney() + "€) geht zu: " + attraktion2.getAttraktion() + " und "  + attraktion3.getAttraktion() + "; Preis: " + attraktion2.getPrice() + "€ + " + attraktion3.getPrice() + "€; Beschreibung: " + attraktion2.getDescription() + " und " +  attraktion3.getDescription());
        System.out.println(person3.getName() + " (" + person3.getMoney() + "€) geht zu: " + attraktion1.getAttraktion() + " und "  + attraktion2.getAttraktion() + "; Preis: " + attraktion1.getPrice() + "€ + " + attraktion2.getPrice() + "€; Beschreibung: " + attraktion1.getDescription() + " und " +  attraktion2.getDescription());
    }
}
