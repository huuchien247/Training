import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello Java"); 
       System.out.println();
       System.out.print("Bạn bao nhiêu tuổi: ");
       Scanner sc = new Scanner(System.in);
       int tuoi = sc.nextInt();
       if(tuoi >= 18 && tuoi < 30){
           System.out.println("Bạn thật trẻ trung");
       } else if(tuoi >= 30 && tuoi <50){
           System.out.println("Bạn đã có nhà chưa?");
       } else {
           System.out.println("Bạn đã nghỉ hưu rồi sao");
       }

    }
}