package br.com.centro.entities;

public class Product {
    
    private Long codeProduct;
    private String descriptionProduct;
    private TypeProduct typeProduct;

    public Long getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(Long codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }
    
}
