package org.fasttrackit.checkinList.service;

import org.fasttrackit.checkinList.dto.CheckinListDTO;
import org.fasttrackit.checkinList.dto.PassportDTO;
import org.fasttrackit.checkinList.model.CheckinList;
import org.fasttrackit.checkinList.model.Passport;
import org.fasttrackit.checkinList.repo.CheckinListRepository;
import org.fasttrackit.checkinList.repo.PassportRepository;
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
        List<PassportDTO> passportDTOS = new ArrayList<>();
        for (Passport passport : one.getPassports()) {
            PassportDTO passportDTO = convertToDto(passport);
            passportDTOS.add(passportDTO);
        }

        dto.setPassports(passportDTOS);
        return dto;
    }

    public static PassportDTO convertToDto(Passport passport) {
        PassportDTO passportDTO = new PassportDTO();
        passportDTO.setFirstName(passport.getFirstName());
        passportDTO.setLastName(passport.getLastName());
        passportDTO.setPassportNumber(passport.getPassportnumber());
        passportDTO.setId(passport.getId());
        return passportDTO;
    }

    @Service
    public static class PassportService {

        @Autowired
        private CheckinListRepository checkinListRepository;
        @Autowired
        private PassportRepository passportRepository;

        @Transactional
        public void update(PassportDTO passportDTO) {
            Passport one = passportRepository.findOne(passportDTO.getId());
            if (one == null) {
                throw new IllegalArgumentException("Invalid id");

            }
            one.setPassportnumber(passportDTO.getPassportNumber());
            one.setLastName(passportDTO.getLastName());
            one.setFirstName(passportDTO.getFirstName());
            passportRepository.save(one);

        }

        @Transactional
        public void create(PassportDTO passportDTO, long checkinListId) {

            Passport one = new Passport();
            one.setPassportnumber(passportDTO.getPassportNumber());
            one.setLastName(passportDTO.getLastName());
            one.setFirstName(passportDTO.getFirstName());

            CheckinList checkinList = checkinListRepository.findOne(checkinListId);
            checkinList.getPassports().add(one);
            checkinListRepository.save(checkinList);
        }

        public void delete (long passportId){
            passportRepository.delete(passportId);

        }
    }
}
