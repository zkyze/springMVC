package com.object;

/**
 * Created by zkyze on 2017/9/27.
 */
public class ContactInfo {
    private String phone;
    private String address;

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
