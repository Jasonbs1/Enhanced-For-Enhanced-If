public class Pustakawan {
    private String idPus;
    private String nama;
    private String username;
    private String password;
    private String email;
    private int noTelp;

    public Pustakawan(String idPus, String nama, String username, String password, String email, int noTelp) {
        this.idPus = idPus;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.email = email;
        this.noTelp = noTelp;
    }

    public String getIdPus() {
        return idPus;
    }

    public void setIdPus(String idPus) {
        this.idPus = idPus;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }
}
