public class Wrapper {
    public static void main(String[] args){

        String hello = new String("hello");
        String world = new String("hello");

        // Ici on compare les chaînes de caractères
        System.out.println( hello.equals(world) ); // true

        // Ici on compare les références
        System.out.println( hello == world );      // false
    }
}
