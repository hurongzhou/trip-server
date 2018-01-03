package com.trip.daoImpl;

import com.trip.dao.TicketDao;
import com.trip.entity.Ticket;
import com.trip.mapper.TicketMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class TicketDaoImpl implements TicketDao{
    @Resource
    TicketMapper ticketMapper;

    @Override
    public int deleteByPrimaryKey(Integer ticketId) {
        return ticketMapper.deleteByPrimaryKey(ticketId);
    }

    @Override
    public int insert(Ticket record) {
        return ticketMapper.insert(record);
    }

    @Override
    public int insertSelective(Ticket record) {
        return ticketMapper.insertSelective(record);
    }

    @Override
    public Ticket selectByPrimaryKey(Integer ticketId) {
        return ticketMapper.selectByPrimaryKey(ticketId);
    }

    @Override
    public int updateByPrimaryKeySelective(Ticket record) {
        return ticketMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Ticket record) {
        return ticketMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Ticket> searchByViewpointID(Integer viewpointId) {
        return ticketMapper.searchByViewpointID(viewpointId);
    }
}
