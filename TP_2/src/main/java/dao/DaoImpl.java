package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        // TODO Auto-generated method stub
        System.out.println("From SQL DB");
        return(7);
    }
}
