package controller;

import command.Command;
import command.impl.AddNewNote;
import command.impl.DeleteNote;
import command.impl.ReturnNotes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dasha on 19.10.2016.
 */
class CommandProvider {
    private Map<String, Command> commands = new HashMap<String, Command>();

    CommandProvider() {
        commands.put("ADD_NEW_NOTE", new AddNewNote());
        commands.put("RETURN_ALL_NOTES", new ReturnNotes());
        commands.put("DELETE_NOTE", (Command) new DeleteNote());
    }


    public Command getCommand(String commandName){
        Command command;
        command = commands.get(commandName);
        return command;
    }

}