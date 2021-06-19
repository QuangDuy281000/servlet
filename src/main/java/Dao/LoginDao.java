package Dao;

public class LoginDao {
    public static boolean kiemtra(String pass){
        boolean kt = false;
        if(pass.equals("123")){
            kt = true;
        }
        return kt;
    }
}
