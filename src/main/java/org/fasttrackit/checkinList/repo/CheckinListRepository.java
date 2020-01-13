package org.fasttrackit.checkinList.repo;

import org.fasttrackit.checkinList.model.CheckinList;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CheckinListRepository extends
        PagingAndSortingRepository<CheckinList, Long> {
    List<CheckinList> findByName(String name);

//    @Query("select a from CheckinList a where name like ?1%")
//    List<CheckinList> findCheckinListWhereNameLike(String namePart);
    List<CheckinList> findByNameContaining(String name);


    CheckinList findOne(long checkinListId);

    List<CheckinList> findCheckinListWhereNameLike(String agenda);
}
