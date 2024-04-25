package AFLOOP;

public class pustakawan extends pengguna {
    private String nama;
    private String password;
    private String email;
    private int idPustakawan;

    public pustakawan(int idPustakawan, String nama, String password, String email){
        this.idPustakawan = idPustakawan;
        this.email = email;
        this.password = password;
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }
}
