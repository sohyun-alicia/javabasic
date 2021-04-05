package controlstatement;
import java.util.ArrayList;

public class IfExample {
    public static void main(String[] args) {
        // boolean money = true;
        // if (money) {
        //     System.out.println("택시를 타고 가라");
        // }
        // else {
        //     System.out.println("걸어가라");
        // }

        // int money = 2000;
        // boolean hasCard = true;

        // if (money >= 3000 | hasCard) {              // | : or
        //     System.out.println("택시를 타고 가라");
        // }
        // else {
        //     System.out.println("걸어가라");
        // }

        /*
        |, || -> or
        True or False -> True       1개 확인
        True or True -> True        1개 확인
        True or True -> True        1개 확인
        False or False -> False     2개 확인
        | : 앞, 뒤 True여부 모두 체크
        || : 앞에서 True가 나오면 뒤에 요소는 확인 X

        & 둘다 전부 따져서 결과 도출
        && 하나만 따져서 결과 도출
        True & False -> False 2개 확인
        True & True -> True 2개 확인
        False && True -> False 1개 확인
        False && False -> False 1개 확인

        */

        // ---------------------contains-----------------//
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else if(hasCard) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
    }
}
