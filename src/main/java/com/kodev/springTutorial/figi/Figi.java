package com.kodev.springTutorial.figi;

/*
                "figi": "BBG000BLNNH6",
                "securityType": "Common Stock",
                "marketSector": "Equity",
                "ticker": "IBM",
                "name": "INTL BUSINESS MACHINES CORP",
                "exchCode": "US",
                "shareClassFIGI": "BBG001S5S399",
                "compositeFIGI": "BBG000BLNNH6",
                "securityType2": "Common Stock",
                "securityDescription": "IBM"
*/


public class Figi {
    private Long id;
    private String figiFullName;
    private String securityType;
    private String marketSector;
    private String ticket;
    private String name;
    private String exchCode;
    private String shareClassFIGI;
    private String compositeFIGI;
    private String securityType2;
    private String securityDescription;

    public Figi() {
    }

    public Figi(Long id,
                String figiFullName,
                String securityType,
                String marketSector,
                String ticket,
                String name,
                String exchCode,
                String shareClassFIGI,
                String compositeFIGI,
                String securityType2,
                String securityDescription) {
        this.id = id;
        this.figiFullName = figiFullName;
        this.securityType = securityType;
        this.marketSector = marketSector;
        this.ticket = ticket;
        this.name = name;
        this.exchCode = exchCode;
        this.shareClassFIGI = shareClassFIGI;
        this.compositeFIGI = compositeFIGI;
        this.securityType2 = securityType2;
        this.securityDescription = securityDescription;
    }

    public Figi(String figiFullName,
                String securityType,
                String marketSector,
                String ticket,
                String name,
                String exchCode,
                String shareClassFIGI,
                String compositeFIGI,
                String securityType2,
                String securityDescription) {
        this.figiFullName = figiFullName;
        this.securityType = securityType;
        this.marketSector = marketSector;
        this.ticket = ticket;
        this.name = name;
        this.exchCode = exchCode;
        this.shareClassFIGI = shareClassFIGI;
        this.compositeFIGI = compositeFIGI;
        this.securityType2 = securityType2;
        this.securityDescription = securityDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFigiFullName() {
        return figiFullName;
    }

    public void setFigiFullName(String figiFullName) {
        this.figiFullName = figiFullName;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getMarketSector() {
        return marketSector;
    }

    public void setMarketSector(String marketSector) {
        this.marketSector = marketSector;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchCode() {
        return exchCode;
    }

    public void setExchCode(String exchCode) {
        this.exchCode = exchCode;
    }

    public String getShareClassFIGI() {
        return shareClassFIGI;
    }

    public void setShareClassFIGI(String shareClassFIGI) {
        this.shareClassFIGI = shareClassFIGI;
    }

    public String getCompositeFIGI() {
        return compositeFIGI;
    }

    public void setCompositeFIGI(String compositeFIGI) {
        this.compositeFIGI = compositeFIGI;
    }

    public String getSecurityType2() {
        return securityType2;
    }

    public void setSecurityType2(String securityType2) {
        this.securityType2 = securityType2;
    }

    public String getSecurityDescription() {
        return securityDescription;
    }

    public void setSecurityDescription(String securityDescription) {
        this.securityDescription = securityDescription;
    }

    @Override
    public String toString() {
        return "Figi{" +
                "id=" + id +
                ", figiFullName='" + figiFullName + '\'' +
                ", securityType='" + securityType + '\'' +
                ", marketSector='" + marketSector + '\'' +
                ", ticket='" + ticket + '\'' +
                ", name='" + name + '\'' +
                ", exchCode='" + exchCode + '\'' +
                ", shareClassFIGI='" + shareClassFIGI + '\'' +
                ", compositeFIGI='" + compositeFIGI + '\'' +
                ", securityType2='" + securityType2 + '\'' +
                ", securityDescription='" + securityDescription + '\'' +
                '}';
    }


}
