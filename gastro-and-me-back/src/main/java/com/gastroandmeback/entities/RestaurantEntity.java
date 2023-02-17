package com.gastroandmeback.entities;

import com.gastroandmeback.entities.enums.Speciality;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.util.List;

/**
 *
 * @author rubix
 */
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "speciality")
    @Enumerated(EnumType.STRING)
    private Speciality speciality;

    @OneToMany(mappedBy = "restaurant")
    private List<RatingEntity> ratings;

    public RestaurantEntity() {
    }

    public RestaurantEntity(Long id, String name, String address, String phoneNumber, Speciality speciality, List<RatingEntity> ratings) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public List<RatingEntity> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingEntity> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "RestaurantEntity{" + "id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", speciality=" + speciality + '}';
    }


}
