public class MyProgram {
    public static void main(String[] args) {
        // Parcourir tous les arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}

