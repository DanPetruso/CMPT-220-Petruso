import java.util.ArrayList;

public class p13_3 {
    public static void main (String [] args){
        ArrayList<Number> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(-7);
        list.add(10);

        for(Number x : list){
            System.out.print(x + " ");
        }
        System.out.println();


        sort(list);


    }

    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-1; j++) {
                if(list.get(j).doubleValue() > list.get(j+1).doubleValue()){
                    double temp = list.get(j).doubleValue();
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);

                }
            }
        }
        for(Number x : list){
            System.out.print(x + " ");
        }

    }
}
