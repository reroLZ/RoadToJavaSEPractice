package entity;

import java.io.Serializable;

/**
 * @Description: 实例类：学生
 * @Auther:LZ
 * @Date:2023/1/8 20:21
 */
public class Student extends Person implements Serializable {
    private static final long serialVersionUID = -8227237285085579763L;
    private int mathScore;
    private int sportsScore;


    @Override
    public String toString() {
        return "Student{" +
                "mathScore=" + mathScore +
                ", sportsScore=" + sportsScore +
                ", jobName='" + jobName + '\'' +
                ", jobPlace='" + jobPlace + '\'' +
                ", jobSalary=" + jobSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return mathScore == student.mathScore &&
                sportsScore == student.sportsScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }

    public void setSportsScore(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public Student(StringBuffer name, Integer age, Integer gender, Integer height, String jobName, String jobPlace, Integer jobSalary, int mathScore, int sportsScore) {
        super(name, age, gender, height, jobName, jobPlace, jobSalary);
        this.mathScore = mathScore;
        this.sportsScore = sportsScore;
    }
}
