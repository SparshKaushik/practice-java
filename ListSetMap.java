    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.Scanner;

    public class ListSetMap {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<Integer>();
            HashSet<Integer> set = new HashSet<Integer>();
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                list.add(x);
                set.add(x);
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
            System.out.println("List: " + list);
            System.out.println("Set: " + set);
            System.out.println("Map: " + map);
            sc.close();
        }
    }
