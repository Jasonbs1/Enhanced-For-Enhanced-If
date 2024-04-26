public class CD {
    private String kdCd;
    private String judul;
    private int tahunTerbit;
    private int jPinjam;
    private int jRusak;
    private int jTotal;
    private int jTersedia;
    private Kategori kategori;

    public CD(String kdCd, String judul, int tahunTerbit, int jPinjam, int jRusak, int jTotal, int jTersedia) {
        this.kdCd = kdCd;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.jPinjam = jPinjam;
        this.jRusak = jRusak;
        this.jTotal = jTotal;
        this.jTersedia = jTersedia;
    }

    public CD(String kdCd, String judul, int tahunTerbit, int jPinjam, int jRusak, int jTotal, int jTersedia, Kategori kategori) {
        this.kdCd = kdCd;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.jPinjam = jPinjam;
        this.jRusak = jRusak;
        this.jTotal = jTotal;
        this.jTersedia = jTersedia;
        this.kategori = kategori;
    }

    // Getters and setters
    public String getKdCd() {
        return kdCd;
    }

    public void setKdCd(String kdCd) {
        this.kdCd = kdCd;
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
}
