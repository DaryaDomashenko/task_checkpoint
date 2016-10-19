package service;

import bean.entity.Note;
import service.exception.ServiceException;

import java.util.List;

/**
 * Created by Dasha on 19.10.2016.
 */
public interface SearchNotebookService {
    List<Note> findNoteByDate(Integer id) throws ServiceException;
    List<Note> findAllNotes() throws ServiceException;
}
