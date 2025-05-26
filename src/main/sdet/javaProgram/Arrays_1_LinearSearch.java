package javaProgram;

public class Arrays_1_LinearSearch {
    public static void main(String[] args) {
        int number[] = {10,12,13,14,15,16};
        int searchNumber= 16;
        boolean status= false;
        for(int i=0;i<number.length;i++){
            if(searchNumber==number[i]){
                System.out.println("Searched number "+searchNumber+ " is present at index "+i);
                status=true;
                break;
            }
        }if(status==false){
            System.out.println("Searched number "+searchNumber+ " is not present");
        }
    }
}
