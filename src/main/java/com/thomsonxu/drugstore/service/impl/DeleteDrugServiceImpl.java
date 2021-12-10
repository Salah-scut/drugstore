package com.thomsonxu.drugstore.service.impl;

import com.thomsonxu.drugstore.entity.Drug;
import com.thomsonxu.drugstore.service.DeleteDrugService;
import com.thomsonxu.drugstore.util.DBconnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeleteDrugServiceImpl implements DeleteDrugService {
    @Override
    public void deleteDrugService(String drug_id) {
        List<Drug> list = new ArrayList<>();
        try {
            DBconnection.init();
            DBconnection.deleteDrug(drug_id);
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        DBconnection.closeConnection();
    }
}
