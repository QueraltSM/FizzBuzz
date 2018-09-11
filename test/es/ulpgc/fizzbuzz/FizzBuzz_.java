package es.ulpgc.fizzbuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzz_ {

    @Test
    public void given_1_return_1(){ Assertions.assertEquals("1", new Fizzbuzz().of(1));}

    @Test
    public void given_2_return_2(){
        Assertions.assertEquals("2", new Fizzbuzz().of(2));
    }

    @Test
    public void given_3_return_Fizz(){
        Assertions.assertEquals("Fizz", new Fizzbuzz().of(3));
    }

    @Test
    public void given_5_return_Buzz(){
        Assertions.assertEquals("Buzz", new Fizzbuzz().of(5));
    }

    @Test
    public void given_15_return_FizzBuzz(){
        Assertions.assertEquals("FizzBuzz", new Fizzbuzz().of(15));
    }

    private static class Fizzbuzz {
        public String of(int number) {
            return fizz(number) + buzz(number);
        }

        private static String fizz(int number) {
            if (number % 3 == 0) return "Fizz";
            return "";
        }

        private static String buzz(int number) {
            if (number % 5 == 0) return "Buzz";
            return "";
        }
    }
}