//Interface observer memiliki method yang mewakili hal-hal yang
//dapat dilakukan oleh Subject atau Observable atau Publisher

public interface Observable {
    public void addObserver(Observer observer); //method untuk menambah pelanggan
    public void removeObserver(Observer observer); //untuk menghapus pelanggan
    public void notify(String s); //method notify untuk memberikan notifikasi kepada plelanggan jika ada perubahan
}