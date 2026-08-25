public class Client {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread thread = new Thread(np);
            thread.start();
        }

    }
}

