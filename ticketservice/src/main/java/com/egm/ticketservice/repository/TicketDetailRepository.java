package com.egm.ticketservice.repository;

import com.egm.ticketservice.model.TicketDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TicketDetailRepository extends JpaRepository<TicketDetail,Long> {
}
