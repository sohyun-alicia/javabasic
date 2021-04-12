package javanextstep;

public class Test2 {
    public void sayNick(String nick) throws FoolException {
        if ("fool".equals(nick)) {
        throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
        // } catch(FoolException e) {
        //     System.err.println("FoolException이 발생했습니다.");
        } 
        

    public static void main(String[] args) {
        Test2 test = new Test2();
        try {
            test.sayNick("fool");
            test.sayNick("genious");
        } catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
        
    }

    // FoolException 처리를 sayNick 메소드에서 하는것이 좋을까? 아니면 main 메소드에서 하는것이 좋을까?
    
    // sayNick 메소드에서 예외를 처리하는 경우에는 다음의 두 문장이 모두 수행
    // test.sayNick("fool");
    // test.sayNick("genious");

    //  main 메소드에서 다음과 같이 예외 처리를 한 경우에는 두번 째 문장인 test.sayNick("genious");가 수행되지 않음
    // 이미 첫번 째 문장에서 예외가 발생하여 catch 문으로 빠져버리기 때문
    
    // public void sayNick(String nick) {
    //     try {
    //         if("fool".equals(nick)) {
    //             throw new FoolException();
    //         }
    //         System.out.println("당신의 별명은 "+nick+" 입니다.");
    //     }catch(FoolException e) {
    //         System.err.println("FoolException이 발생했습니다.");
    //     }
    // }

    // public static void main(String[] args) {
    //     Test2 test = new Test2();
    //     test.sayNick("fool");
    //     test.sayNick("genious");
    // }
}
