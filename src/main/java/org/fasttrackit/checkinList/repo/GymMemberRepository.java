package org.fasttrackit.checkinList.repo;

import org.fasttrackit.checkinList.model.GymMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymMemberRepository extends JpaRepository<GymMember, Long> {

}
