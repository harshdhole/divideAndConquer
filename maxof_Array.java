import java.util.ArrayList;
public class maxof_Array {

    public static void main(String args[]){

        ArrayList<Integer>list = new ArrayList<>();

        list.add(3);
        list.add(14);
        list.add(7);
        list.add(9);
        list.add(1);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max,list.get(i));
        }
        System.out.print("max element is : " + max);
    }
    
}
