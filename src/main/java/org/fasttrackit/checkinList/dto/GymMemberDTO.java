package org.fasttrackit.checkinList.dto;

public class GymMemberDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String gymMemberNumber;

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

    public String getGymMemberNumber() {
        return gymMemberNumber;
    }

    public void setGymMemberNumber(String gymMemberNumber) {
        this.gymMemberNumber = gymMemberNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setgymMemberNumber(String gymMembernumber) {

    }
}
