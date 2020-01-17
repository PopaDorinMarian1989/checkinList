package org.fasttrackit.checkinList.repo;

import org.fasttrackit.checkinList.model.GymMember;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GymMemberRepository extends
        PagingAndSortingRepository<GymMember, Long> {
    void deleteById(long gymMemberId);

    GymMember findById(long id);
}
