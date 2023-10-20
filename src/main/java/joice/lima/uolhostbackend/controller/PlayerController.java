package joice.lima.uolhostbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import joice.lima.uolhostbackend.model.Player;
import joice.lima.uolhostbackend.model.dtos.PlayerDto;
import joice.lima.uolhostbackend.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
    
    @Autowired
    private PlayerService service;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto){
        Player newPlayer = service.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, null, HttpStatus.CREATED);
    }

    }
