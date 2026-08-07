public class Client {

    public static void main(String[] args) throws InterruptedException {

        FooBar fooBar = new FooBar(2);

        Thread threadA = new Thread(() -> {
            try {
                fooBar.foo(() -> System.out.print("foo"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                fooBar.bar(() -> System.out.print("bar"));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
    }
}