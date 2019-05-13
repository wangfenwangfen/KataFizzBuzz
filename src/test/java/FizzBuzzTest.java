import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_return_1_if_is_1() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 1;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "1";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_2_if_is_2() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 2;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "2";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_fizz_if_is_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "fizz";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_4_if_is_4() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 4;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "4";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_buzz_if_is_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "buzz";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_fizz_if_is_multiply_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 6;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "fizz";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_buzz_if_is_multiply_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "buzz";
        assertThat(result).isEqualTo(stringExpected);
    }


    @Test
    public void should_return_fizzbuzz_if_is_multiply_15() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String result = fizzBuzz.affiche(number, number);
        String stringExpected = "fizzbuzz";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_12fizz_if_is_from_1_to_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int numberBegin = 1;
        int numberEnd = 3;
        String result = fizzBuzz.affiche(numberBegin,numberEnd);
        String stringExpected = "12fizz";
        assertThat(result).isEqualTo(stringExpected);
    }
    @Test
    public void should_return_12fizz_if_is_from_1_to_4() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int numberBegin = 1;
        int numberEnd = 4;
        String result = fizzBuzz.affiche(numberBegin,numberEnd);
        String stringExpected = "12fizz4";
        assertThat(result).isEqualTo(stringExpected);
    }

    @Test
    public void should_return_12fizzetc_if_is_from_1_to_15() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        int numberBegin = 1;
        int numberEnd = 15;
        String result = fizzBuzz.affiche(numberBegin,numberEnd);
        String stringExpected = "12fizz4buzzfizz78fizzbuzz11fizz1314fizzbuzz";
        assertThat(result).isEqualTo(stringExpected);
    }
}
