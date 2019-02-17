package br.com.centro.entities;

public class LegalEntity extends Person{
    
    private String cnpjLegalEntity;
    private String ieLegalEntity;
    private String emailLegalEntity;
    private String phoneLegalEntity;
    private String imLegalEntity;
    private String homePageLegalEntity;

    public String getCnpjLegalEntity() {
        return cnpjLegalEntity;
    }

    public void setCnpjLegalEntity(String cnpjLegalEntity) {
        this.cnpjLegalEntity = cnpjLegalEntity;
    }

    public String getIeLegalEntity() {
        return ieLegalEntity;
    }

    public void setIeLegalEntity(String ieLegalEntity) {
        this.ieLegalEntity = ieLegalEntity;
    }

    public String getEmailLegalEntity() {
        return emailLegalEntity;
    }

    public void setEmailLegalEntity(String emailLegalEntity) {
        this.emailLegalEntity = emailLegalEntity;
    }

    public String getPhoneLegalEntity() {
        return phoneLegalEntity;
    }

    public void setPhoneLegalEntity(String phoneLegalEntity) {
        this.phoneLegalEntity = phoneLegalEntity;
    }

    public String getImLegalEntity() {
        return imLegalEntity;
    }

    public void setImLegalEntity(String imLegalEntity) {
        this.imLegalEntity = imLegalEntity;
    }

    public String getHomePageLegalEntity() {
        return homePageLegalEntity;
    }

    public void setHomePageLegalEntity(String homePageLegalEntity) {
        this.homePageLegalEntity = homePageLegalEntity;
    }
    
}
