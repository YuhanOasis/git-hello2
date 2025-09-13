
package M8W4API;

import java.util.ArrayList;
import java.util.List;

public class RandomNumber {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        /*
        向list集合中存入10个0-100之间的随机整数
         */
        for(int i = 0;i<10;i++){
            int number = (int)(Math.random()*100);
            list.add(number);
        }
        System.out.println(list);
    }
}
