package org.fasttrackit.checkinList.dto;

import javax.persistence.GeneratedValue;

public class GymMemberDTO {
    private String firstName;
    private String lastName;
    private boolean isChecked;
    private Long gymMemberNumber;

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

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Long getGymMemberNumber() {
        return gymMemberNumber;
    }

    public void setGymMemberNumber(Long gymMemberNumber) {
        this.gymMemberNumber = gymMemberNumber;
    }

    @Override
    public String toString() {
        return "GymMemberDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isChecked=" + isChecked +
                ", gymMemberNumber=" + gymMemberNumber +
                '}';
    }
}
