import java.util.*;

public class maxvalueR {
    public static int maxvalue(ArrayList<Integer> list1, int arraysize,int max){

        if(arraysize == -1){
            return max;
        }
        else if(list1.get(arraysize)>max){
            max = list1.get(arraysize);
        }
        return maxvalue(list1,arraysize-1,max);

    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);
        A.add(69);
        A.add(45);
        A.add(3);
        A.add(7);
        A.add(78);

        int x = A.size()-1;
        int y = 0;

        int maxvalue = maxvalue(A,x,y);

        System.out.println(maxvalue);
    }
}