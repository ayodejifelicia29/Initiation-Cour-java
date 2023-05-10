public class App {
    
    public static void main(String[] args) {

        // Structures de données
        // ---------------------
        
        // Types primitifs
        int monEntier = 50;
        double monFloat = 10.99;
        char[] monCaractere = { 'b', 'o', 'n', 'j', 'o', 'u', 'r', '\0' };
        boolean monBooleen = true;

        // Wrapper de type

        // Integer est une classe
        Integer a = 20;
        Integer b = 20;

        String maChaine = "bonjour";

        // Déclarer un tableau de notes
        int[] eplicit_notes = new int[5];

        eplicit_notes[0] = 14;
        eplicit_notes[1] = 13;
        eplicit_notes[2] = 12;
        eplicit_notes[3] = 11;
        eplicit_notes[4] = 10;

        // Déclarer et affecter un tableau de notes

        int[] implicit_notes = {20, 15, 14, 8};
        
        // Structures de contrôle
        // ---------------------

        // Opérateur de concaténation

        String concat = maChaine + "  julien !";
        
        // Opérateurs arithmétiques

        int num_a = 1 + 2;
        int num_b = 1 - 2;
        int num_c = 1 * 2;
        int num_d = 1 / 2;
        int num_e = 1 % 2;

        num_a++;
        num_a--;
        num_a += 5;
        num_a -= 5;
        num_a *= 5;
        num_a /= 5;
        num_a %= 5;

        // Opérateurs logiques

        boolean result;
        result = num_a == 1;
        result = num_a != 1;
        result = num_a > 1;
        result = num_a < 1;
        result = num_a >= 1;
        result = num_a <= 1;
        result = num_a == 1 && num_b == 5;
        result = num_a == 1 || num_b == 5;        
        
        // Branchements

        if(num_a == 1) {
            System.out.println("ok");
        }
        else if(num_a < 1) {
            System.out.println("autre chose");
        }
        else {
            System.out.println("nok");
        }

        // Boucle

        for(int i = 0; i < maChaine.length(); i++) {
            System.out.println(i);
        }

        while(true) {
            System.out.println("Repeat");
            break;
        }

        do {
            System.out.println("Do not repeat");
        } while(false);

        
        int[] notes = {13, 15, 18, 9};
        
        for(int note : notes) {
            System.out.println(note);
        }

        // Appel de méthode
        greetings("julien");
    }

    // Déclaration de méthode
    public static void greetings(String name) {
        System.out.println("Bonjour " + name);
    }
}
