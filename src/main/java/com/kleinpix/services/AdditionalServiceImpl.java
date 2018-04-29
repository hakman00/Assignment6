package com.kleinpix.services;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Additional;
import com.kleinpix.repositories.AdditionalRepository;
import com.kleinpix.repositories.AdditionalRepositoryImpl;

public class AdditionalServiceImpl implements AdditionalService {

    private static AdditionalServiceImpl service = null;

    AdditionalRepository repository = (AdditionalRepository) AdditionalRepositoryImpl.getInstance();

    public static AdditionalServiceImpl getInstance(){
        if(service == null)
            service = new AdditionalServiceImpl();

        return service;
    }

    public Additional create(Additional additional){
        return repository.create(additional);
    }

    public Additional read(int id){
        return repository.read(id);
    }

    public Additional update(Additional additional){
        return repository.update(additional);
    }

    public void delete(int id){
        repository.delete(id);
    }
}
