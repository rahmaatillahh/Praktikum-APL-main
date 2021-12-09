import java.util.Scanner;

public class Pelanggan implements Observer {

    private String pelanggan;

    public Pelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    @Override //overide method update agar notifikasi diterima customer
    public void update(String n) {

        Room specialRoom = new SpecialRoom(new Basic());

        System.out.print("\nSelamat pagi , " + this.pelanggan + n );
        specialRoom.decorate();
        System.out.println(" anda sudah bisa menempati ruangan"); 
 

    }
}