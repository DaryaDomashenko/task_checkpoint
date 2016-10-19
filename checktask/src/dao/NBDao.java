package dao;

import bean.entity.Note;
import dao.exception.DAOException;

/**
 * Created by Dasha on 19.10.2016.
 */
public interface NBDao {
    void addNote(String message, int ID) throws DAOException;
    Note findNote(String text) throws DAOException;
}
