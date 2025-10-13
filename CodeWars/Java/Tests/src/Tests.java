import java.util.*;

public class Tests {

    public static boolean check(String paraula) {
        paraula = paraula.toLowerCase();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 0); map.put("b", 0); map.put("c", 0);
        map.put("d", 0); map.put("e", 0); map.put("f", 0);
        map.put("g", 0); map.put("h", 0); map.put("i", 0);
        map.put("j", 0); map.put("k", 0); map.put("l", 0);
        map.put("m", 0); map.put("n", 0); map.put("o", 0);
        map.put("p", 0); map.put("q", 0); map.put("r", 0);
        map.put("s", 0); map.put("t", 0); map.put("u", 0);
        map.put("v", 0); map.put("w", 0); map.put("x", 0);
        map.put("y", 0); map.put("z", 0);

        String[] lletres = paraula.split("");

        for(String lletra : lletres) {
            if(map.containsKey(lletra)) {
                map.put(lletra, map.get(lletra) + 1);
            }
        }

        for(Map.Entry<String, Integer> lletresDicc : map.entrySet()) {
            if(lletresDicc.getValue() <= 0)
                return false;
        }
        return true;
    }

    public static int sortDesc(final int num) {
        ArrayList<String> nums = new ArrayList<>();

        for(String n : Integer.toString(num).split(""))
            nums.add(n);
        Collections.sort(nums, Collections.reverseOrder());

        String res = "";
        for(String a : nums) {
            res += a;
        }

        return Integer.parseInt(res);
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //System.out.println(check(input.nextLine()));
        //System.out.println(sortDesc(123456789));

    }
}
