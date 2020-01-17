package org.fasttrackit.checkinList.service;

import org.fasttrackit.checkinList.dto.CheckinListDTO;
import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.model.CheckinList;
import org.fasttrackit.checkinList.model.GymMember;
import org.fasttrackit.checkinList.repo.CheckinListRepository;
import org.fasttrackit.checkinList.repo.GymMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class ConvertorUtils {
    public static CheckinListDTO convertToDto(CheckinList one) {
        CheckinListDTO dto = new CheckinListDTO();
        dto.setId(one.getId());
        dto.setName(one.getName());
        List<GymMemberDTO> gymMemberDTOS = new ArrayList<>();
        for (Object gymMember : one.getGymMembers()) {
            GymMemberDTO gymMemberDTO = convertToDto((GymMember) gymMember);
            gymMemberDTOS.add(gymMemberDTO);
        }

        dto.setGymMembers(gymMemberDTOS);
        return dto;
    }

    public static GymMemberDTO convertToDto(GymMember gymMember) {
        GymMemberDTO gymMemberDTO = new GymMemberDTO();
        gymMemberDTO.setFirstName(gymMember.getFirstName());
        gymMemberDTO.setLastName(gymMember.getLastName());
        gymMemberDTO.setgymMemberNumber(gymMember.getGymMembernumber());
        gymMemberDTO.setId(gymMember.getId());
        return gymMemberDTO;
    }

    @Service
    public static class GymMemberService {

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
}
