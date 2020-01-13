package org.fasttrackit.checkinList.service;

import org.fasttrackit.checkinList.dto.CheckinListDTO;
import org.fasttrackit.checkinList.model.CheckinList;
import org.fasttrackit.checkinList.repo.CheckinListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CheckinListService {
    @Autowired
    private CheckinListRepository checkinListRepository;

    @Transactional
    public List<CheckinListDTO> getallCheckinLists() {
        List<CheckinListDTO> result = new ArrayList<>();
        Iterator<CheckinList> iterator = checkinListRepository.findAll().iterator();
        while (iterator.hasNext()) {
            CheckinList next = iterator.next();
            result.add(ConvertorUtils.convertToDto(next));
        }
        return result;
    }




    @Transactional
    public CheckinListDTO getCheckinList(long id) {
        CheckinList one = checkinListRepository.findOne(id);
        if (one == null) {
            throw new IllegalArgumentException("Invalid id");
        }
        CheckinListDTO dto = ConvertorUtils.convertToDto(one);
        return dto;
    }

}
