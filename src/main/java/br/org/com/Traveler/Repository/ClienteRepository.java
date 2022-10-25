package br.org.com.Traveler.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.org.com.Traveler.Model.*;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
