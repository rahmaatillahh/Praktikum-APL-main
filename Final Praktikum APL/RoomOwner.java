import java.util.ArrayList;

public class RoomOwner implements Observable {
    private ArrayList<Observer> pelanggan = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        pelanggan.add(observer);
    }

     @Override
    public void removeObserver(Observer observer) {
        pelanggan.remove(observer);
    }

    @Override
    public void notify(String s) {
        for (Observer cus : pelanggan) {
            cus.update(s);
        }
    }
}