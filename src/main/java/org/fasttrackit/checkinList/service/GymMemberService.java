package org.fasttrackit.checkinList.service;

import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.model.GymMember;
import org.fasttrackit.checkinList.repo.GymMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GymMemberService {


    @Autowired
    private GymMemberRepository gymMemberRepository;


    public GymMember create(GymMemberDTO gymMemberDTO) {

        GymMember one = new GymMember();
        one.setGymMembernumber(gymMemberDTO.getGymMemberNumber());
        one.setLastName(gymMemberDTO.getLastName());
        one.setFirstName(gymMemberDTO.getFirstName());
        return gymMemberRepository.save(one);

    }

    public void delete(long gymMemberId) {
        gymMemberRepository.deleteById(gymMemberId);

    }
}

