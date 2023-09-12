package github.douglasSampaio.domain.repository;

import github.douglasSampaio.domain.repository.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliente,Integer> {

}
