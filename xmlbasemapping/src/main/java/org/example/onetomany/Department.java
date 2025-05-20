package org.example.onetomany;

import java.time.LocalDateTime;
import java.util.List;

public class Department {

    private long id;

    private String deptName;

    private String location;

    private String  code;

    private LocalDateTime createDate;

    private LocalDateTime  updatedDate;

    private List<Employee> employee;



    public Department() {
    }

    public Department(long id, String deptName, String location, String code, LocalDateTime createDate, LocalDateTime updatedDate) {
        this.id = id;
        this.deptName = deptName;
        this.location = location;
        this.code = code;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
