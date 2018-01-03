package com.trip.service;

import com.trip.dao.TicketDao;
import com.trip.entity.Ticket;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TicketService {

    @Resource
    TicketDao ticketDao;

    public List<Ticket> searchByViewpointId(Integer viewpointId){
        return ticketDao.searchByViewpointID(viewpointId);
    }
}
