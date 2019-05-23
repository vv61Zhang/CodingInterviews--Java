//冒泡排序

public class Solution {
    public void reOrderArray(int [] array) {
        for(int i =array.length -1; i>0;i--){
            for(int j=0;j<i;j++){
                if(array[j]%2 == 0 &&array[j+1]%2==1){
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] =temp;
                }
            }
        }
    }
}

//最直接方法，新建两个vector,一个放odd ,一个放even，然后把even接到odd后面，最后放回数组里。

import java.util.Vector;
public class Solution {
    public void reOrderArray(int [] array) {
        Vector<Integer> odd = new Vector<Integer>();
        Vector<Integer> even = new Vector<Integer>();
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
                even.add(array[i]);
            }else{
                odd.add(array[i]);
            }
        }
        odd.addAll(even);
        for(int i=0;i<array.length;i++){
            array[i] = odd.get(i);
        }
    }
}
