import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");       
        
        System.out.println(pitches);

        System.out.println(pitches.get(1));     // get(#) : 특정 인덱스값 추출

        System.out.println(pitches.size());     // size() : ArrayList 갯수 리턴

        System.out.println(pitches.contains("142"));    // contains() : 포함여부를 Boolean으로 알려줌

        System.out.println(pitches.remove("129"));      // remove() : 객체 삭제하고 성공여부 반환(true/false)
        
        System.out.println(pitches.size());

        System.out.println(pitches.remove(1));          // 인덱스 항목 삭제하고 삭제된 항목 리턴
    }
}
