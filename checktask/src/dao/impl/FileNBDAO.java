package dao.impl;


import bean.entity.Note;
import dao.NBDao;
import dao.exception.DAOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNBDAO implements NBDao {
    private static final String SOURCE = "resource/notes.txt";

    @Override
    public void addNote(String message, int id) throws DAOException {
        // TODO Auto-generated method stub
        // RandomAccessFile

    }

    @Override
    public void addNote(String message, int id) throws DAOException {

    }

    @Override
    public Note findNote(String text) throws DAOException {

        FileReader reader = null;
        BufferedReader br = null;

        try {
            reader = new FileReader(SOURCE);
            br = new BufferedReader(reader);
            String noteFromFile;

            noteFromFile = br.readLine();
            while (noteFromFile != null) {

            }

        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e) {
            throw new DAOException(e);
        } finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {/* logging */	}
            }
        }

        return null;
    }

}
