//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SurveyClass survey = new SurveyClass("Employee Feedback", "Workplace", "Survey about job satisfaction.");

        // Adding questions
        Question q1 = new Question("Do you feel valued at work?");
        Question q2 = new Question("Are you satisfied with your salary?");

        survey.addQuestion(q1);
        survey.addQuestion(q2);

        // Adding candidates
        Candidate c1 = new Candidate("Alice", "Smith", "alice@gmail.com", "1234567890");
        Candidate c2 = new Candidate("Bob", "Jones", "bob@gmail.com", "0987654321");

        survey.registerCandidate(c1);
        survey.registerCandidate(c2);

        // Recording answers
        q1.saveAnswer(c1, Alternativa.AGREE);
        q1.saveAnswer(c2, Alternativa.DISAGREE);
        q2.saveAnswer(c1, Alternativa.SLIGHTLY_AGREE);
        q2.saveAnswer(c2, Alternativa.AGREE);

        // Display survey results
        Service.printSurveyResults(survey);

        // Find most common answer
        System.out.println("Most Given Answer: " + Service.findMostGivenAnswer(survey));

        // Validate survey
        System.out.println("Is Survey Valid? " + Service.validateSurvey(survey));
    }
}

