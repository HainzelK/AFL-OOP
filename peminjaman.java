package AFLOOP;

public class peminjaman {
    private int idTransaksi;
    private String tglPeminjaman;
    private int jumlahBenda;

    public peminjaman(int idTransaksi, String tglPeminjaman, int jumlahBenda){
        this.idTransaksi = idTransaksi;
        this.tglPeminjaman = tglPeminjaman;
        this.jumlahBenda = jumlahBenda;

        
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getTglPeminjaman() {
        return tglPeminjaman;
    }

    public int getJumlahBenda() {
        return jumlahBenda;
    }
}
