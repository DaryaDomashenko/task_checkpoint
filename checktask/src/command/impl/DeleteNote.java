package command.impl;

import bean.Request;

public class DeleteNote extends Request {

    private String deleteNote;

    public DeleteNote(){}

    public String getDeleteNote() {
        return deleteNote;
    }

    public void setDeleteNote(String deleteNote) {
        this.deleteNote = deleteNote;
    }
}

