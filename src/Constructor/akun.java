package Constructor;
public class akun {
    //username, password
    private String username, password;
    
    //constructor non parameter -- admin
    public akun(){
        //user admin sudah ditentukan username dan passwordnya
        username = "admin";
        password = "admin";
    }
    
    //constructor parameter -- akun baru
    public akun(String u, String p){
        username = u;
        password = p;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
