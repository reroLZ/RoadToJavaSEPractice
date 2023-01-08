package learn;

import entity.Person;
import entity.Student;

/**
 * @Description: 类学习
 * @Auther:LZ
 * @Date:2023/1/8 20:02
 */
public class KindLearn {
    private Person aPer;
    private Person bPer;
    private Student aStu;
    private Student bStu;

    /**
     * @description: TODO
     * 对象串行化
     * @return: void
     * @author: lhd
     * @date: 2023/1/9 2:01
     */

    public void sev() {

    }

    /**
     * @description: TODO
     * 包装类
     * 结果：包装类的对象值改变时，new了一个新对象赋值
     * @return: void
     * @author: lhd
     * @date: 2023/1/9 0:29
     */
    public void WrapClassTypeStoreCheck() {
        Integer num = 2;
        Integer num2 = num;
        num.hashCode();
        System.out.println("原num :" + num + "  哈希：" + num.hashCode() + "  数值：" + num.intValue()
                + " sys哈希:" + System.identityHashCode(num));
        System.out.println("原num2:" + num2 + "  哈希：" + num2.hashCode() + "  数值：" + num2.intValue()
                + " sys哈希:" + System.identityHashCode(num2));
        num = num * num + 1;
        System.out.println("平方加一后num:" + num + "  哈希：" + num.hashCode() + "  数值：" + num.intValue()
                + " sys哈希:" + System.identityHashCode(num));
        System.out.println("num  sys哈希:" + System.identityHashCode(num));
        System.out.println("num2 sys哈希:" + System.identityHashCode(num2));
    }

    /**
     * @description: TODO
     * 引用传递检查
     * 结果：参数得到对象的地址，1.根据这个地址操作接口可改变原对象某些成员变量，2.参数换个地址，原对象指向的地址不变
     * @return: void
     * @author: lhd
     * @date: 2023/1/8 21:28
     */
    public void QuoteTransmitCheck(Person a, Person b) {
        Person c = new Person(new StringBuffer("lz"), 99, 1, 173, "工程师", "地球", 9999999);
        int num = a.getAge();
        System.out.println("人对象交换前：");
        System.out.println("a:" + a.toString());
        System.out.println("b:" + b.toString());
        a.setAge(b.getAge());
        b.setAge(num);
        System.out.println("人对象数值交换后：");
        System.out.println("a:" + a.getName() + a.getAge());
        System.out.println("b:" + b.getName() + b.getAge());
        System.out.println("原a:" + aPer.toString());
        System.out.println("原b:" + bPer.toString());
        System.out.println("人对象引用交换后：");
        b = a;
        a = c;
        System.out.println("c:" + c.getName() + c.getAge());
        System.out.println("b=a:" + b.getName() + b.getAge());
        System.out.println("a=c:" + a.getName() + a.getAge());
        System.out.println("原a:" + aPer.toString());
        System.out.println("原b:" + bPer.toString());
    }

    public KindLearn(Person aPer, Person bPer, Student aStu, Student bStu) {
        this.aPer = aPer;
        this.bPer = bPer;
        this.aStu = aStu;
        this.bStu = bStu;
    }

    public Person getaPer() {
        return aPer;
    }

    public void setaPer(Person aPer) {
        this.aPer = aPer;
    }

    public Person getbPer() {
        return bPer;
    }

    public void setbPer(Person bPer) {
        this.bPer = bPer;
    }

    public Student getaStu() {
        return aStu;
    }

    public void setaStu(Student aStu) {
        this.aStu = aStu;
    }

    public Student getbStu() {
        return bStu;
    }

    public void setbStu(Student bStu) {
        this.bStu = bStu;
    }
}
