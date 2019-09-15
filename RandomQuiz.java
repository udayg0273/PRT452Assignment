	import java.util.stream.Collectors;
	import java.util.Arrays;
	

	public class RandomQuiz {

		public String run(String[] inputs) {
			return Arrays.stream(inputs)
					.mapToObj(this::quiz)
					.collect(Collectors.joining(", "));
		}
		
		public String quiz(String input) {
			Random random = new Random();
			int randomNumber = random.nextInt(100 - 0) + 0;
			
			if(!continueProgram(input)){
				return "Quiz Terminated";
			}
			
			if(!checkInputType(input)){
				return "Invalid Input, please enter number";
			}
			
			if(!checkUpperBond(input)){
				return "Input should be greater <= 100";
			}
			
			if(!checkLowerBond(input)){
				return "Input should be greater >= 0";
			}
			
			return winner(input);		
			
		}
			
			
		private boolean continueProgram(String ip) {
			if(ip.equals("q") || ip.equals("Q")){
				return False;
			}
			return True;
		}

		private boolean checkInputType(String ip) {
			try{
				int num = Integer.parseInt(ip);
				// is a number!
				return True;
			} catch (NumberFormatException e) {
				// not a number NAN!
				return !continueProgram(ip);
			}
			return False;
		}

		private boolean checkUpperBond(int number) {
			return number <= 100;
		}

		private boolean checkLowerBond(int number) {
			return number => 0;
		}
		
		private String winner(int random, int input){
			if(random == input){
				return "Winner !!";
			}
			return "Try Again.";
		}
		
	}