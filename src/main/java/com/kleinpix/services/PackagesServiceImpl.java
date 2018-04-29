package com.kleinpix.services;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Packages;
import com.kleinpix.repositories.PackagesRepository;
import com.kleinpix.repositories.PackagesRepositoryImpl;
import com.kleinpix.services.PackagesService;

public class PackagesServiceImpl implements PackagesService {

    private static PackagesServiceImpl service = null;

    PackagesRepository repository = (PackagesRepository) PackagesRepositoryImpl.getInstance();

    public static PackagesServiceImpl getInstance(){
        if(service == null)
            service = new PackagesServiceImpl();

        return service;
    }

    public Packages create(Packages packages){
        return repository.create(packages);
    }

    public Packages read(int id){
        return repository.read(id);
    }

    public Packages update(Packages packages){
        return repository.update(packages);
    }

    public void delete(int id){
        repository.delete(id);
    }
}
