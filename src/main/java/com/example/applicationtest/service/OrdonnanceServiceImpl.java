package com.example.applicationtest.service;

import com.example.applicationtest.exception.ResourcesNotfoundException;
import com.example.applicationtest.model.ordonnanceModel;
import com.example.applicationtest.repository.OrdonnanceRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service

public class OrdonnanceServiceImpl implements OrdonnanceServiceInterface {
    private OrdonnanceRepository ordonnanceRepository;


    @Override
    public List<ordonnanceModel> findAllOrdonnaces() {
        return ordonnanceRepository.findAll();
    }

    @Override
    public ordonnanceModel AddOrdonnance(ordonnanceModel ordonnace) {
        return ordonnanceRepository.save(ordonnace);
    }

    @Override
    public ordonnanceModel findOrdonnanceById(Long id) {
        return ordonnanceRepository.findById(id).orElseThrow(()->new ResourcesNotfoundException("ordonnance doesn't exist with this id :"+id));
    }

    @Override
    public ordonnanceModel updateOrdonnance(Long id, ordonnanceModel ordonnaceDetails) {
        ordonnanceModel ord1=findOrdonnanceById(id);
        ord1.setTitle(ordonnaceDetails.getTitle());
        ord1.setBody(ordonnaceDetails.getBody());
        ord1.setDate(ordonnaceDetails.getDate());
        ord1.setLogo(ordonnaceDetails.getLogo());

        return  ordonnanceRepository.save(ord1);
    }

    @Override
    public Map<String, Boolean> deleteOrdonnance(Long id) {
        ordonnanceModel ord1=findOrdonnanceById(id);
        ordonnanceRepository.delete(ord1);
        Map<String,Boolean> response=new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return response;
    }

    @Override
    public Date getDateOfOrdonnace(Long id) {
        ordonnanceModel ord1=findOrdonnanceById(id);
        return  ord1.getDate();
    }

    @Override
    public String getTitleOfOrdonnace(Long id) {
        ordonnanceModel ord1=findOrdonnanceById(id);
        return  ord1.getTitle();
    }

}
