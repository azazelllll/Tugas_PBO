package object1;
import java.io.*;
public class MainClassUNDIKA {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Karyawan k = new Karyawan();
        Mahasiswa mhs = new Mahasiswa();
        UNDIKA ud = new UNDIKA();
        try{
            do{
                System.out.println("---Menu Utama---");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Mahasiswa");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu(1/2/3): ");
                int pilih = Integer.parseInt(br.readLine());
                switch(pilih){
                    case 1:
                        System.out.println("---Cek SPP Mahasiswa---");
                        System.out.print("Nim: ");
                        mhs.setNIM(br.readLine());
                        System.out.print("Prodi: ");
                        mhs.setProdi(br.readLine());
                        System.out.print("Angkatan: ");
                        mhs.setAngkatan(Integer.parseInt(br.readLine()));
                        System.out.print("Semester: ");
                        mhs.setSemester(Integer.parseInt(br.readLine()));
                        System.out.println("Total Bayar SPP: "+mhs.getSPP());
                        
                    break;
                    case 2: 
                        System.out.println("---Cek Gaji Karyawan---");
                        System.out.print("Nik: "); 
                        k.setNIK(br.readLine());
                        System.out.print("Bagian: ");
                        k.setBagian(br.readLine());
                        System.out.print("Gaji per hari: ");
                        k.setGaji_per_hari(Integer.parseInt(br.readLine()));
                        System.out.print("Kehadiran: ");
                        k.setKehadiran(Integer.parseInt(br.readLine()));
                        System.out.println("Total Gaji: "+k.getGaji());
                        
                    break;
                    case 3:
                        System.exit(0);
                }
            }while(true);
        }catch(Exception e){
            System.out.println("Inputan Salah, mohon coba lagi");
        }
    }
}
