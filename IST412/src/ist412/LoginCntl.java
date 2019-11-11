/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist412;

/**
 *
 * @author golds
 */
public class LoginCntl {
    private MainMenuCntl mainMenuCntl;
    private final LoginView loginView;
    
    public LoginCntl() {
        loginView = new LoginView(this);
        loginView.setVisible(true);
    }
    
    public void openMainMenuCntl(String username){
        mainMenuCntl = new MainMenuCntl(username);
    }
    
    public boolean verifiyUser(String u, String p){
        if(u.equals("username")&&p.equals("password")){
            openMainMenuCntl(u);
            loginView.dispose();
        }
        return false;
    }
}
