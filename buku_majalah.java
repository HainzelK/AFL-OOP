package AFLOOP;

public class buku_majalah extends item {
    private int idBuku;
    private int idPengarang;
    private int idPenerbit;
    public buku_majalah(int idBuku, int idPengarang, int idPenerbit, String tahunTerbit, String judul, int jTotal){
        super(tahunTerbit,judul,jTotal);
        this.idBuku = idBuku;
        this.idPenerbit = idPenerbit;
        this.idPengarang = idPengarang;
    }
    public int getIdBuku() {
        return idBuku;
    }
    public int getIdPengarang() {
        return idPengarang;
    }
    public int getIdPenerbit() {
        return idPenerbit;
    }
}
