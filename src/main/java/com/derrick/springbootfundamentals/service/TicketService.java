package com.derrick.springbootfundamentals.service;


import com.derrick.springbootfundamentals.entity.Ticket;

public interface TicketService {
    Iterable<Ticket> listTickets();
}


