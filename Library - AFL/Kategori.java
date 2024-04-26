public class Kategori {
    private String kdKat;
    private String nama;
    private String deskripsi;

    public Kategori(String kdKat, String nama, String deskripsi) {
        this.kdKat = kdKat;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public String getKdKat() {
        return kdKat;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
