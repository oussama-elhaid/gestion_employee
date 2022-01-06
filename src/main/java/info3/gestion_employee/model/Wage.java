package info3.gestion_employee.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Wage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    public Float salary;
    public Date date_salary;



    public Wage() {

    }

    public Wage(long id, Float salary, Date date_salary) {
        this.id = id;
        this.salary = salary;
        this.date_salary = date_salary;
    }


    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Date getDate_salary() {
        return date_salary;
    }

    public void setDate_salary(Date date_salary) {
        this.date_salary = date_salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
