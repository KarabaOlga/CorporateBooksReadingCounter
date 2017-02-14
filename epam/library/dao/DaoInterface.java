package com.epam.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DaoInterface {
public ResultSet  dbconnection(String query) throws SQLException;

}