package AFLOOP;

public class pengembalian {
    private String tglPengembalian;
    private boolean StatusRusak;
    private boolean StatusTelat;
    private int idTransaksi;

    public pengembalian(String tglPengembalian, boolean StatusRusak, boolean StatusTelat, int idTransaksi){
        this.tglPengembalian = tglPengembalian;
        this.StatusRusak = StatusRusak;
        this.StatusTelat = StatusTelat;
        this.idTransaksi = idTransaksi;
    }

    public String getTglPengembalian() {
        return tglPengembalian;
    }

    public boolean isStatusRusak() {
        return StatusRusak;
    }

    public boolean isStatusTelat() {
        return StatusTelat;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }
}
