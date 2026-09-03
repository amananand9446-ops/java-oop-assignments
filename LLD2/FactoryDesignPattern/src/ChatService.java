import chatClients.AiChatClient;
import factory.AiClientFactory;
import factory.ClientFactoryProvider;
import vectorClient.AiVectorClient;

import java.util.List;

public class ChatService {
private AiChatClient aiChatClient;
private AiVectorClient aiVectorClient;
private List<String> providers;
private AiClientFactory aiClientFactory;

public  ChatService() {
    this.providers = List.of("anrhropic", "openai");
    for (String provider : providers) {
        try {
            aiClientFactory = ClientFactoryProvider.getAiClientFactory(provider);
            this.aiChatClient = aiClientFactory.getAiChatClient();
            this.aiVectorClient = aiClientFactory.getAiVectorClient();
        } catch (Exception e) {
            System.out.println("None of the providers is available");
        }
    }
    if (aiClientFactory == null) {
        throw new RuntimeException("None of the providers is availabe");
    }
}
    public void chat(String prompt){
        aiChatClient.chat(prompt);
    }
}

