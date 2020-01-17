package org.fasttrackit.checkinList.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CheckinList {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<GymMember> gymMembers = new ArrayList<>();

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

    public List<GymMember> getGymMembers() {
        return gymMembers;
    }

    public void setGymMembers(List<GymMember> gymMembers) {
        this.gymMembers = gymMembers;
    }

    @Override
    public String toString() {
        String sb = "CheckinList{" + "id=" + id +
                ", name='" + name + '\'' +
                '}';
        return sb;
    }
}
