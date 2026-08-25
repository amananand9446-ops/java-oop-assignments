public class Client {

    public static void main(String[] args) throws InterruptedException {

        H2O h2o = new H2O();

        Thread h1 = new Thread(() -> {
            try {
                h2o.hydrogen(() -> System.out.print("H"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread h2 = new Thread(() -> {
            try {
                h2o.hydrogen(() -> System.out.print("H"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread o1 = new Thread(() -> {
            try {
                h2o.oxygen(() -> System.out.print("O"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread h3 = new Thread(() -> {
            try {
                h2o.hydrogen(() -> System.out.print("H"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread h4 = new Thread(() -> {
            try {
                h2o.hydrogen(() -> System.out.print("H"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread o2 = new Thread(() -> {
            try {
                h2o.oxygen(() -> System.out.print("O"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        h1.start();
        h2.start();
        o1.start();

        h3.start();
        h4.start();
        o2.start();

        h1.join();
        h2.join();
        o1.join();
        h3.join();
        h4.join();
        o2.join();

        System.out.println();
    }
}