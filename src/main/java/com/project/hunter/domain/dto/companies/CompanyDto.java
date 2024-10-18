package com.project.hunter.domain.dto.companies;

import com.project.hunter.domain.entities.CompanyEntity;

public class CompanyDto {
    private String name;
    private String description;
    private String logo;
    private String address;

    public CompanyDto(CompanyEntity companyEntity) {
        this.name = companyEntity.getName();
        this.description = companyEntity.getDescription();
        this.logo = companyEntity.getLogo();
        this.address = companyEntity.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
}
