package chatClients;


public class OpenAiChatClient implements AiChatClient {
@Override
public void chat(String prompt) {
    System.out.println("Chat from Open AI");
}
}
