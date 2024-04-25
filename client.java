package AFLOOP;

public class client extends pengguna {
    private int idClient;
        public client(int idClient, String nama, String prodi, String fakultas){
            super( nama, prodi, fakultas);
            this.idClient = idClient;
        }
        public int getIdClient() {
            return idClient;
        }
}
