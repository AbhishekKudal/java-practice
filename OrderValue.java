import java.util.*;


public class OrderValue{
    public static void main(String a[]){
        Map<String, Integer> names = new HashMap<String, Integer>();
        names.put("Anne", 10);
        names.put("John", 35);
        names.put("Bob", 2);

        Set<Map.Entry<String, Integer>> set = names.entrySet();

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> order1, Map.Entry<String, Integer> order2){
                return (order2.getValue().compareTo(order1.getValue()));
            }
        }
        
        );

        for(Map.Entry<String, Integer> entry : list){
            System.out.println(" " + entry.getKey());
        }

    }
}