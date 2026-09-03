package vectorClient;

public class OpenAiVectorClient implements AiVectorClient{
    @Override
    public void embedd(String prompt) {
        System.out.println("Vector embedding is from openAI");
    }
}
