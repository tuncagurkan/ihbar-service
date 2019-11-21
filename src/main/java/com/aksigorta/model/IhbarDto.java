package com.aksigorta.model;


import java.time.LocalDate;

public class IhbarDto {
    private Long cariPolNo;
    private Short zeylSiraNo;
    private String hasarNedeni;
    private LocalDate hasarTarihi;
    private LocalDate ihbarTarihi;

    public IhbarDto() {
        super();
    }

    public Long getCariPolNo() {
        return cariPolNo;
    }

    public void setCariPolNo(Long cariPolNo) {
        this.cariPolNo = cariPolNo;
    }

    public Short getZeylSiraNo() {
        return zeylSiraNo;
    }

    public void setZeylSiraNo(Short zeylSiraNo) {
        this.zeylSiraNo = zeylSiraNo;
    }

    public String getHasarNedeni() {
        return hasarNedeni;
    }

    public void setHasarNedeni(String hasarNedeni) {
        this.hasarNedeni = hasarNedeni;
    }

    public LocalDate getHasarTarihi() {
        return hasarTarihi;
    }

    public void setHasarTarihi(LocalDate hasarTarihi) {
        this.hasarTarihi = hasarTarihi;
    }

    public LocalDate getIhbarTarihi() {
        return ihbarTarihi;
    }

    public void setIhbarTarihi(LocalDate ihbarTarihi) {
        this.ihbarTarihi = ihbarTarihi;
    }
}