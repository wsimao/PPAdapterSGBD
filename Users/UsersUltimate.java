package Users;

import SGBD.MySQL;

public class UsersUltimate {

    private String name;
    private String password;
    private final MySQL SGBD;

    public UsersUltimate(String name, String password) {
        this.name = name;
        this.password = password;
        this.SGBD = new MySQL();
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

    public MySQL getSGBD() {
        return SGBD;
    }

}
