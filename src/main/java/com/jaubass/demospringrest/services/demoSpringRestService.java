package com.jaubass.demospringrest.services;

import com.jaubass.demospringrest.models.demoSpringRest;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class demoSpringRestService {
    private List<demoSpringRest> users = new ArrayList();

    public List<demoSpringRest> getAll() {
        return users;
    }
}
