import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("people"));      // get(key): key값 사용해서 value값 얻기
        System.out.println(map.get("baseball"));

        System.out.println(map.containsKey("people"));      // containsKey(key): 해당 key값이 있는지 없는지 여부

        System.out.println(map.remove("people"));       // remove(key): key값에 해당되는 아이템(key, value)을 삭제

        System.out.println(map);

    }
}
