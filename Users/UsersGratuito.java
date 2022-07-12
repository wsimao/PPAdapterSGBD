package Users;

import SGBD.Firebird;

public class UsersGratuito {

    private String name;
    private String password;
    private final Firebird SGBD;

    public UsersGratuito(String name, String password) {
        this.name = name;
        this.password = password;
        this.SGBD = new Firebird();
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
    
    public Firebird getSGBD() {
        return SGBD;
    }

    
}
