public class Main {
    public static void main(String[] args) {
        int num1=20;
        int num2=25;
        int num3=24;
        int num4=18;
        int largnum= num1;

        if(largnum<num2){
            largnum = num2;
        }
        if(largnum<num3){
            largnum = num3;
        }
        if(largnum<num4){
            largnum = num4;
        }
        System.out.println("Largest Number : "+ largnum);
    }
}