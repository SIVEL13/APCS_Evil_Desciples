
public class Wiz {
	private String [] questions; 
	private int [] ans; 
	private String [][] posAns;
	
	private int currentQuestion;
	
	public Wiz(String[] questions, int [] ans, String[][] posAns){
		this.questions= questions;
		this.ans= ans;
		this.posAns= posAns;
	}
	
	public int getAmountOfQuestionsThatCouldPossiblyBeOrNotToBeFactoryBeeBea() {
		return ans.length;
	}
	public void setCurrentQuestion(int i) {
		currentQuestion = i;
	}
	public void nextQuestion() {
		currentQuestion ++;
	}
	
	
	public String getQuestion() {
		return questions[currentQuestion];
	}

	public String[] getPossibleAnswers() {
		return posAns[currentQuestion];
	}
	public int getRightIndex() {
		return ans[currentQuestion];
	}
}
