public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter hwp=new HelloWorldPrinter();
        Thread thread=new Thread(hwp);
        thread.start();
    }
}
