public class TestString {
    public static void main(String[] args) {
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));              // 시작점
        System.out.println(a.replaceAll("Java", "World"));  // 대체
        System.out.println(a.substring(0, 4));              // 잘라내기
        System.out.println(a.toUpperCase());                // 대문자로 만들기
        
    }
    
}
