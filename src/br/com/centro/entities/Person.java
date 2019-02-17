package br.com.centro.entities;

public class Person {
    
    private Long codePerson;
    private String namePerson;
    private String statusPerson;
    private String typePerson;
    private Address address;

    public Long getCodePerson() {
        return codePerson;
    }

    public void setCodePerson(Long codePerson) {
        this.codePerson = codePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getStatusPerson() {
        return statusPerson;
    }

    public void setStatusPerson(String statusPerson) {
        this.statusPerson = statusPerson;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
