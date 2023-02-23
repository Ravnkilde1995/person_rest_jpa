package dtos;


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class PersonDTO implements Serializable {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final Date created;
    private final Date lastEdited;

    public PersonDTO(Long id, String firstName, String lastName, String phone, Date created, Date lastEdited) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.created = created;
        this.lastEdited = lastEdited;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public Date getCreated() {
        return created;
    }

    public Date getLastEdited() {
        return lastEdited;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO entity = (PersonDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.created, entity.created) &&
                Objects.equals(this.lastEdited, entity.lastEdited);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phone, created, lastEdited);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "firstName = " + firstName + ", " +
                "lastName = " + lastName + ", " +
                "phone = " + phone + ", " +
                "created = " + created + ", " +
                "lastEdited = " + lastEdited + ")";
    }
}
