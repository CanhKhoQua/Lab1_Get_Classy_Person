public class PersonTest {
    public static void main(String[] args) {
        Person loc = new Person("000001", "Loc", "Nguyen", "Mr.", 2004);
        System.out.println(loc.fullName());
        System.out.println(loc.formalName());
        System.out.println(loc.getAge());
        System.out.println(loc.getAge(2012));
        System.out.println(loc.toCSVDataRecord());

    }
}
