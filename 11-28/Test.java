package ProducerAndConsumer.version1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ellen
 * @date 2019-11-28 14:37
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        test();
//        test1();
//        test2();
        test3();
    }
    private static void test(){
        Goods goods = new Goods1();
        Thread productThread = new Thread(new Producer(goods), "生产者1 ");
        Thread consumeThread = new Thread(new Consumer(goods), "消费者1 ");
        // 有问题：
        productThread.start();
        consumeThread.start();
    }
    private static void test1(){
        Goods goods = new Goods2();
        Thread productThread = new Thread(new Producer(goods), "生产者2 ");
        Thread consumeThread = new Thread(new Consumer(goods), "消费者2 ");
        consumeThread.start();
        productThread.start();
    }
    private static void test2(){
        Goods goods = new Goods3();
        List<Thread> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Thread cosumer = new Thread(new Consumer(goods), "消费者" + i);
            list.add(cosumer);
        }
        for (int i = 1; i <= 5; i++) {
            Thread producer = new Thread(new Producer(goods), "生产者" + i);
            list.add(producer);
        }
        for(Thread th : list){
            th.start();
        }
    }
    private static void test3(){
        Goods goods = new Goods4();
        List<Thread> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Thread cosumer = new Thread(new Consumer(goods), "消费者" + i);
            list.add(cosumer);
        }
        for (int i = 1; i <= 5; i++) {
            Thread producer = new Thread(new Producer(goods), "生产者" + i);
            list.add(producer);
        }
        for(Thread th : list){
            th.start();
        }
    }
}
