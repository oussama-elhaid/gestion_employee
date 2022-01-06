package info3.gestion_employee.model;


import javax.persistence.*;

@Entity
@Table
public class Function {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String typefunction ;




    public Function() {

    }

    public Function(long id, String typefunction) {
        this.id = id;
        this.typefunction = typefunction;
    }

    public String getTypefunction() {
        return typefunction;
    }

    public void setTypefunction(String typefunction) {
        this.typefunction = typefunction;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
