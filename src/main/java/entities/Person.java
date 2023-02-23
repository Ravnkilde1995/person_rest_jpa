package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", length = 30)
    private String firstName;

    @Column(name = "last_name", length = 30)
    private String lastName;

    @Column(name = "phone", length = 25)
    private String phone;

    @Column(name = "created")
    private Date created;

    @Column(name = "last_edited")
    private Date lastEdited;

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Person(Long id, String firstName, String lastName, String phone, Date created, Date lastEdited) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.created = created;
        this.lastEdited = lastEdited;
    }

    public Person(String firstName, String lastName, String phone, Date created, Date lastEdited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.created = created;
        this.lastEdited = lastEdited;
    }


    public Date getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}