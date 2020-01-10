package main;

public class FizzBuzz {

    public String solution(int n){
        String str;
        if(n%3==0||String.valueOf(n).contains("3"))
            return str="Fizz";
        else if(n%5==0||String.valueOf(n).contains("5"))
            return str="Buzz";
        else if(n%3==0&&n%5==0)
            return str="FizzBuzz";
        else
            return str=String.valueOf(n);

    }

    public static void main(String[] args){
        FizzBuzz fb=new FizzBuzz();
        for(int i=1;i<=100;i++){
            System.out.println(fb.solution(i));
        }


    }

}
