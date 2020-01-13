package org.fasttrackit.checkinList.repo;

import org.fasttrackit.checkinList.model.Passport;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PassportRepository  extends
        PagingAndSortingRepository<Passport, Long> {
    void delete(long passportId);

    Passport findOne(long id);
}
