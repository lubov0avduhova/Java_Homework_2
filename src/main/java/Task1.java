public class Task1 {
    public static void main(String[] args) {
        Tower(3, "1", "3", "2");
    }

    public static void Tower(int n, String source, String target, String buffer) {
        if (n == 1) {
            System.out.printf("%d from %s to %s", n, source, target);
            System.out.println();
            return;

        }
        Tower(n - 1, source, buffer, target);
        System.out.printf("%d from %s to %s", n, source, target);
        System.out.println();
        Tower(n - 1, buffer, target, source);
    }
}

