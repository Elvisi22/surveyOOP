import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SurveyClass survey = new SurveyClass("Employee Feedback", "Workplace", "Survey about job satisfaction.");

        // Adding questions
        Question q1 = new Question("Do you feel valued at work?");
        Question q2 = new Question("Are you satisfied with your salary?");
        Question q3 = new Question("Do you have opportunities for career growth?");
        Question q4 = new Question("Is your workload manageable?");
        Question q5 = new Question("Do you receive constructive feedback regularly?");
        Question q6 = new Question("Are you happy with your work-life balance?");
        Question q7 = new Question("Do you feel supported by your colleagues?");
        Question q8 = new Question("Is your work environment comfortable and safe?");
        Question q9 = new Question("Do you have clear goals and expectations in your job?");
        Question q10 = new Question("Does your manager listen to your concerns?");
        Question q11 = new Question("Do you have access to the tools and resources needed for your job?");
        Question q12 = new Question("Are you satisfied with the company’s leadership?");
        Question q13 = new Question("Does your company promote a positive workplace culture?");
        Question q14 = new Question("Would you recommend your company as a good place to work?");

        survey.addQuestion(q1);
        survey.addQuestion(q2);
        survey.addQuestion(q3);
        survey.addQuestion(q4);
        survey.addQuestion(q5);
        survey.addQuestion(q6);
        survey.addQuestion(q7);
        survey.addQuestion(q8);
        survey.addQuestion(q8);
        survey.addQuestion(q9);
        survey.addQuestion(q10);
        survey.addQuestion(q11);
        survey.addQuestion(q12);
        survey.addQuestion(q13);
        survey.addQuestion(q14);

        // Adding candidates
        Candidate c1 = new Candidate("Elvis", "Barjami", "test@gmail.com", "1234567890");
        Candidate c2 = new Candidate("Testi", "2", "test2@gmail.com", "0987654321");

        survey.registerCandidate(c1);
        survey.registerCandidate(c2);

        // Recording answers
        q1.saveAnswer(c1, Alternativa.AGREE);
        q1.saveAnswer(c2, Alternativa.DISAGREE);
        q2.saveAnswer(c1, Alternativa.SLIGHTLY_AGREE);
        q2.saveAnswer(c2, Alternativa.AGREE);
        q3.saveAnswer(c1, Alternativa.AGREE);
        q3.saveAnswer(c2, Alternativa.DISAGREE);

        q4.saveAnswer(c1, Alternativa.AGREE);
        q4.saveAnswer(c2, Alternativa.DISAGREE);

        q5.saveAnswer(c1, Alternativa.SLIGHTY_DISAGREE);
        q5.saveAnswer(c2, Alternativa.AGREE);

        q6.saveAnswer(c1, Alternativa.DISAGREE);
        q6.saveAnswer(c2, Alternativa.AGREE);

        q7.saveAnswer(c1, Alternativa.AGREE);
        q7.saveAnswer(c2, Alternativa.SLIGHTLY_AGREE);

        q8.saveAnswer(c1, Alternativa.AGREE);
        q8.saveAnswer(c2, Alternativa.AGREE);

        q9.saveAnswer(c1, Alternativa.DISAGREE);
        q9.saveAnswer(c2, Alternativa.DISAGREE);

        q10.saveAnswer(c1, Alternativa.AGREE);

        q11.saveAnswer(c1, Alternativa.AGREE);
        q11.saveAnswer(c2, Alternativa.SLIGHTLY_AGREE);

        q12.saveAnswer(c1, Alternativa.DISAGREE);
        q12.saveAnswer(c2, Alternativa.DISAGREE);

        q13.saveAnswer(c1, Alternativa.DISAGREE);
        q13.saveAnswer(c2, Alternativa.AGREE);

        q14.saveAnswer(c1, Alternativa.SLIGHTLY_AGREE);
        q14.saveAnswer(c2, Alternativa.DISAGREE);

        System.out.println("Is Survey Valid? " + Service.validateSurvey(survey));

        // Display survey results
        Service.printSurveyResults(survey);

        // Find most common answer
        System.out.println("Most Given Answer: " + Service.findMostGivenAnswer(survey));
        List<SurveyClass> surveys = new ArrayList<>();
        surveys.add(survey);

        System.out.println("Most active " + Service.findMostActiveCandidate(surveys));


    }
}

