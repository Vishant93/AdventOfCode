import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> list = new ArrayList();
        Map<Integer, Integer> map = new HashMap();
        File file = new File("C:\\Users\\visha\\Desktop\\input.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            list.add(Integer.parseInt(input.nextLine()));
        }
        int target = 2020;
        for (int n : list) {
            System.out.print(n+",");
        }
        for (int i = 0; i < list.size(); i++) {
            int diff = target - list.get(i);
            //System.out.println(diff);
            if (map.containsKey(diff)) {
                System.out.println(map.get(diff) + " " + i);
            }
            map.put(list.get(i), i);
        }
    }
}
