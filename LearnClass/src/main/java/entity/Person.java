package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * @Description: 实例类：人
 * @Auther:LZ
 * @Date:2023/1/8 20:24
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 2463268396508123897L;

    private StringBuffer name;
    private Integer age;
    private Integer gender;
    private Integer height;
    protected String jobName;
    String jobPlace;
    public Integer jobSalary;
    static long allNum;

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", jobName='" + jobName + '\'' +
                ", jobPlace='" + jobPlace + '\'' +
                ", jobSalary=" + jobSalary +
                '}';
    }

    public Person(StringBuffer name, Integer age, Integer gender, Integer height, String jobName, String jobPlace, Integer jobSalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.jobName = jobName;
        this.jobPlace = jobPlace;
        this.jobSalary = jobSalary;
        allNum++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(height, person.height) &&
                Objects.equals(jobName, person.jobName) &&
                Objects.equals(jobPlace, person.jobPlace) &&
                Objects.equals(jobSalary, person.jobSalary);
    }


    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobPlace() {
        return jobPlace;
    }

    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace;
    }

    public Integer getJobSalary() {
        return jobSalary;
    }

    public void setJobSalary(Integer jobSalary) {
        this.jobSalary = jobSalary;
    }

    public StringBuffer getName() {
        return name;
    }

    public void setName(StringBuffer name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }


}
