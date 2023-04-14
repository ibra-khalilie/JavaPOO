package JavaPOO;

import java.util.List;

public class Utilisateur {

    private String username;
    private String password;

    
    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public Utilisateur() {}


    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public  void listerVoiture (List<Voiture> voitures){
        System.out.println("--mes voitures--");
        for (Voiture voiture : voitures) {
            
            voiture.afficherInformation();

            
        }

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Utilisateur other = (Utilisateur) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }


 

    
    
}
