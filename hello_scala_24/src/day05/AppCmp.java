package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppCmp {
    /**
     * 在scala中对应comparable的是ordere这个特质
     * comparator
     */



    public static void main(String[] args){

        Techers dd = new Techers("丁丁", 99);
        Techers jj = new Techers("静静", 100);

        List<Techers> list = new ArrayList<>();
        list.add(dd);
        list.add(jj);

        //比较两个老师的颜值
        Collections.sort(list, new Comparator<Techers>() {
            @Override
            public int compare(Techers o1, Techers o2) {
                return o1.getFaceValue()-o2.getFaceValue();
            }
        });



        for(Techers t:list){
            System.out.println("teachers:"+t.getName());
        }


    }

}
