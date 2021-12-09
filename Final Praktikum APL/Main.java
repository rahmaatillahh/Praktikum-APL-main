public class Main {
    public static void main (String[] args) {
        Observable roomOwner = new RoomOwner();
        Observer pelanggan1 = new Pelanggan("Difa");
        Observer pelanggan2 = new Pelanggan("Yuli");

        roomOwner.addObserver(pelanggan1);
        roomOwner.addObserver(pelanggan2);

        roomOwner.notify(" ada berita baru ");
    }
}