package AFLOOP;

public abstract class pengguna {
    
    private String nama;
    private String prodi;
    private String fakultas;

    public pengguna (){

    }

    public pengguna( String nama, String prodi, String fakultas){
        
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    
}
