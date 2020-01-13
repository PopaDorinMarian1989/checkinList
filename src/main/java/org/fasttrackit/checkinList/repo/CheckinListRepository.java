package org.fasttrackit.checkinList.repo;

import org.fasttrackit.checkinList.model.CheckinList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.persistence.Entity;
import java.util.List;

@Entity
public interface CheckinListRepository extends
        PagingAndSortingRepository<CheckinList, Long> {
    List<CheckinList> findByName(String name);

    @Query("select a from CheckinList a where name like ?1%")
    List<CheckinList> findCheckinListWhereNameLike(String namePart);


    CheckinList findOne(long checkinListId);
}
