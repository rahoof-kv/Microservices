package com.rahoof.services.room.roomservices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    Room findByRoomNumber(String roomNumber);
    List<Room> findByBedInfo(String bedInfo);
}
