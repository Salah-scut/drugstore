package com.thomsonxu.drugstore.service;

import com.thomsonxu.drugstore.entity.Drug;
import com.thomsonxu.drugstore.entity.Employee;

import java.util.List;

public interface ShowDrugService {
    public List<Drug> showDrugservice();
    public List<Drug> selectDrugservice(String info,int info_type);
}
