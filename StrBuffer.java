public class StrBuffer {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("jump to java");
        // System.out.println(sb.toString());

        //-------------insert ----------------//
        // StringBuffer sb = new StringBuffer();
        // sb.append("jump to java");
        // sb.insert(0, "hello ");
        // System.out.println(sb.toString());

        //-------------substring--------------//
        StringBuffer sb = new StringBuffer();
        sb.append("Hellow jump to java");
        System.out.println(sb.substring(0, 4));
    }
}
