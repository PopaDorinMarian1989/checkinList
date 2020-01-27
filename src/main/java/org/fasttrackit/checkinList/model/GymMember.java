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
    private long gymMemberNumber;
    private boolean isChecked;

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

    public long getGymMemberNumber() {
        return gymMemberNumber;
    }

    public void setGymMemberNumber(long gymMemberNumber) {
        this.gymMemberNumber = gymMemberNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return "GymMember{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gymMemberNumber=" + gymMemberNumber +
                ", isChecked=" + isChecked +
                '}';
    }
}