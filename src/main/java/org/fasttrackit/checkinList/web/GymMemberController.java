package org.fasttrackit.checkinList.web;

import org.fasttrackit.checkinList.dto.GymMemberDTO;
import org.fasttrackit.checkinList.service.CheckinListService;
import org.fasttrackit.checkinList.service.ConvertorUtils;
import org.fasttrackit.checkinList.service.GymMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GymMemberController {

    // private final CheckinListService checkinListService;

    /// @Autowired
    //  public GymMemberController(CheckinListService checkinListService) {
    //    this.checkinListService = checkinListService;
    // }

    // @GetMapping
    //  public List<GymMemberDTO> getGymMembersByCheckinLists(@PathVariable long checkinListId) {

    //    return checkinListService.getCheckinList(checkinListId).getGymMembers();
    //  }

    //@RequestMapping(path = "/check-in-list/{checkinListId}/gmMember", method = RequestMethod.GET)
    // @ResponseBody
    //public List<GymMemberDTO> getGymMembersByCheckinLists(@PathVariable long checkinListId) {

    //   return checkinListService.getCheckinList(checkinListId).getGymMembers();
    // }

    //  @PutMapping
    // public GymMemberDTO editPassport(@PathVariable long checkinListId, @PathVariable long gymMmemberId,
    //                                @RequestBody GymMemberDTO request) {
    //   request.setId(gymMmemberId);
    //   GymMember gymMmember = new GymMember();
    //   gymMmember.update(request);
    //   return request;}
    // @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember/{gymMemberId}", method = RequestMethod.PUT)
    // @ResponseBody
    //  public GymMemberDTO editPassport(@PathVariable long checkinListId, @PathVariable long gymMmemberId,
    //                              @RequestBody GymMemberDTO request) {
    //  request.setId(gymMmemberId);
    //  gymMmember.update(request);
    //  return request;
    // }
//@PostMapping
//public <GymMemberService> GymMemberDTO saveGymMember (@PathVariable long checkinListId,
    //                                                  @RequestBody GymMemberDTO request){


    // GymMemberService gymMemberService = new GymMemberService();
    // gymMemberService.create(request, checkinListId);
    //return request;
//}

    // @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember", method = RequestMethod.POST)
    // @ResponseBody
    // public GymMemberDTO saveGymMember ( @PathVariable long checkinListId,
    // @RequestBody GymMemberDTO request){

    //    gymMemberService.create(request, checkinListId);
    //    return request;
    //  }

//@DeleteMapping

    //   @RequestMapping(path = "/check-in-list/gymMmember/{gymMmeberId}", method = RequestMethod.DELETE)

    //public void deleteGymMmember ( @PathVariable long gymMmemberId){

    //  gymMemberService.delete(gymMmemberId);

    //   }
    //  }

    @Autowired
    private CheckinListService service;
    @Autowired
    private GymMemberService gymMemberService;

    @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember", method = RequestMethod.GET)
    @ResponseBody
    public List<GymMemberDTO> getGymMembersByCheckinLists(@PathVariable long checkinListId) {

        return service.getCheckinList(checkinListId).getGymMembers();
    }


    @CrossOrigin
    @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember/{gymMemberId}", method = RequestMethod.PUT)
    @ResponseBody
    public GymMemberDTO editGymMember(@PathVariable long checkinListId, @PathVariable long gymMemberId,
                                      @RequestBody GymMemberDTO request) {
        request.setId(gymMemberId);
        gymMemberService.update(request);
        return request;
    }

    @RequestMapping(path = "/check-in-list/{checkinListId}/gymMember", method = RequestMethod.POST)
    @ResponseBody
    public GymMemberDTO saveGymMember(@PathVariable long checkinListId,
                                      @RequestBody GymMemberDTO request) {

        gymMemberService.create(request, checkinListId);
        return request;
    }


    @CrossOrigin
    @RequestMapping(path = "/check-in-list/gymMember/{gymMemberId}", method = RequestMethod.DELETE)

    public void deleteGymMember(@PathVariable long gymMemberId) {

        gymMemberService.delete(gymMemberId);

    }
}