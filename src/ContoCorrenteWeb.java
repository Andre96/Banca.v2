public class ContoCorrenteWeb extends  ContoCorrente {

    private String password;
    private boolean logged;
    private boolean firstLogin;

    //costruttore
    public ContoCorrenteWeb(String CF) {
        super(CF);
        logged = false;
        firstLogin = true;
        password = "changeme";
    }

    //Metodi
    public boolean setPassword(String oldPassword, String newPassword){
        if(firstLogin){
            if (oldPassword.equals(password)){
                password = newPassword;
                firstLogin = false;
                return true;
            }else {
                return false;
            }
        }else{
            if(oldPassword.equals(password)){
                password = newPassword;
                return true;
            }else{
                return false;
            }
        }

    }

    public boolean logIn(String password){
        if(this.password.equals(password)){
            logged = true;
            return true;
        }else{
            logged = false;
            return false;
        }
    }


}
