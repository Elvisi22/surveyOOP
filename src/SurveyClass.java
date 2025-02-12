import java.util.*;

public class SurveyClass {
    private String title;
    private String topic;
    private String description;
    private List<Question> questionSet;
    private Set<Candidate> candidates;

    public SurveyClass(String title, String topic, String description) {
        this.title = title;
        this.topic = topic;
        this.description = description;
        this.questionSet = new ArrayList<>();
        this.candidates = new HashSet<>();
    }

    public void addQuestion(Question question){
        if(!questionSet.contains(question) && questionSet.size() < 40){
            questionSet.add(question);
        }
    }

    public void registerCandidate(Candidate candidate){
        candidates.add(candidate);
        candidate.incrementSurveyCount();
    }

    public List<Question> getQuestionSet() {
        return questionSet;
    }

    public Set<Candidate> getCandidates() {
        return candidates;
    }
}
