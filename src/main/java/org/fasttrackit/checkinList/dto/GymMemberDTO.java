package org.fasttrackit.checkinList.dto;

public class GymMemberDTO {
    private String firstName;
    private String lastName;
    private String gymMemberNumber;
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

    public String getGymMemberNumber() {
        return gymMemberNumber;
    }

    public void setGymMemberNumber(String gymMemberNumber) {
        this.gymMemberNumber = gymMemberNumber;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public String toString() {
        return "GymMemberDTO{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gymMemberNumber='" + gymMemberNumber + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }
}
