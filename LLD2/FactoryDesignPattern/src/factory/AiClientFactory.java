package factory;

import chatClients.AiChatClient;
import vectorClient.AiVectorClient;

public interface AiClientFactory {

    AiChatClient getAiChatClient();
    AiVectorClient getAiVectorClient();
}
