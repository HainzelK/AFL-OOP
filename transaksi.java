package AFLOOP;

public class transaksi {
    private int idTransaksi;
    private  int kdCd;
    private int idClient;
    private int idPustakawan;
    private int idBuku;
    private int jDenda;

    public transaksi(int idTransaksi, int kdCd, int idClient, int idPustakawan, int idBuku, int jDenda){
        this.idTransaksi = idTransaksi;
        this.kdCd = kdCd;
        this.idClient = idClient;
        this.idPustakawan = idPustakawan;
        this.idBuku = idBuku;
        this.jDenda = jDenda;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getKdCd() {
        return kdCd;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public int getjDenda() {
        return jDenda;
    }
}
