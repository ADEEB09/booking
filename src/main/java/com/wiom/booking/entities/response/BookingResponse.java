package com.wiom.booking.entities.response;

public class BookingResponse {
    private Long id;
    private String name;
    private String mobile;
    private Integer status;
    private String address;

    // Constructor
    public BookingResponse(Long id, String name, String mobile, Integer status, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.status = status;
        this.address = address;
    }

    // Getters and Setters
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

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
