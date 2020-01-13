package org.fasttrackit.checkinList.web;

import antlr.ASTFactory;
import com.sun.java.swing.plaf.windows.WindowsPopupWindow;
import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.model.GymMember;
import org.fasttrackit.checkinList.service.CheckinListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GymMemberController {

    private final CheckinListService checkinListService;

    @Autowired
    public GymMemberController(CheckinListService checkinListService) {
        this.checkinListService = checkinListService;
    }

    @GetMapping
    public List<GymMemberDTO> getGymMembersByCheckinLists(@PathVariable long checkinListId) {

        return checkinListService.getCheckinList(checkinListId).getGymMembers();
    }

    //@RequestMapping(path = "/check-in-list/{checkinListId}/gmMember", method = RequestMethod.GET)
    // @ResponseBody
    //public List<GymMemberDTO> getGymMembersByCheckinLists(@PathVariable long checkinListId) {

    //   return checkinListService.getCheckinList(checkinListId).getGymMembers();
    // }

    @PutMapping
    public GymMemberDTO editPassport(@PathVariable long checkinListId, @PathVariable long gymMmemberId,
                                     @RequestBody GymMemberDTO request) {
        request.setId(gymMmemberId);
        GymMember gymMmember = new GymMember();
        gymMmember.update(request);
        return request;}
        // @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember/{gymMemberId}", method = RequestMethod.PUT)
        // @ResponseBody
        //  public GymMemberDTO editPassport(@PathVariable long checkinListId, @PathVariable long gymMmemberId,
        //                              @RequestBody GymMemberDTO request) {
        //  request.setId(gymMmemberId);
        //  gymMmember.update(request);
        //  return request;
        // }
@PostMapping
public <GymMemberService> GymMemberDTO saveGymMember (@PathVariable long checkinListId,
                                                      @RequestBody GymMemberDTO request){


    GymMemberService gymMemberService = new GymMemberService();
    gymMemberService.create(request, checkinListId);
      return request;
}

       // @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember", method = RequestMethod.POST)
       // @ResponseBody
       // public GymMemberDTO saveGymMember ( @PathVariable long checkinListId,
       // @RequestBody GymMemberDTO request){

        //    gymMemberService.create(request, checkinListId);
        //    return request;
      //  }

@DeleteMapping

     //   @RequestMapping(path = "/check-in-list/gymMmember/{gymMmeberId}", method = RequestMethod.DELETE)

        //public void deleteGymMmember ( @PathVariable long gymMmemberId){

          //  gymMemberService.delete(gymMmemberId);

        }
    }

