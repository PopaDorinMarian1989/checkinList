package org.fasttrackit.checkinList.dto;

import java.util.ArrayList;
import java.util.List;

public class CheckinListDTO {
    private Long id;

    private String name;

    private List<GymMemberDTO> gymMembers = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GymMemberDTO> getGymMembers() {
        return gymMembers;
    }

    public void setGymMembers(List<GymMemberDTO> gymMembers) {
        this.gymMembers = gymMembers;
    }

    @Override
    public String toString() {
        String sb = "CheckinListDTO{" + "id=" + id +
                ", name='" + name + '\'' +
                ", gymMembers=" + gymMembers +
                '}';
        return sb;
    }
}
