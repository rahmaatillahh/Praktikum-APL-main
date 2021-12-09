import java.util.ArrayList; //import array list untuk mengubah data

public class RoomOwner implements Observable {  //implements class Observable
    private ArrayList<Observer> pelanggan = new ArrayList<>();  //create new object untuk semua method yang diberikan pada Pelanggan 

    @Override   //overide method class Observable
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

//class subject design observer, subject tersebut ialah RoomOwner