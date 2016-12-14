package model.business;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface Business<Pojo> {
    public Pojo createFromResultSet(ResultSet resultset) throws SQLException;
    public Pojo getById(String id) throws SQLException;
    public ArrayList<Pojo> getBySearch(String searchText) throws SQLException;
    public ArrayList<Pojo> getAll() throws SQLException;
    public int add(Pojo pojo) throws SQLException;
    public int update(Pojo pojo) throws SQLException;
    public int delete(Pojo pojo) throws SQLException;
    public int numberOf() throws SQLException;
    public ArrayList<String> getColumns() throws SQLException;
}
