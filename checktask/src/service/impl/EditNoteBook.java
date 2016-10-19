package service.impl;

import dao.DAOFactory;
import dao.NBDao;
import dao.exception.DAOException;
import service.EditNoteBookService;
import service.exception.ServiceException;

public class EditNoteBook implements EditNoteBookService {

    @Override
    public void addNote(String note) throws ServiceException {
        if (note == null || "".equals(note)){
            throw new ServiceException("message");
        }

        DAOFactory factory = DAOFactory.getInstance();
        NBDao dao = factory.getNBDao();

        try {
            dao.addNote(note, new Integer());
        } catch (DAOException e) {
            throw new ServiceException(e);
        }


    }

    @Override
    public void addNote(String note, int  ID) throws ServiceException {
        if (note == null || "".equals(note)){
            throw new ServiceException("message 1");
        }


        if (id == null){
            throw new ServiceException("message 2");
        }

        DAOFactory factory = DAOFactory.getInstance();
        NBDao dao = factory.getNBDao();

        try {
            dao.addNote(note, id);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

    }

    @Override
    public void deleteNote(String note) throws ServiceException {
        // TODO Auto-generated method stub

    }

}