package entity;

import learn.KindLearn;
import org.junit.Test;

/**
 * @Description: 类测试
 * @Auther:LZ
 * @Date:2023/1/8 20:20
 */
public class KindLearnTest {

    private KindLearn kindLearn;

    public KindLearnTest() {
        Person a = new Person(new StringBuffer("张三"), 18, 0, 155, "医生", "北京", 12706);
        Person b = new Person(new StringBuffer("李四"), 20, 1, 160, "测试", "成都", 33333);
        Student c = new Student(new StringBuffer("王五"), 21, 1, 177, "运维", "上海", 55555, 98, 65);
        Student d = new Student(new StringBuffer("赵六"), 22, 0, 168, "开发", "重庆", 88888, 99, 77);
        kindLearn = new KindLearn(a, b, c, d);
    }

    /**
     * @description: TODO
     * 测试引用传值
     * @return: void
     * @author: lhd
     * @date: 2023/1/8 21:52
     */
    @Test
    public void QuoteTransmitTest() {
        kindLearn.QuoteTransmitCheck(kindLearn.getaPer(), kindLearn.getbPer());
    }

    /**
     * @description: TODO
     * 测试 包装类存储
     * @return: void
     * @author: lhd
     * @date: 2023/1/8 21:52
     */
    @Test
    public void WrapClassTypeStoreTest() {
        kindLearn.WrapClassTypeStoreCheck();
    }

}
