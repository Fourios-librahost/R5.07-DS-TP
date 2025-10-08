public class Q6 {
    public static void main(String[] args) {
        int n = 4;
        if (args.length > 0) {
            try { n = Integer.parseInt(args[0]); } catch (Exception e) { System.err.println("Argument non valide"); System.exit(1); }
        }
        for (int i = n; i >= 1; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                if (j > 1) sb.append(" ");
                sb.append('x');
            }
            System.out.println(sb.toString());
        }
    }
}
