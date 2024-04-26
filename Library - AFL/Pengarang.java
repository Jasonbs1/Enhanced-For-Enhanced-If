public class Pengarang {
    private String idPengarang;
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;

    public Pengarang(String idPengarang, String nama, String alamat, String noTelp, String email) {
        this.idPengarang = idPengarang;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

    // Getters and Setters
    public String getIdPengarang() {
        return idPengarang;
    }

    public void setIdPengarang(String idPengarang) {
        this.idPengarang = idPengarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void addAuthor() {
        // Implement addAuthor functionality
    }

    public void editAuthor() {
        // Implement editAuthor functionality
    }

    public void deleteAuthor() {
        // Implement deleteAuthor functionality
    }
}