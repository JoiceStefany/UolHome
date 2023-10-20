package joice.lima.uolhostbackend.model.dtos;

import joice.lima.uolhostbackend.model.GroupType;

public record PlayerDto(String name, String email, String phoneNumber, GroupType groupType){

}

