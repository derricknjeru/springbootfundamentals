package com.derrick.springbootfundamentals.service;

import com.derrick.springbootfundamentals.entity.Ticket;
import com.derrick.springbootfundamentals.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }

}
