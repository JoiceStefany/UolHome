package joice.lima.uolhostbackend.infra;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import joice.lima.uolhostbackend.model.GroupType;
import joice.lima.uolhostbackend.service.CodinameService;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService service;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVANGERS){
            String firsMatch = service.getAvangersCondinameList().stream().findFirst().orElseThrow();
            this.service.getAvangersCondinameList().remove(firsMatch);
            return firsMatch;
        }
    String firsMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firsMatch);
        return firsMatch;
    }

    }
