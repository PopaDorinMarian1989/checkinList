package org.fasttrackit.checkinList;

import org.fasttrackit.checkinList.model.CheckinList;
import org.fasttrackit.checkinList.model.Passport;
import org.fasttrackit.checkinList.repo.CheckinListRepository;
import org.fasttrackit.checkinList.service.CheckinListService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextLoader;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CheckinListRepoTest.CheckinlistApplication.class,
        loader = CheckinListRepoTest.SpringApplicationContextLoader.class,
        initializers = ConfigFileApplicationContextInitializer.class)

public class CheckinListRepoTest {
    @Autowired
    private CheckinListRepository repository;

    @Autowired
    private CheckinListService service;

    @Test
    public void testSave() {

        CheckinList checkinList = getCheckinList("checkinList0","firtsname", "ln","0000");
        repository.save(checkinList);


        CheckinList checkinList2 = getCheckinList("checkinList1","Ala", "bala","11111");
        repository.save(checkinList2);




    }





    @Test
    public void testFindByName() {

        List<CheckinList> checkinList1List = repository.findByName("checkinList1");
        System.out.println(checkinList1List.size());

        System.out.println("-----------------------REZULTAT TEST");
        System.out.println(checkinList1List.get(0));


        List<CheckinList> checkinListLikeList = repository.findCheckinListWhereNameLike("agenda");
        System.out.println(checkinListLikeList.size());

        System.out.println("-----------------------REZULTAT TEST LIKE");

        for(CheckinList checkinList : checkinListLikeList) {
            System.out.println(checkinList);
        }

    }



    private CheckinList getCheckinList(String checkinListName, String firtsname, String lastName, String passportNumber) {
        CheckinList checkinList = new CheckinList();
        checkinList.setName(checkinListName);
        List<Passport> passports = new ArrayList<>();
        Passport passport = new Passport();
        passport.setFirstName(firtsname);
        passport.setLastName(lastName);
        passport.setPassportnumber(passportNumber);
        passports.add(passport);
        checkinList.setPassports(passports);
        return checkinList;
    }

    class SpringApplicationContextLoader implements ContextLoader {
        @Override
        public String[] processLocations(Class<?> aClass, String... strings) {
            return new String[0];
        }

        @Override
        public ApplicationContext loadContext(String... strings) throws Exception {
            return null;
        }
    }

    class CheckinlistApplication {
    }
}
