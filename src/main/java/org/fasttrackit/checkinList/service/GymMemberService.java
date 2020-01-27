package org.fasttrackit.checkinList.service;

import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.exception.ResourceNotFoundException;
import org.fasttrackit.checkinList.model.GymMember;
import org.fasttrackit.checkinList.repo.GymMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class GymMemberService {


    private final GymMemberRepository gymMemberRepository;

    @Autowired
    public GymMemberService(GymMemberRepository gymMemberRepository) {
        this.gymMemberRepository = gymMemberRepository;
    }


    public GymMember create(GymMemberDTO gymMemberDTO) {

        GymMember one = new GymMember();
        one.setGymMembernumber(gymMemberDTO.getGymMemberNumber());
        one.setLastName(gymMemberDTO.getLastName());
        one.setFirstName(gymMemberDTO.getFirstName());
        one.setChecked(false);
        gymMemberRepository.save(one);
        return one;

    }

    public void delete(long id) {
        gymMemberRepository.deleteById(id);
    }

    public List<GymMember> getGymMember() {
        Iterator<GymMember> gymMembersIterator = gymMemberRepository.findAll().iterator();
        List<GymMember> gymMembers = new ArrayList<>();
        while (gymMembersIterator.hasNext()) {
            GymMember gymMember = gymMembersIterator.next();
            gymMember.setGymMembernumber(gymMember.getGymMembernumber());
            gymMember.setFirstName(gymMember.getFirstName());
            gymMember.setLastName(gymMember.getLastName());
            gymMember.setChecked(gymMember.isChecked());

            gymMembers.add(gymMember);
        }
        return gymMembers;
    }

    public GymMember updateGymMember(Long id, GymMemberDTO request) {
        GymMember gymMember = gymMemberRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Member" + id + "does not exist"));
        gymMember.setChecked(request.isChecked());
        gymMemberRepository.save(gymMember);
        return gymMember;
    }
}

