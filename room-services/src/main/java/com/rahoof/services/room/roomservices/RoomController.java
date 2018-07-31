package com.rahoof.services.room.roomservices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@Api(value = "rooms", description = "Data service operation on rooms", tags = "rooms")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    @ApiOperation(value = "Get all rooms", notes = "Get all room sin the system", nickname = "getRooms")
    public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
        if (StringUtils.isNotEmpty(roomNumber)) {
            return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
        }
        return (List<Room>) this.roomRepository.findAll();
    }

    @RequestMapping(value = "/rooms/bedInfo", method = RequestMethod.GET)
    @ApiOperation(value = "Get all rooms by bedInfo", notes = "Get all room by bedInfo in the system", nickname = "getRoomsByBedInfo")
    public List<Room> findRoomsByBedInfo(@RequestParam(name = "bedInfo", required = false) String bedInfo) {
        if (StringUtils.isNotEmpty(bedInfo)) {
            return this.roomRepository.findByBedInfo(bedInfo);
        }
        return (List<Room>) this.roomRepository.findAll();
    }

}
