package AFLOOP;

public abstract class item {
    private String tahunTerbit;
    private String judul;
    private int jTotal;

    public item(String tahunTerbit, String judul,  int jTotal){
        this.tahunTerbit = tahunTerbit;
        this.judul = judul;
        this.jTotal = jTotal;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public int getjTotal() {
        return jTotal;
    }
}
