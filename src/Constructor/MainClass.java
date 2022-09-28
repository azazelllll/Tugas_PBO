package Constructor;
import java.io.*;
public class MainClass {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //object(instance of class)
        //karena ada 2 constructor,maka dibuat 2 object
        //1. admin
        //2. akun baru
        akun admin = new akun();
        akun akunBaru = new akun("",""); 
        
        //variabel 
        String username,password;
        
        //menu
        do{
            System.out.println("---LOGIN---");
            System.out.println("1. Login Admin");
            System.out.println("2. Buat Akun Baru");
            System.out.println("3. Lihat Akun");
            System.out.println("4. Ubah Password");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu(1/2/3/4/5): ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1: 
                    System.out.println("---Login Admin---");
                    System.out.print("Masukkan username: ");
                    username = br.readLine();
                    System.out.print("Masukkan password: ");
                    password = br.readLine();
                    
                    //mencocokkan username dan password
                    if(username.equalsIgnoreCase(admin.getUsername())
                        && password.equals(admin.getPassword())){
                    System.out.println("Sukses!");
                    } else {
                    System.err.println("Gagal!");
                    }
                    
                    break; 
                case 2:
                    System.out.println("---Buat Akun---");
                    System.out.print("Masukkan username: ");
                    username=br.readLine();
                    System.out.print("Masukkan password: ");
                    password=br.readLine();
                    
                    //memasukkan variabel ke dalam constructor
                    akunBaru = new akun(username,password);
                    break;
                case 3:
                    System.out.println("---LIhat Akun---");
                    System.out.println("1. Admin");
                    System.out.println("Username: "+admin.getUsername());
                    System.out.println("Password: "+admin.getPassword());
                    System.out.println("");
                    System.out.println("2. Akun Baru");
                    System.out.println("Username: "+akunBaru.getUsername());
                    System.out.println("Password: "+akunBaru.getPassword()+"\n");
                    break;
                case 4:
                    System.out.println("---Ubah Paswword---");
                    System.out.println("Pilih Akun: ");
                    String pilih = br.readLine();
                    if(pilih.equalsIgnoreCase("Admin")){
                        System.out.println("Username: "+admin.getUsername());
                        System.out.print("Masukkan Password Lama: ");
                        String passlama = br.readLine();
                        if(passlama.equals(admin.getPassword())){
                            System.out.println("Berhasil");
                            System.out.print("Masukkan Password Baru: ");
                            admin.setPassword(br.readLine());
                            System.out.println("");
                            System.out.println("Username: "+admin.getUsername());
                            System.out.println("Password Baru: "+admin.getPassword());
                        } else{
                            System.err.println("Password Salah");
                        }
                    } if(pilih.equalsIgnoreCase("Akun Baru")){
                        System.out.println("Username: "+akunBaru.getUsername());
                        System.out.print("Masukkan Password Lama: ");
                        String passlama = br.readLine();
                        if(passlama.equals(akunBaru.getPassword())){
                            System.out.println("Berhasil");
                            System.out.print("Masukkan Password Baru: ");
                            akunBaru.setPassword(br.readLine());
                            System.out.println("");
                            System.out.println("Username: "+akunBaru.getUsername());
                            System.out.println("Password Baru: "+akunBaru.getPassword());
                        } else{
                            System.err.println("Password Salah");
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}
