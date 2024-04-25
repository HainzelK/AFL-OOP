package AFLOOP;

public class pembayaran {
    private int idTransaksi;
    private int hargaTelat;
    private int jumlahBenda;
    
    public pembayaran(int idTransaksi, int hargaTelat, int jumlahBenda){
        this.idTransaksi = idTransaksi;
        this.hargaTelat = hargaTelat;
        this.jumlahBenda = jumlahBenda;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getHargaTelat() {
        return hargaTelat;
    }

    public int getJumlahBenda() {
        return jumlahBenda;
    }
}
