package com.object;

/**
 * Created by zkyze on 2017/9/27.
 */
public class User {
    private String name;
    private Integer age;
//    private ContactInfo contactInfo;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

//    public ContactInfo getContactInfo() {
//        return contactInfo;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public void setContactInfo(ContactInfo contactInfo) {
//        this.contactInfo = contactInfo;
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
//                ", contactInfo=" + contactInfo +
                '}';
    }
}
