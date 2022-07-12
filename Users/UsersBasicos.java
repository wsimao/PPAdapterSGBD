package Users;

import SGBD.Paradox;

public class UsersBasicos {

    private String name;
    private String password;
    private final Paradox SGBD;

    public UsersBasicos(String name, String password) {
        this.name = name;
        this.password = password;
        this.SGBD = new Paradox();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Paradox getSGBD() {
        return SGBD;
    }

    
}
