public class Main {
    public static void main (String[] args) {
        Observable roomOwner = new RoomOwner(); //create new object dari class Roomowner
        //create 2 object sebagai observer
        Observer pelanggan1 = new Pelanggan("Difa");
        Observer pelanggan2 = new Pelanggan("Yuli");

        roomOwner.addObserver(pelanggan1);
        roomOwner.addObserver(pelanggan2);

        roomOwner.notify(" ada berita baru "); //memanggil notifikasi yang disebarkan subject
    }
}

// Room Boking ( Boking Ruangan)
// 
// Pelanggan akan mendapatkan notifikasi terkait ruangan yang sudah bisa ditempati 
// Ruangan yang bisa ditempati yaitu berupa basic room, special room, extra special room
// 