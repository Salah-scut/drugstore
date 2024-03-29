package com.thomsonxu.drugstore.service.impl;

import com.thomsonxu.drugstore.entity.Drug;
import com.thomsonxu.drugstore.service.ShowDrugService;
import com.thomsonxu.drugstore.util.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowDrugServiceImpl implements ShowDrugService {

    @Override
    public List<Drug> showDrugservice() {
        List<Drug> list = new ArrayList<>();
        try {
            DBconnection.init();
            ResultSet resultSet = DBconnection.selectAllDrugs();
            while (resultSet.next())
                list.add(new Drug(resultSet.getString("drug_id"),
                        resultSet.getString("drug_name"),
                        resultSet.getString("manufacturer"),
                        resultSet.getDouble("price")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DBconnection.closeConnection();
        return list;
    }

    @Override
    public List<Drug> selectDrugservice(String info,int info_type) {
        List<Drug> list = new ArrayList<>();
        try {
            DBconnection.init();
            ResultSet resultSet = null;
            resultSet = DBconnection.selectDrugs(info,info_type);
            while (resultSet.next())
                list.add(new Drug(resultSet.getString( "drug_id"),
                        resultSet.getString("drug_name"),
                        resultSet.getString("manufacturer"),
                        resultSet.getDouble("price")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        DBconnection.closeConnection();
        return list;
    }
}
