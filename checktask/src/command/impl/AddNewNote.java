package command.impl;

import bean.AddNote;
import bean.Request;
import bean.Response;
import command.Command;
import service.EditNoteBookService;
import service.exception.ServiceException;
import service.factory.ServiceFactory;

public class AddNewNote implements Command {

    @Override
    public Response execute(Request request) {



        AddNote addNote = null;
        if(request instanceof AddNote){
            addNote = (AddNote)request;
        }

        int id;
        String name_product;
        String category;
        int amount;
        double price;


        id = addNote.getID();
        name_product = addNote.getNameProduct();
        category=addNote.getCategory();
        amount=addNote.getAmount();

        ServiceFactory factory = ServiceFactory.getInstance();
        EditNoteBookService editService = factory.getEditNoteBookService();

        Response response= new Response();
        try {
            editService.addNote(id, name_product, category, amount, price);
            response.setErrorStatus(false);
            response.setSimpleMessage("Note was added");
        } catch (ServiceException e) {
            response.setErrorStatus(true);
            response.setErrorMessage("Note wasn't added");
        }

        return response;
    }

    public Response execute(Request request) {
        // TODO Auto-generated method stub
        return null;
    }

}