package com.rahoof.business.reservation.reservationbusinessservices.client;

import com.google.common.collect.Lists;
import com.rahoof.business.reservation.reservationbusinessservices.domain.Room;
import org.springframework.stereotype.Component;

import java.util.Collections;
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
}
