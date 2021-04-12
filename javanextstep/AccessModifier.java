package javanextstep;

public class AccessModifier {

    // private 접근제어자가 있다면, 해당 메소드는 해당 클래스 내에서만 접근이 가능
    private String secret;
    private String getSecret() {
        return this.secret;
    }
}
