import java.util.concurrent.Semaphore;

public class H2O {

    Semaphore hsema = new Semaphore(2);
    Semaphore osema = new Semaphore(0);

    public H2O() {
        // Code here
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        hsema.acquire();

        releaseHydrogen.run();

        osema.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        osema.acquire();
        osema.acquire();

        releaseOxygen.run();

        hsema.release(2);
    }
}