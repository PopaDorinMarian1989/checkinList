package org.fasttrackit.checkinList.service;

import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.model.CheckinList;
import org.fasttrackit.checkinList.model.GymMember;
import org.fasttrackit.checkinList.repo.CheckinListRepository;
import org.fasttrackit.checkinList.repo.GymMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GymMemberService {


        @Autowired
        private CheckinListRepository checkinListRepository;
        @Autowired
        private GymMemberRepository gymMemberRepository;

        @Transactional
        public void update(GymMemberDTO gymMemberDTO) {
            GymMember one = gymMemberRepository.findById(gymMemberDTO.getId());
            if (one == null) {
                throw new IllegalArgumentException("Invalid id");

            }
            one.setGymMembernumber(gymMemberDTO.getGymMemberNumber());
            one.setLastName(gymMemberDTO.getLastName());
            one.setFirstName(gymMemberDTO.getFirstName());
            gymMemberRepository.save(one);

        }

        @Transactional
        public void create(GymMemberDTO gymMemberDTO, long checkinListId) {

            GymMember one = new GymMember();
            one.setGymMembernumber(gymMemberDTO.getGymMemberNumber());
            one.setLastName(gymMemberDTO.getLastName());
            one.setFirstName(gymMemberDTO.getFirstName());

            CheckinList checkinList = checkinListRepository.findById(checkinListId);
            checkinList.getGymMembers().add(one);
            checkinListRepository.save(checkinList);
        }

        public void delete (long gymMemberId){
            gymMemberRepository.deleteById(gymMemberId);

        }
    }

