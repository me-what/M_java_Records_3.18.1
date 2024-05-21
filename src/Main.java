public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom",  36);

        System.out.println(tom.name());
        System.out.println(tom.age());
        System.out.println(tom.hashCode());

        Person bob = new Person("Bob", 21);
        Person tomas = new Person("Tom", 36);
        System.out.println(tom.equals(bob));
        System.out.println(tom.equals(tomas));
    }
}