package dao;

/**
 * Created by Dasha on 19.10.2016.
 */
public class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();

    private NBDao nbDao = new NBDao();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return INSTANCE;
    }

    public NBDao getNBDao(){
        return nbDao;
    }

}
