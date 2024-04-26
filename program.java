
package AFLOOP;
import java.util.*;
import java.io.*;


public class program {
    private static ArrayList<buku_majalah> bukuMajalahList = new ArrayList<>();
    private static ArrayList<client> clientList = new ArrayList<>();
    private static ArrayList<cd> cdList = new ArrayList<>();
    private static ArrayList<penulis> penulisList = new ArrayList<>();
    private static ArrayList<penerbit> penerbitList = new ArrayList<>();
    private static ArrayList<transaksi> transaksiList = new ArrayList<>();
    private static ArrayList<pustakawan> pustakawanList = new ArrayList<>();
    private static ArrayList<pembayaran> pembayaranList= new ArrayList<>();
    private static ArrayList<peminjaman> peminjamanList = new ArrayList<>();
    private static ArrayList<pengembalian> pengembalianList = new ArrayList<>();
    private static PrintWriter writer;

    public static void main(String[] args) {
        try {
            writer = new PrintWriter(new File("D:\\Tugas OOP\\AFLOOP\\Teks.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error creating file.");
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        String x = "y";
        while (x.equals("y")) { // Use equals method for string comparison
            try {
                System.out.println("Login \n 1.Client \n 2. Pustakawan");
                int jawab = scanner.nextInt();
                if (jawab == 1) {
                    System.out.println("1. Tambah Client\n2. Pinjam Buku");
                    int jawab1 = scanner.nextInt();
                    if (jawab1 == 1) {
                        inputClient(scanner);
                    } else if (jawab1 == 2) {
                        inputTransaksi(scanner);
                    }
                } else if (jawab == 2) {
                    System.out.println("1. Tambah Buku\n 2. Tambah CD \n 3.Check Data Client\n 4.Check Data CD \n 5. Check Data Buku/Majalah \n 6. Tambah Penerbit \n 7.Tambah Penulis \n 8. Tambah Pustakawan \n 9. Tambah Pengembalian \n 10. Tambah Peminjaman \n 11. Tambah Pembayaran \n 12.Exit ");
                    int popo = scanner.nextInt();
                    if (popo == 1) {
                        inputBukuMajalah(scanner);
                    } else if (popo == 2) {
                        inputCD(scanner);
                    } else if (popo == 3) {
                        checkClientData();
                    } else if (popo == 4) {
                        checkCD();
                    } else if (popo == 5) {
                        checkBuku();
                    }else if (popo == 6) {
                        inputPenerbit();
                    }else if (popo == 7) {
                        inputPenulis();
                    }else if (popo == 8){
                        inputPustakawan(scanner);
                    }else if (popo == 9){
                        inputPengembalian(scanner);
                    }else if (popo == 10){
                        inputPeminjaman(scanner);
                    }else if (popo == 11){
                        inputPembayaran(scanner);
                    }else if (popo == 12) {
                        break;

                    }
                }
                System.out.println("Ulang?");
                x = scanner.next(); // Use next() to read the string
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input
            }
        }
        scanner.close(); // Close the scanner after you're done with all input operations
        writer.close(); // Close the PrintWriter after all operations
    }

    // Define inputMahasiswa(), inputTransaksi(), and inputBukuMajalah() methods here

                
    private static void inputPustakawan(Scanner scanner) {
        System.out.println("Enter idPustakawan:");
        int idPustakawan = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Enter Nama:");
        String nama = scanner.nextLine();
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        pustakawan newPustakawan = new pustakawan(idPustakawan, nama, password, email);
        pustakawanList.add(newPustakawan);
        System.out.println("Pustakawan added successfully.");
        
        printPustakawanData();
    }
    
    private static void printPustakawanData() {
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                              Pustakawan                                               |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-3s | %-10s | %-20s | %-8s |%n", "ID", "Nama", "Email", "Password");
        writer.println("|=======================================================================================================|%n");
        for(pustakawan pst : pustakawanList){
            writer.printf("| %-3d | %-10s | %-20s | %-8s |%n", pst.getIdPustakawan(), pst.getNama(), pst.getEmail(), pst.getPassword());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void checkClientData() {
        System.out.println("Checking Mahasiswa/Dosen data...");
        if (clientList.isEmpty()) {
            System.out.println("No Mahasiswa/Dosen data available.");
        } else {
            printClientData();
        }
    }

    private static void printClientData() {
        writer.println("Mahasiswa/Dosen data is available.");
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                               Client                                               |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-3s | %-10s | %-20s | %-8s |%n", "NIM/NIK", "Nama", "Jurusan", "Fakultas");
        writer.println("|=======================================================================================================|%n");
        for(client mhs : clientList){
            writer.printf("| %-3d | %-10s | %-20s | %-8s |%n", mhs.getIdClient(), mhs.getNama(), mhs.getProdi(), mhs.getFakultas());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void checkCD() {
        System.out.println("Checking CD data...");
        if (cdList.isEmpty()) {
            System.out.println("No CD data available.");
        } else {
            printCDData();
        }
    }

    private static void printCDData() {
        writer.println("CD data is available.");
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                                   CD                                                  |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-3s | %-10s | %-20s | %-8s |%n", "CD ID", "Title", "Year", "Jumlah");
        writer.println("|=======================================================================================================|%n");
        for(cd cd : cdList){
            writer.printf("| %-3d | %-10s | %-20s | %-8d |%n", cd.getKdCd(), cd.getJudul(), cd.getTahunTerbit(), cd.getjTotal());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void checkBuku() {
        System.out.println("Checking Buku/Majalah data...");
        if (bukuMajalahList.isEmpty()) {
            System.out.println("No Buku/Majalah data available.");
        } else {
            printBukuData();
        }
    }

    private static void printBukuData() {
        writer.println("Buku/Majalah Data is available");
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                              Buku Majalah                                             |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-10s | %-10s | %-20s | %-8s |%n", "ID", "Tahun Terbit", "Judul", "Jumlah Total");
        writer.println("|=======================================================================================================|%n");
        for(buku_majalah bm : bukuMajalahList){
            writer.printf("| %-3s | %-10s | %-20s | %-8d |%n", bm.getIdBuku(), bm.getTahunTerbit(), bm.getJudul(), bm.getjTotal());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void inputBukuMajalah(Scanner scanner) {
        System.out.println("Enter ID Buku:");
        int idBuku = scanner.nextInt();
        System.out.println("Enter Tahun Terbit:");
        String tahunTerbit = scanner.next();
        System.out.println("Enter Judul:");
        String judul = scanner.next();
        System.out.println("Enter Jumlah Total:");
        int jTotal = scanner.nextInt();
        System.out.println("Enter ID Pengarang:");
        int idPengarang = scanner.nextInt();
        System.out.println("Enter ID Penerbit:");
        int idPenerbit = scanner.nextInt();

        buku_majalah newBukuMajalah = new buku_majalah(idBuku, idPengarang, idPenerbit, tahunTerbit, judul, jTotal);
        bukuMajalahList.add(newBukuMajalah);
        System.out.println("Buku Majalah added successfully.");
        
        printBukuMajalahData();
    }

    private static void printBukuMajalahData() {
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                              Buku Majalah                                             |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-5s | %-13s | %-20s | %-8s | %-10s | %-10s |%n", "ID", "Tahun Terbit", "Judul", "Jumlah Total", "ID Penerbit", "ID Pengarang");
        writer.println("|=======================================================================================================|%n");
        for(buku_majalah bm : bukuMajalahList){
            writer.printf("| %-8s | %-10s | %-20s | %-8d | %-10s | %-10s |%n", bm.getIdBuku(), bm.getTahunTerbit(), bm.getJudul(), bm.getjTotal(), bm.getIdPenerbit(), bm.getIdPengarang());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void inputClient(Scanner scanner) {
        System.out.println("Enter NIM:");
        int idClient = scanner.nextInt();
        System.out.println("Enter Nama:");
        String nama = scanner.next();
        System.out.println("Enter Prodi:");
        String prodi = scanner.next();
        System.out.println("Enter Fakultas:");
        String fakultas = scanner.next();

        client newMahasiswa = new client(idClient, nama, prodi, fakultas);
        clientList.add(newMahasiswa);
        System.out.println("Client added successfully.");
        
        printClientData();
    }

    private static void inputCD(Scanner scanner) {
        System.out.println("Enter CD ID:");
        int kdCd = scanner.nextInt();
        System.out.println("Enter Title:");
        String judul = scanner.next();
        System.out.println("Enter Year:");
        String tahunTerbit = scanner.next();
        System.out.println("Enter Jumlah:");
        int jTotal = scanner.nextInt();

        cd newCD = new cd(kdCd, judul, tahunTerbit, jTotal);
        cdList.add(newCD);
        System.out.println("CD added successfully.");
        
        printCDData();
    }

    private static void inputPenulis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Penulis ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Name:");
        String nama = scanner.next();
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Enter alamat:");
        String alamat = scanner.next();

        penulis newPenulis = new penulis(id, nama, email, alamat);
        penulisList.add(newPenulis);
        System.out.println("Penulis added successfully.");
        
        printPenulisData();
    }

    private static void printPenulisData() {
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                                Penulis                                                |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-3s | %-10s | %-20s | %-8s |%n", "ID", "Name", "Email", "Alamat");
        writer.println("|=======================================================================================================|%n");
        for(penulis penulis : penulisList){
            writer.printf("| %-3d | %-10s | %-20s | %-8s |%n", penulis.getId(), penulis.getNama(), penulis.getEmail(), penulis.getAlamat());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void inputPenerbit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Penerbit ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Name:");
        String name = scanner.next();
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Enter alamat:");
        String alamat = scanner.next();

        penerbit newPenerbit = new penerbit(id, name, email, alamat);
        penerbitList.add(newPenerbit);
        System.out.println("Penerbit added successfully.");
        
        printPenerbitData();
    }

    private static void printPenerbitData() {
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                               Penerbit                                                |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-3s | %-10s | %-20s | %-8s |%n", "ID", "Name", "Email", "Alamat");
        writer.println("|=======================================================================================================|%n");
        for(penerbit penerbit : penerbitList){
            writer.printf("| %-3d | %-10s | %-20s | %-8s |%n", penerbit.getId(), penerbit.getNama(), penerbit.getEmail(), penerbit.getAlamat());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void inputTransaksi(Scanner scanner) {
        System.out.println("Enter Transaksi ID:");
        int idTransaksi = scanner.nextInt();
        System.out.println("Enter CD ID:");
        int kdCd = scanner.nextInt();
        System.out.println("Enter Client ID:");
        int idClient = scanner.nextInt();
        System.out.println("Enter Pustakawan ID:");
        int idPustakawan = scanner.nextInt();
        System.out.println("Enter Buku ID:");
        int idBuku = scanner.nextInt();
        System.out.println("Enter Denda:");
        int jDenda = scanner.nextInt();

        transaksi newTransaksi = new transaksi(idTransaksi, kdCd, idClient, idPustakawan, idBuku, jDenda);
        transaksiList.add(newTransaksi);
        System.out.println("Transaksi added successfully.");
        
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                               Transaksi                                               |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-3s | %-10s | %-20s | %-8s | %-8s | %-8s |%n", "ID", "CD ID", "Client ID", "Pustakawan ID", "Buku ID", "Denda");
        writer.println("|=======================================================================================================|%n");
        for(transaksi transaksi : transaksiList){
            writer.printf("| %-3d | %-10d | %-20d | %-8d | %-8d | %-8d |%n", transaksi.getIdTransaksi(), transaksi.getKdCd(), transaksi.getIdClient(), transaksi.getIdPustakawan(), transaksi.getIdBuku(), transaksi.getjDenda());
        }
        writer.println("|=======================================================================================================|%n");

    }

    private static void inputPembayaran(Scanner scanner) {
        int idTransaksi = 0;
        int hargaTelat = 0;
        int jumlahBenda = 0;

        try {
            System.out.println("Enter ID Transaksi:");
            idTransaksi = scanner.nextInt();
            System.out.println("Enter Harga Telat:");
            hargaTelat = scanner.nextInt();
            System.out.println("Enter Jumlah:");
            jumlahBenda = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input and prompt again
            return; // Exit the method to avoid adding incorrect data
        }

        pembayaran bayar = new pembayaran(idTransaksi, hargaTelat, jumlahBenda);
        pembayaranList.add(bayar);
        System.out.println("Pembayaran added successfully.");
        
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                           Pembayaran                                                  |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-15s | %-15s | %-15s |%n", "ID Transaksi", "Harga Telat", "Jumlah Benda");
        writer.println("|=======================================================================================================|%n");
        for(pembayaran byr : pembayaranList){
            writer.printf("| %-15d | %-15d | %-15d |%n", byr.getIdTransaksi(), byr.getHargaTelat(), byr.getJumlahBenda());
        }
        writer.println("|=======================================================================================================|%n");
    }

    private static void inputPengembalian(Scanner scanner) {
        boolean StatusRusak = true;
        boolean StatusTelat = true;
        String tglPengembalian ;
        int idTransaksi;

        try {

            System.out.println("Enter Status Rusak:");
             StatusRusak = scanner.nextBoolean();
            System.out.println("Enter Status Telat:");
             StatusTelat = scanner.nextBoolean();
             scanner.nextLine();
             System.out.println("Enter Date of Return:");
             tglPengembalian = scanner.nextLine();
             System.out.println("Enter ID Transaction :");
             idTransaksi = scanner.nextInt();

            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next(); // Consume the invalid input and prompt again
            return; // Exit the method to avoid adding incorrect data
        }



        pengembalian pgb = new pengembalian(tglPengembalian, StatusRusak, StatusTelat, idTransaksi);
        pengembalianList.add(pgb);
        System.out.println("Pengembalian added successfully.");
        
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                         Pengembalian                                                  |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-15s | %-15s | %-15s | %-15s |%n", "Tanggal Pengembalian", "Status Rusak", "Status Telat","Id Transaksi");
        writer.println("|=======================================================================================================|%n");
                for(pengembalian pp : pengembalianList){
                    writer.printf("| %-20s | %-15s | %-15s | %-15s |%n", pp.getTglPengembalian(), pp.isStatusRusak(), pp.isStatusTelat(), pp.getIdTransaksi());
                }
        writer.println("|=======================================================================================================|%n");
    }

    private static void inputPeminjaman(Scanner scanner) {
        System.out.println("Enter ID Transaksi:");
        int idTransaksi = scanner.nextInt();

        System.out.println("Enter Jumlah:");
        int jumlahBenda = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Date of Borrow:");
        String tglPeminjaman = scanner.nextLine();

        peminjaman pjm = new peminjaman(idTransaksi, tglPeminjaman, jumlahBenda);
        peminjamanList.add(pjm);
        System.out.println("Peminjaman added successfully.");
        
        writer.println("|=======================================================================================================|%n");
        writer.println("|                                           Peminjaman                                                  |%n");
        writer.println("|=======================================================================================================|%n");
        writer.printf("| %-15s | %-15s | %-15s |%n", "ID Transaksi", "Jumlah Benda", "Tanggal Peminjaman");
        writer.println("|=======================================================================================================|%n");
        for(peminjaman ph :  peminjamanList){
            writer.printf("| %-15s | %-15s | %-19s|%n", ph.getIdTransaksi(), ph.getJumlahBenda(), ph.getTglPeminjaman());
        }
        writer.println("|=======================================================================================================|%n");
    }

    
}

