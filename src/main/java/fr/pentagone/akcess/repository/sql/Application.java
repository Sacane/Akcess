package fr.pentagone.akcess.repository.sql;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Application extends AbstractEntity<Integer>{

    private String label;
    private String url;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(
            name = "app_id"
    )
    private List<User> users = new ArrayList<>();

    public Application(){}
    public Application(String label, String url){
        this.url = url;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getUrl() {
        return url;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        this.users.add(user);
    }
}
