import java.util.ArrayList;
public class Menge{
    ArrayList<Person> al1 =  new ArrayList<>();
    ArrayList<Person> al2 =  new ArrayList<>();
    void testen() {

        Person person = new Person("Duong", "Nguyen");
        Person person1 = new Person("Duong", "Nguyen");
        al1.add(person1);

        boolean nameVergeben = al1.contains(person);
        if (nameVergeben == false) {
            al1.add(person);
        } else {
            System.out.println("Nachname und Vorname existiert bereits");
        }
    }
    /**-------------------------------------------------------------**/
    void aufgabeA(){            /**leere Menge**/
        ArrayList<Person> al = new ArrayList<>();
    }

    void aufgabeB(){
    ArrayList<Person> al = new ArrayList<>();
    al = this.al2;
        
    }

    void aufgabeC(){
        boolean gleichheit= al1==al2;

    }

    void aufgabeD(){
        Person person = new Person("Cooler","Typ");
        al1.add(person);
    }

    void aufgabeE(){
        Person person = new Person("Cooler","Typ");
        ArrayList<Person> al = new ArrayList<>();
        al.remove(person);
    }
    void aufgabeF(){
        Person person = new Person("Cooler","Typ");
        ArrayList<Person> al = new ArrayList<>();
        al.remove(person);
    }

    public boolean aufgabeG(String firstName, String lastName) {
        for (Person p : al1) {
            if (p.getVorname().equals(firstName) && p.getNachname().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public void schnittmenge(Menge other) {
        Menge schnittmengen = new Menge();
        ArrayList<Person> al = new ArrayList<>();
        for (Person p : al) {
            if (other.contains(p.getVorname(), p.getNachname())) {
                schnittmengen.add(p);
            }
        }
    }
}
