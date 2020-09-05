package com.derrick.springbootfundamentals.repository;


import com.derrick.springbootfundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
