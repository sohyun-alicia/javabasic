import java.util.ArrayList;

public class GenericsExample{
    public void main(String[] args){
        // ArrayList aList = new ArrayList();
        // aList.add("hello");
        // aList.add("java");

        // String hello = (String) aList.get(0);
        // String java = (String) aList.get(1);
        // 위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식
        // 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해 주어야만 한다


        ArrayList<String> aList = new ArrayList<String>();
        aList.add("hello");
        aList.add("java");

        String hello = aList.get(0);
        String java = aList.get(1);

    }

}