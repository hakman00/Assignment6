package com.kleinpix.repositories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Packages;

public interface PackagesRepository {

    Packages create(Packages packages);

    Packages read(int id);

    Packages update(Packages packages);

    void delete(int id);
}
