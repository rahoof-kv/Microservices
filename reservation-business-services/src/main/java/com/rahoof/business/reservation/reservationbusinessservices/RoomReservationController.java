package com.rahoof.business.reservation.reservationbusinessservices;

import com.rahoof.business.reservation.reservationbusinessservices.client.RoomService;
import com.rahoof.business.reservation.reservationbusinessservices.domain.Room;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RoomReservationController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return this.roomService.findAll(null);
    }

    @RequestMapping(value = "/rooms/bedInfo",method = RequestMethod.GET)
    public List<Room> getRoomsByBedInfo(@RequestParam(name = "bedInfo", required = false) String bedInfo){
        return this.roomService.findRoomsByBedInfo(bedInfo);
    }
}
