package com.felixwc.ssm.mvc.start.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.Arrays;
import java.util.Date;

/**
 * TODO
 *
 * @author lenovo
 * since 2020-10-13  11:09
 */
public class User {
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private String name;
    private Boolean gender;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date birth;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String[] hobby;

    public User() {
    }

    public User(Integer id, String name, Boolean gender, Date birth, String[] hobby) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birth=" + birth +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
