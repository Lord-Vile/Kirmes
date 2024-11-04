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
        visitAttraction();
    }
    public static void visitAttraction(){
        if (person1.getMoney() >= attraktion1.getPrice()){
            person1.setMoney(person1.getMoney() - attraktion1.getPrice());
            System.out.println("Olaf kann " + attraktion1.getAttraktion() + " besuchen und hat dann noch " + person1.getMoney() + "€.");
        }
        if (person2.getMoney() >= attraktion2.getPrice()){
            person2.setMoney(person2.getMoney() - attraktion2.getPrice());
            System.out.println("Olaf kann " + attraktion2.getAttraktion() + " besuchen und hat dann noch " + person2.getMoney() + "€.");
        }
        if (person3.getMoney() >= attraktion3.getPrice()){
            person3.setMoney(person3.getMoney() - attraktion3.getPrice());
            System.out.println("Olaf kann " + attraktion3.getAttraktion() + " besuchen und hat dann noch " + person3.getMoney() + "€.");
        }

    }
}
