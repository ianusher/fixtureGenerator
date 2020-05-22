package com.fixtures.fixturegenerator.service;

import com.fixtures.fixturegenerator.entity.Team;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FixturesService {

    public String fixture() {
        return "1 v 2";
    }

    public List<Team> outputList() {
        List<Team> myList = new ArrayList<>();

        myList.add(new Team("Sunderland"));
        myList.add(new Team("Barcelona"));


        return myList;
    }

}
