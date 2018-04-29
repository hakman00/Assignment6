package com.kleinpix.repositories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.model.Additional;

public interface AdditionalRepository {

    Additional create(Additional additional);

    Additional read(int id);

    Additional update(Additional additional);

    void delete(int id);
}
