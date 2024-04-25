package AFLOOP;

public class dosen extends pengguna{
    private int idDosen;;
    public dosen(int idDosen, String nama, String prodi, String fakultas){
        super( nama, prodi, fakultas);
        this.idDosen = idDosen;

   }
   public int getIdDosen() {
    return idDosen;
} 

    
}