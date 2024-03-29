package com.codeclan.example.bookingService.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private String date;


    @JsonIgnoreProperties("booking")
    @ManyToOne
    @JoinColumn(
            name = "course_id",
            nullable = false)
    private Course course;

    @JsonIgnoreProperties("booking")
    @ManyToOne
    @JoinColumn(
            name = "customer_id",
            nullable = false)
    private Customer customer;

    public Booking(){

    }

    public Booking(String date, Course course, Customer customer){
        this.date = date;
        this.course = course;
        this.customer = customer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
