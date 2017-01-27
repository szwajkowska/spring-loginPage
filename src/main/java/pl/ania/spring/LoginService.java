package pl.ania.spring;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean isValid(String user, String password){
        if (user.equals("ania") && password.equals("aniasz")){
            return true;

        }
        return false;
    }
}
