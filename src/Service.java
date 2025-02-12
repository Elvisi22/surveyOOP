import java.util.*;

public class Service {
    public static Alternativa findMostGivenAnswer(SurveyClass survey){
        Map<Alternativa , Integer> answerCounts = new HashMap<>();

        for (Question question : survey.getQuestionSet()){
            for (Alternativa alternativa : question.getResponse().values()){
                answerCounts.put(alternativa , answerCounts.getOrDefault(alternativa , 0) + 1);
            }
        }
        return Collections.max(answerCounts.entrySet() , Map.Entry.comparingByValue()).getKey();
    }
    public static void printSurveyResults(SurveyClass survey) {
        for (Question question : survey.getQuestionSet()) {
            System.out.println("Question: " + question.getText());
            Map<Alternativa, Integer> responseCounts = new HashMap<>();

            for (Alternativa response : question.getResponse().values()) {
                responseCounts.put(response, responseCounts.getOrDefault(response, 0) + 1);
            }

            for (var entry : responseCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
        }
    }

    public static Candidate findMostActiveCandidate(List<SurveyClass> surveys) {
        Map<Candidate, Integer> participationCount = new HashMap<>();

        for (SurveyClass survey : surveys) {
            for (Candidate candidate : survey.getCandidates()) {
                participationCount.put(candidate, participationCount.getOrDefault(candidate, 0) + 1);
            }
        }

        return Collections.max(participationCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

//    public static void removeLowResponseQuestions(SurveyClass survey) {
//        List<Question> toRemove = new ArrayList<>();
//        int totalCandidates = survey.getCandidates().size();
//
//        for (Question question : survey.getQuestionSet()) {
//            if (question.getResponseCount() < totalCandidates / 2) {
//                toRemove.add(question);
//            }
//        }
//
//        survey.getQuestionSet().removeAll(toRemove);
//    }

    public static boolean validateSurvey(SurveyClass survey) {
        return survey.getQuestionSet().size() >= 10 && survey.getQuestionSet().size() <= 40;
    }
}

