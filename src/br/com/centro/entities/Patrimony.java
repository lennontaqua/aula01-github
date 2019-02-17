package br.com.centro.entities;

import java.util.Date;

public class Patrimony {
    
    private Long codePatrimony;
    private String descriptionPatrimony;
    private SchoolUnit schoolUnit;
    private String numberPatrimony;
    private String statusPatrimony;
    private Date dateAcquisition;    

    public Date getDateAcquisition() {
        return dateAcquisition;
    }

    public void setDateAcquisition(Date dateAcquisition) {
        this.dateAcquisition = dateAcquisition;
    }

    public Long getCodePatrimony() {
        return codePatrimony;
    }

    public void setCodePatrimony(Long codePatrimony) {
        this.codePatrimony = codePatrimony;
    }

    public String getDescriptionPatrimony() {
        return descriptionPatrimony;
    }

    public void setDescriptionPatrimony(String descriptionPatrimony) {
        this.descriptionPatrimony = descriptionPatrimony;
    }

    public SchoolUnit getSchoolUnit() {
        return schoolUnit;
    }

    public void setSchoolUnit(SchoolUnit schoolUnit) {
        this.schoolUnit = schoolUnit;
    }

    public String getNumberPatrimony() {
        return numberPatrimony;
    }

    public void setNumberPatrimony(String numberPatrimony) {
        this.numberPatrimony = numberPatrimony;
    }

    public String getStatusPatrimony() {
        return statusPatrimony;
    }

    public void setStatusPatrimony(String statusPatrimony) {
        this.statusPatrimony = statusPatrimony;
    }
    
}
