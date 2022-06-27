package com.betaplan.angela.endidemo.services;

import com.betaplan.angela.endidemo.models.Art;
import com.betaplan.angela.endidemo.repositories.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtService {

    @Autowired
    private ArtRepository artRepo;

//constructor
    // public ArtService(ArtRepository artRepo) {
    //     this.artRepo = artRepo;
    // }

    public List<Art> getAllArts(){
        //Business Logic
        return artRepo.findAll();
    }
    //dependency injectioin
    // Find all arts
    //create new art
    //update new arts
    //delete art
}
