package org.fasttrackit.checkinList.web;

import org.fasttrackit.checkinList.dto.CheckinListDTO;
import org.fasttrackit.checkinList.service.CheckinListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CheckinListController {
    @Autowired
    private CheckinListService service;

    @RequestMapping(path = "/check-in-list/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CheckinListDTO getCheckinListById(@PathVariable long id) {
        return service.getCheckinList(id);
    }

    @RequestMapping(path = "/check-in-list", method = RequestMethod.GET)
    @ResponseBody
    public List<CheckinListDTO> getChekinLists() {
        return service.getallCheckinLists();
    }

}
