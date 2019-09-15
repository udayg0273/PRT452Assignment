import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RandomQuizTest {

    @Test
    public void testRun1() {
        RandomQuiz rq = new RandomQuiz();

        assertThat(rq.run(new int[]{"95"}), is("Try Again."));
        assertThat(rq.run(new int[]{"13","56","-5","1230","q","asd"}), is("Try Again.", "Try Again.", 
		"Input should be greater >= 0", "nput should be greater <= 100", "Quiz Terminated", "Invalid Input, please enter number"));
    }

    @Test
    public void testRun2() {
		RandomQuiz rq = new RandomQuiz();
	  
        assertThat(rq.quiz("99"), is("Winner !!"));
		assertThat(rq.quiz("ABC"), is("Invalid Input, please enter number"));
		assertThat(rq.quiz("999"), is("Input should be greater <= 100"));
		assertThat(rq.quiz("-10"), is("Input should be greater >= 0"));
        assertThat(rq.quiz("Q"), is("Quiz Terminated"));
		assertThat(rq.quiz("75"), is("Try Again."));
		assertThat(rq.quiz("65"), is("Try Again."));
       
    }

}