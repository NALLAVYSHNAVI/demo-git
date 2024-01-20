public class Main {
    public static void main(String[] args) {

        Person defaultPerson = new Person();
        System.out.println("Default Person");
        defaultPerson.displayInfo();
        Person namedPerson = new Person("Vyshu", 23 );
        System.out.println("Named Person");
        namedPerson.displayInfo();
    }
}
