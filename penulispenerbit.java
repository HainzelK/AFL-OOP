package AFLOOP;

public abstract class penulispenerbit {
    private int id;
    private String nama;
    private String alamat;
    private String email;

    public penulispenerbit (int id, String nama, String alamat, String email){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }
}
