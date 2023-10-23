package joice.lima.uolhostbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import joice.lima.uolhostbackend.infra.CodinameHandler;
import joice.lima.uolhostbackend.model.GroupType;
import joice.lima.uolhostbackend.model.Player;
import joice.lima.uolhostbackend.model.dtos.PlayerDto;
import joice.lima.uolhostbackend.repositories.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname =getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }
    private String getCodiname (GroupType groupType){
        return handler.findCodiname(groupType);
    }
    public List<Player> getAllPlayer(){
        return repository.findAll();
    }
}
