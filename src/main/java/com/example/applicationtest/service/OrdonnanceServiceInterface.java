package com.example.applicationtest.service;

import com.example.applicationtest.model.ordonnanceModel;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface OrdonnanceServiceInterface {

    public List<ordonnanceModel> findAllOrdonnaces();
    public ordonnanceModel AddOrdonnance( ordonnanceModel ordonnace);
    public ordonnanceModel findOrdonnanceById( Long id);
    public ordonnanceModel updateOrdonnance(Long id,  ordonnanceModel ordonnaceDetails);
    public Map<String,Boolean> deleteOrdonnance(Long id);
    public Date getDateOfOrdonnace(Long id);
    public String getTitleOfOrdonnace(Long id);

}
