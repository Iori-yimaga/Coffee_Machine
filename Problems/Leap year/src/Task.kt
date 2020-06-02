import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(leapYear(year));
    }

    public static String leapYear(int year){
        String flag = "";
        if(year >= 1900 && year <= 3000){
            if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                flag = "Leap";
            }else{
                flag = "Regular";
            }
        }else{
            System.out.println("err");
        }
        return flag;
    }
}