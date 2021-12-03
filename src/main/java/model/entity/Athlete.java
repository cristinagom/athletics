package model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "athletes")
public class Athlete {
    @Id
    private int idathlete;
    private String name;

    public int getIdathlete() {

        return idathlete;
    }

    public void setIdathlete(int idathlete) {

        this.idathlete = idathlete;
    }

    public String getName() {

        return name;
    }

    public void setNombre(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "idathlete=" + idathlete +
                ", name='" + name + '\'' +
                '}';
    }
}
