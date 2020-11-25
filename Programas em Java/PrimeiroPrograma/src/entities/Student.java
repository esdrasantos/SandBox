package entities;

public class Student {
	
	public String name;
	public Double gradeFirstTerm;
	public Double gradeSecondTerm;
	public Double gradeThirdTerm;
	
	public double finalGrade()
	{
		return gradeFirstTerm + gradeSecondTerm + gradeThirdTerm;
	}
	
	public String finalDecision() {
		
	//	double finalGrade = finalGrade();
		
		if(finalGrade() >= 60)
			return "PASS";
		else
			return "FAILED" +'\n'+ "MISSING " + (60 - finalGrade()) + " POINTS";
	}
}
