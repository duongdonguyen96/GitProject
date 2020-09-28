package model;

import java.util.List;

public class Province {
    private Long id;
    private String name;
    private List<Miss> missList;


    public Province(){
    }

    public Province(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Miss> getMissList() {
        return missList;
    }

    public void setMissList(List<Miss> missList) {
        this.missList = missList;
    }
}
