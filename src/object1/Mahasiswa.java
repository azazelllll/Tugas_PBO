package object1;
public class Mahasiswa {
    //Deskripsi atribut
    private String nim, prodi;
    private int spp, angkatan, semester, bayar_spp_semester;
 
    //setter
    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setSPP(int spp){
        this.spp = spp;
    }
    public void setAngkatan(int angkatan){
        this.angkatan = angkatan;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public void setBayar_spp_semester(int bayar_spp_semester){
        this.bayar_spp_semester = bayar_spp_semester;
    }
    
    //getter
    public String getNim(){
        return nim;
    }
    public String getProdi(){
        return prodi;
    }
    public int getAngkatan(){
        return angkatan;
    }
    public int getSemester(){
        return semester;
    }
    public int getSPP(){
        if(getAngkatan() > 17){
            spp = 15000000;
        }else{
            spp = 12000000;
        }
        return spp * getSemester();
    }
    public int getBayar_spp_semester(){
        bayar_spp_semester = getSPP();
        return bayar_spp_semester;
    }
}

