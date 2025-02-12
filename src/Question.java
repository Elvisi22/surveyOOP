import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Question {
    private String text;
    private Map<Candidate, Alternativa> response;

    public Question(String text) {
        this.text = text;
        this.response = new HashMap<>();
    }

    public void saveAnswer(Candidate candidate , Alternativa alternativa){
        response.put(candidate , alternativa);
    }

    public Map<Candidate, Alternativa> getResponse() {
        return response;
    }

    public int getResponseCount(){
       return response.size();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                '}';
    }
}
