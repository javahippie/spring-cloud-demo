package de.javahippie.springcloud.car.domains.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Car implements Serializable {

    @Id
    private String id;

    @Column
    private String manufacturer;

    @Column
    private String model;

    @Column
    private LocalDate registrationDate;

    @Column
    private Integer odometer;

    @Column
    private String licensePlate;

    @Column
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
