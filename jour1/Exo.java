public class Exo {
    public static void main(String[] args) {
        int[] notes = {14, 15, 8, 12, 14, 13};

        // 10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800
        System.out.println(factoriel(10));
    }

    public static int factoriel(int n) {
        if(n == 0) return 1;
        
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int somme(int[] notes) {
        int somme = 0;

        for(int note : notes) {
            somme += note;
        }

        return somme;
    }

    public static double moyenne(int[] notes) {
        return somme(notes) / notes.length;
    }

    public static int min(int[] notes) {
        int min = notes[notes.length-1];

        for(int i = 1; i < notes.length; i++) {
            if(notes[i] < min) {
                min = notes[i];
            }
        }

        return min;
    }
    
    public static int max(int[] notes) {
        int max = notes[0];

        for(int i = 1; i < notes.length; i++) {
            if(notes[i] > max) {
                max = notes[i];
            }
        }

        return max;
    }
}
