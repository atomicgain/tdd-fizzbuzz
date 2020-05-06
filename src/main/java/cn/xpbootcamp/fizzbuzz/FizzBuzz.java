package cn.xpbootcamp.fizzbuzz;


/**
 * 被3整除，则报Fizz 
 * 被5整除，则报Buzz
 * 被7整除，则报Whizz
**/
public class FizzBuzz {
    public String say(int i) {
        String res="";
        if (i%3==0)
            res += "Fizz";
        if (i%5==0)
            res += "Buzz";
        if (i%7==0)
            res += "Whizz";
        return res;
    }
}
