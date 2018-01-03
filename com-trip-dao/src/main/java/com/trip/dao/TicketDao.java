package com.trip.dao;

import com.trip.entity.Ticket;

import java.util.List;

public interface TicketDao {

    int deleteByPrimaryKey(Integer ticketId);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    Ticket selectByPrimaryKey(Integer ticketId);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);

    List<Ticket> searchByViewpointID(Integer viewpointId);
}
