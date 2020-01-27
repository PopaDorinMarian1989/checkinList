package org.fasttrackit.checkinList.web;

import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.model.GymMember;
import org.fasttrackit.checkinList.service.GymMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gymMember")
public class GymMemberController {


    private final GymMemberService gymMemberService;

    @Autowired
    public GymMemberController(GymMemberService gymMemberService) {
        this.gymMemberService = gymMemberService;
    }

    @PostMapping
    public ResponseEntity<GymMember> createGymMember(@RequestBody @Valid GymMemberDTO request) {
        GymMember gymMember = gymMemberService.create(request);
        return new ResponseEntity<>(gymMember, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<GymMember>> getGymMember() {
        List<GymMember> gymMember = gymMemberService.getGymMember();
        return new ResponseEntity<>(gymMember, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GymMember> updateGymMember(@PathVariable Long id, @RequestBody @Valid GymMemberDTO request) {
        GymMember gymMember = gymMemberService.updateGymMember(id, request);
        return new ResponseEntity<>(gymMember, HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteGymMember(@PathVariable Long id) {
        gymMemberService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}