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
        final StringBuilder sb = new StringBuilder("CheckinListDTO{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", gymMembers=").append(gymMembers);
        sb.append('}');
        return sb.toString();
    }
}
