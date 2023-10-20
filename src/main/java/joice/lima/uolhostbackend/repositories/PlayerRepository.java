package joice.lima.uolhostbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import joice.lima.uolhostbackend.model.Player;


public interface PlayerRepository extends JpaRepository<Player, Long>{
    
}
