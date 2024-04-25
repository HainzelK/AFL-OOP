package AFLOOP;

public class cd extends item{
    private int kdCd;
    public cd (int kdCd, String tahunTerbit, String judul, int jTotal){
        super(tahunTerbit, judul, jTotal);
        this.kdCd = kdCd;
    }
    public int getKdCd() {
        return kdCd;
    }
}
