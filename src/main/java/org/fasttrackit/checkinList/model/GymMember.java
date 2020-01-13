package org.fasttrackit.checkinList.model;


import org.fasttrackit.checkinList.dto.GymMemberDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GymMember {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String gymMembernumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGymMembernumber() {
        return gymMembernumber;
    }

    public void setGymMembernumber(String gymMembernumber) {
        this.gymMembernumber = gymMembernumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void update(GymMemberDTO request) {

    }
}