package service;

import service.exception.ServiceException;

public interface EditNoteBookService {

    void addNote(String note) throws ServiceException;
    void addNote(String note, int ID) throws ServiceException;
    void deleteNote(String note) throws ServiceException;

}
