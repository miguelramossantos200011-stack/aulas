import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Bot extends ListenerAdapter {

    public static void main(String[] args) throws Exception {
        String token = "SEU_TOKEN_AQUI";

        JDABuilder.createDefault(token)
                .addEventListeners(new Bot())
                .build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        if (event.getMessage().getContentRaw().equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("Pong!").queue();
        }
    }
}