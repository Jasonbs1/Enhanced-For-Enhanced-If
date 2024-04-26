public class Book {
    private String isbn;
    private String judul;
    private int tahunTerbit;
    private int edisi;
    private int jenisSampul;
    private int jPinjam;
    private int jRusak;
    private int jTotal;
    private int jTersedia;
    private Kategori kategori;
    private Pengarang pengarang;
    private Penerbit penerbit;

    public Book(String isbn, String judul, int tahunTerbit, int edisi, int jenisSampul, int jPinjam, int jRusak, int jTotal, int jTersedia, Kategori kategori, Pengarang pengarang, Penerbit penerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.edisi = edisi;
        this.jenisSampul = jenisSampul;
        this.jPinjam = jPinjam;
        this.jRusak = jRusak;
        this.jTotal = jTotal;
        this.jTersedia = jTersedia;
        this.kategori = kategori;
        this.pengarang = pengarang;
        this.penerbit = penerbit;

    }

    // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }

    public int getJenisSampul() {
        return jenisSampul;
    }

    public void setJenisSampul(int jenisSampul) {
        this.jenisSampul = jenisSampul;
    }

    public int getjPinjam() {
        return jPinjam;
    }

    public void setjPinjam(int jPinjam) {
        this.jPinjam = jPinjam;
    }

    public int getjRusak() {
        return jRusak;
    }

    public void setjRusak(int jRusak) {
        this.jRusak = jRusak;
    }

    public int getjTotal() {
        return jTotal;
    }

    public void setjTotal(int jTotal) {
        this.jTotal = jTotal;
    }

    public int getjTersedia() {
        return jTersedia;
    }

    public void setjTersedia(int jTersedia) {
        this.jTersedia = jTersedia;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Pengarang getPengarang() {
        return pengarang;
    }

    public void setPengarang(Pengarang pengarang) {
        this.pengarang = pengarang;
    }
    

    public Penerbit getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }  
}