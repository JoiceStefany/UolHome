package joice.lima.uolhostbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import joice.lima.uolhostbackend.model.Player;
import joice.lima.uolhostbackend.model.dtos.PlayerDto;
import joice.lima.uolhostbackend.repositories.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
    
}
