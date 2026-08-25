package library;

public class DummyBook implements Lendable{

    private boolean available = true;

    @Override
    public boolean lend(User user) {


        return false;
    }

    @Override
    public void returnItem(User user) {
        available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}