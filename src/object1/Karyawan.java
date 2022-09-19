package object1;

public class Karyawan {

    private String nik, bagian;
    //Deskripsi Atribut
    private int kehadiran, gaji_per_hari, totalGaji;
    
    //Setter
    public void setNIK(String nik){
        this.nik = nik;
    }
    public void setBagian(String bagian){
        this.bagian = bagian;
    }
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    public void setGaji_per_hari(int gaji_per_hari){
        this.gaji_per_hari = gaji_per_hari;
    }
    public void setTotalGaji(int totalGaji){
        this.totalGaji = totalGaji;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //getter
    public String getNIK(){
        return nik;
    }
    public String getBagian(){
        return bagian;
    }
    public int getKehadiran(){
        return kehadiran;
    }
    public int getGaji_per_hari(){
        return gaji_per_hari;
    }
    public int getGaji(){
        return getKehadiran()*getGaji_per_hari();
    }
    
    public int getTotalGaji(){
        totalGaji = getGaji();
        return totalGaji;
    }
}
