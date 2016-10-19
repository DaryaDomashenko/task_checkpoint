package command.impl;

import bean.Request;
import bean.Response;
import bean.entity.Note;
import command.Command;
import service.SearchNotebookService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

import java.util.List;

public class ReturnNotes implements Command {

    @Override
    public Response execute(Request request) {

        ServiceFactory factory = ServiceFactory.getInstance();
        SearchNotebookService searchService = factory.getSearchNoteBookService();

        List<Note> notes;
        Response response= new Response();
        try {

            notes = searchService.findAllNotes();
            response.setErrorStatus(false);
            response.setNotes(notes);

        } catch (ServiceException e) {

            response.setErrorStatus(true);
            response.setErrorMessage("error message");

        }

        return response;

    }

    public Response execute(Request request) {
        // TODO Auto-generated method stub
        return null;
    }

}