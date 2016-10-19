package service.factory;

import service.EditNoteBookService;
import service.SearchNotebookService;
import service.exception.ServiceException;
import service.impl.SearchNoteBook;

/**
 * Created by Dasha on 19.10.2016.
 */


public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private EditNoteBookService editNoteBookService = new EditNoteBookService() {
        @Override
        public void addNote(String note) throws ServiceException {

        }

        @Override
        public void addNote(String note, int ID) throws ServiceException {

        }

        @Override
        public void deleteNote(String note) throws ServiceException {

        }
    };
    //	private EditNoteBookService editNoteBookService = new EditNDNew();
    private SearchNotebookService searchNotebookService = (SearchNotebookService) new SearchNoteBook();

    private ServiceFactory(){}


    public static ServiceFactory getInstance(){
        return instance;
    }

    public EditNoteBookService getEditNoteBookService(){
        return editNoteBookService;
    }

    public SearchNotebookService getSearchNoteBookService(){
        return searchNotebookService;
    }

}
