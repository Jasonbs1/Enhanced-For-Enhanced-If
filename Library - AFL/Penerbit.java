public class Penerbit {
    private String idPenerbit;
    private String nama;
    private String alamat;
    private String noTelp;
    private String email;

    public Penerbit(String idPenerbit, String nama, String alamat, String noTelp, String email) {
        this.idPenerbit = idPenerbit;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
    }

        // Getters and Setters
        public String getIdPenerbit() {
            return idPenerbit;
        }
    
        public void setIdPenerbit(String idPenerbit) {
            this.idPenerbit = idPenerbit;
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

    public void addPublisher() {
        // Implement addPublisher functionality
    }

    public void editPublisher() {
        // Implement editPublisher functionality
    }

    public void deletePublisher() {
        // Implement deletePublisher functionality
    }
}