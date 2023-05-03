import java.util.Scanner;

public class A1113317_0421_2 {
    public static void main(String[] args) {
        String date1 = "([0-9]{4})/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])";
    
        String date2 = "(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])/([0-9]{4})";

        Scanner inputScanner = new Scanner(System.in);
        String dateString;
        boolean dateResult;

        System.out.print("請輸入日期 (YYYY/MM/DD or MM/DD/YYYY): ");
        dateString = inputScanner.nextLine();

        // 檢查 date格式
        dateResult = dateString.matches(date1);
        if (dateResult) {
            // YYYY/MM/DD 
            if (dateString.substring(0, 4).compareTo("0000") == 0)
                System.out.println("年不可為0");
            else
                System.out.println(dateString.substring(0, 4)+"年"+dateString.substring(5, 7)+"月"+dateString.substring(8, 10)+"日");
        }            
        else {
            dateResult = dateString.matches(date2);
            if (dateResult) {
                // MM/DD/YYYY
                if (dateString.substring(6, 10).compareTo("0000") == 0)
                    System.out.println("年不可為0");
                else
                    System.out.println(dateString.substring(6, 10)+"年"+dateString.substring(0, 2)+"月"+dateString.substring(3, 5)+"日");
            }
            else {
                System.out.println("輸入錯誤");
            }
            
        }           
        
    }
}
