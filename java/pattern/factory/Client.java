package pattern.factory;

/**
 * factory pattern can be use when want to hide the creation logic from the client.
 * you also abstract the client from underlying implementation and can that way change it
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(PhoneFactory.getPhone("ios").getClass().getName());
        System.out.println(PhoneFactory.getPhone("android").getClass().getName());
    }
}
