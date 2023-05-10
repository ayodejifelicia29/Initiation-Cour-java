public class Type {
    public static void main(String[] args) {
        byte myByte = 100;
        char myChar = 'a';

        // Par défaut la valeur est de type 'int' 
        short myShort = 5000;
        int myInteger = 600000;
        // il faut rajouter un 'l' pour qu'elle soit de type 'long'
        long myLong = 486446556450l;

        // Par défaut la valeur est de type 'double'
        float myFloat = 5.99f;
        // il faut rajotuer un 'f' pour qu'elle soit de type 'float'
        double myDouble = 5.99;

        int[] notes = {12, 14, 9, 16, 17};

        int somme = 0;
        for(int note : notes) {
            somme += note;
        }

        double moyenne = somme / (double)notes.length;
        
        System.out.println( diviser(7.0f, 2.0f) ); // 3
        System.out.println( apresLaVirgule(7.0f, 2.0f) ); // 5
    }

    public static int diviser(float a, float b) {
        if(b == 0) {
            return 0;
        }
        return (int)(a / b);
    }

    public static int apresLaVirgule(float a, float b) {
        float resultat_f = a / b;         // 3.5
        int resultat_i = (int)resultat_f; // 3

        float apres = resultat_f - resultat_i; // 0.5;
        return (int)(apres * 10);
    }
    
}


