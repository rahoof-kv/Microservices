package com.rahoof.business.reservation.reservationbusinessservices.client;

import com.google.common.collect.Lists;
import com.rahoof.business.reservation.reservationbusinessservices.domain.Room;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomServiceFallbackImpl implements RoomService {

    @Override
    public List<Room> findAll(String roomNumber) {
        Room room = new Room();
        room.setId(12121);
        room.setBedInfo("rahoof bed info");
        room.setName("rahoof name");
        room.setRoomNo("rahoof room number");
        return Lists.newArrayList(room);
    }

    @Override
    public List<Room> findRoomsByBedInfo(String bedInfo){
        Room room = new Room();
        room.setId(2434242);
        room.setBedInfo("bed info sample");
        room.setName("bed info name");
        room.setRoomNo("bed info room number");
        return Lists.newArrayList(room);
    }


}
