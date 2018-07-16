package com.rahoof.business.reservation.reservationbusinessservices.client;

import com.rahoof.business.reservation.reservationbusinessservices.domain.Room;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "ROOMSERVICES", fallback = RoomServiceFallbackImpl.class)
public interface RoomService {

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);
}
