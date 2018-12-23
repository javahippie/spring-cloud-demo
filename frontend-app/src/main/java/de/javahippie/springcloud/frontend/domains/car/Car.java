package de.javahippie.springcloud.frontend.domains.car;

import java.time.LocalDate;

public class Car {

    private String id;

    private String manufacturer;

    private String model;

    private LocalDate registrationDate;

    private Integer odometer;

    private String licensePlate;

    private Boolean winterTiresEquipped;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getOdometer() {
        return odometer;
    }

    public void setOdometer(Integer odometer) {
        this.odometer = odometer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Boolean getWinterTiresEquipped() {
        return winterTiresEquipped;
    }

    public void setWinterTiresEquipped(Boolean winterTiresEquipped) {
        this.winterTiresEquipped = winterTiresEquipped;
    }
}
