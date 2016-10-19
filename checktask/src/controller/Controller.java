package controller;

import bean.Request;
import bean.Response;
import command.Command;

/**
 * Created by Dasha on 19.10.2016.
 */
public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public Response doAction(Request request) {
        String commandName = request.getCommandName();

        Command command = provider.getCommand(commandName);

        Response response = command.execute(request);

        return response;

    }

}