package pl.ania.jee;

public class UserValidationService {

    public boolean isValid(String user, String password){
        if (user.equals("ania") && password.equals("aniasz")){
            return true;

        }
        return false;
    }
}
