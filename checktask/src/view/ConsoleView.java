package view;

import bean.AddNote;
import bean.DeleteNote;
import bean.Request;
import bean.Response;
import bean.entity.Note;
import controller.Controller;

import java.util.List;

/**
 * Created by Dasha on 19.10.2016.
 */
public class ConsoleView {
    public static void main(String[] args) {
        Controller controller = new Controller();

        //////////////////////////////////////////////////////////////
        // add new note
        AddNote addNewNoteReq = new AddNote();
        addNewNoteReq.setCommandName("ADD_NEW_product");
        addNewNoteReq.setNote("my first product");
        //addNewNoteReq.setId(new Integer());

        Response response = controller.doAction(addNewNoteReq);

        if (!response.isErrorStatus()) {
            System.out.println(response.getSimpleMessage());
        } else {
            System.out.println(response.getErrorMessage());
        }

        /////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        // add new note
        addNewNoteReq = new AddNote();
        addNewNoteReq.setCommandName("ADD_NEW_product");
        addNewNoteReq.setNote("my second product");
       //addNewNoteReq.setId(new Integer());

        response = controller.doAction(addNewNoteReq);

        if (!response.isErrorStatus()) {
            System.out.println(response.getSimpleMessage());
        } else {
            System.out.println(response.getErrorMessage());
        }

        /////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        // add new note
        Request request = new Request();
        request.setCommandName("RETURN_ALL_products");

        response = controller.doAction(request);

        if (!response.isErrorStatus()) {
            List<Note> notes = response.getNotes();

            for (Note note : notes) {
                System.out.println(note.getNote() + ", " + note.getId());
            }

        } else {
            System.out.println(response.getErrorMessage());
        }

        /////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        // delete note
        DeleteNote deleteRequest = new DeleteNote();
        deleteRequest.setCommandName("DELETE_product");
        deleteRequest.setDeleteNote("my second product");

        response = controller.doAction(deleteRequest);

        if (!response.isErrorStatus()) {
            System.out.println(response.getSimpleMessage());
        } else {
            System.out.println(response.getErrorMessage());
        }
        /////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        // add new note
        request = new Request();
        request.setCommandName("RETURN_ALL_products");

        response = controller.doAction(request);


    }
}
