package controlstatement;

public class SwitchDemo {
    public static void main(String[] args) {
        // int month = 8;
        // String monthString = "";
        // switch (month) {
        //     case 1: monthString = "January";
        //     break;
        //     case 2: monthString = "February";
        //     break;
        //     case 3: monthString = "March";
        //     break;
        //     case 4: monthString = "April";
        //     break;
        //     case 5: monthString = "May";
        //     break;
        //     case 6: monthString = "June";
        //     break;
        //     case 7: monthString = "July";
        //     break;
        //     case 8: monthString = "August";
        //     break;
        //     case 9: monthString = "September";
        //     break;
        //     case 10: monthString = "October";
        //     break;
        //     case 11: monthString = "November";
        //     break;
        //     case 12: monthString = "December";
        //     break;
        //     default: monthString = "Invalid month";
        //     break;
    
        // }
        // System.out.println(monthString);


        // 입력되는 월에 해당하는 계절 출력하기
        int month = 8;
        String monthString = "";
        switch(month){
            case 12: 
            case 1:
            case 2: monthString = "겨울";
            break;
            case 3: 
            case 4: 
            case 5: monthString = "봄";
            break;
            case 6: 
            case 7:
            case 8: monthString = "여름";
            break;
            case 9: 
            case 10: 
            case 11: monthString = "가을";
            break;
            default: monthString = "Invalid month";
            break;
        }
        System.out.println(monthString);
    }
}

