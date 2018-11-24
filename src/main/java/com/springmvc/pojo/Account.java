package com.springmvc.pojo;

public class Account {
    private Integer id;
    private String name;
    private String registTiem;

    public Account(Integer id, String name, String registTiem) {
        this.id = id;
        this.name = name;
        this.registTiem = registTiem;
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

    public String getRegistTiem() {
        return registTiem;
    }

    public void setRegistTiem(String registTiem) {
        this.registTiem = registTiem;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registTiem='" + registTiem + '\'' +
                '}';
    }
}
