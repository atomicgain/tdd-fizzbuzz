package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
public class TestFizzBuzz {
      FizzBuzz fizzBuzz = new FizzBuzz();
/**
 *  如果为3 的倍数则输出 Fizz
 */
      @Test
      public void TestThreeIsFizz() {
            assertThat(fizzBuzz.say(3)).isEqualTo("Fizz");
      }
/**
 *  如果为5 的倍数则输出 Buzz
 **/
      @Test
      public void TestFiveIsFuzz() {
            assertThat(fizzBuzz.say(5)).isEqualTo("Buzz");
      }
/**
 *  如果为7 的倍数则输出 Whizz
 **/
      @Test
      public void TestSevenIsWhizz() {
            assertThat(fizzBuzz.say(7)).isEqualTo("Whizz");
      }
/**
 *  如果为3 和 5  的倍数则输出 FizzBuzz
 **/
      @Test
      public void TestFifteenIsFizzBuzz() {
            assertThat(fizzBuzz.say(15)).isEqualTo("FizzBuzz");
      }
/**
 *  如果为5 和 7  的倍数则输出 FizzBuzz
 **/
      @Test
      public void Test35IsBuzzWhizz() {
            assertThat(fizzBuzz.say(35)).isEqualTo("BuzzWhizz");
      }
/**
 *  如果为3、5 和 7  的倍数则输出 FizzBuzzWhizz
 **/
      @Test
      public void Test105IsFizzBuzzWhizz() {
            assertThat(fizzBuzz.say(105)).isEqualTo("FizzBuzzWhizz");
      }

}
