package com.autumncode.annaexample;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;

public class App extends ListenerAdapter {
    @Override
    public void onGenericMessage(GenericMessageEvent event) {
        //When someone says ?helloworld respond with "Hello World"
        if (event.getMessage().startsWith("?helloworld"))
            event.respond("Hello world!");
    }

    public static void main(String[] args) throws Exception {
        //Configure what we want our bot to do
        Configuration configuration = new Configuration.Builder()
                .setName("PircBotXUse99") //Set the nick of the bot. CHANGE IN YOUR CODE
                .addServer("irc.freenode.net") //Join the freenode network
                .addAutoJoinChannel("#pircbotx") //Join the official #pircbotx channel
                .addListener(new App()) //Add our listener that will be called on Events
                .buildConfiguration();

        //Create our bot with the configuration
        PircBotX bot = new PircBotX(configuration);
        //Connect to the server
        bot.startBot();
    }
}
