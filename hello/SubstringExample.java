public class SubstringExample {
    public static void main(String[] args){
        String a = "Hello Java";
        System.out.println(a.substring(0, 4));

        //문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다. 
        // 단 끝위치는 포함이 안된다는 점에 주의하자. 
        // 시작위치 <= a < 끝위치
    }
    
}
