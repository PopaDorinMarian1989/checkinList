package org.fasttrackit.checkinList;

import org.fasttrackit.checkinList.model.GymMember;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = CheckinListRepoTest.CheckinlistApplication.class,
      //  loader = CheckinListRepoTest.SpringApplicationContextLoader.class,
     //   initializers = ConfigFileApplicationContextInitializer.class)

public class CheckinListRepoTest {}
//    @Autowired
//    private CheckinListRepository repository;
//
//    @Autowired
//    private CheckinListService service;
//
//
//    @Test
//    public void testSave() {
//
//        CheckinList checkinList = getCheckinList("checkinList1", "firtsname", "ln", "0");
//        repository.save(checkinList);
//
//
//        CheckinList checkinList2 = getCheckinList("checkinList2", "Popa", "Dorin", "1");
//        repository.save(checkinList2);
//
//
//    }
//
//
//    @Test
//    public void testFindByName() {
//
//        List<CheckinList> checkinList1List = repository.findByName("checkinList1");
//        System.out.println(checkinList1List.size());
//
//        System.out.println("-----------------------REZULTAT TEST");
//        System.out.println(checkinList1List.get(0));
//
//
//        List<CheckinList> checkinListLikeList = repository.findByNameContaining("agenda");
//        System.out.println(checkinListLikeList.size());
//
//        System.out.println("-----------------------REZULTAT TEST LIKE");
//
//        for (CheckinList checkinList : checkinListLikeList) {
//            System.out.println(checkinList);
//        }
//
//    }
//
//
//    private CheckinList getCheckinList(String checkinListName, String firtsname, String lastName, String gymMemberNumber) {
//        CheckinList checkinList = new CheckinList();
//        checkinList.setName(checkinListName);
//        List<GymMember> gymMembers = new ArrayList<>();
//        GymMember gymMember = new GymMember();
//        gymMember.setFirstName(firtsname);
//        gymMember.setLastName(lastName);
//        gymMember.setGymMembernumber(gymMemberNumber);
//        gymMembers.add(gymMember);
//        checkinList.setGymMembers(gymMembers);
//        return checkinList;
//    }
//
//    public CheckinListService getService() {
//        return service;
//    }
//
//    public void setService(CheckinListService service) {
//        this.service = service;
//    }
//
//    //  static class SpringApplicationContextLoader implements ContextLoader {
//     //   @Override
//      //  public String[] processLocations(Class<?> aClass, String... strings) {
//       //     return new String[0];
//       // }
//
//       // @Override
//      //  public ApplicationContext loadContext(String... strings) throws Exception {
//        //    return null;
//      //  }
//  //  }
//
//   // class CheckinlistApplication {
//    }
//
