package com.planets.galaxy.controller;

import com.planets.galaxy.model.Venus;
import com.planets.galaxy.repository.VenusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**This controller class holds the HTTP web requests in spring mvc, typically handling HTTP requests and returning the views or responses.
 * */

// controller --> service --> repo

@RestController /** This annotation is used to create the restful apis, and It combines @controller @Response body annotations.*/
@RequestMapping("/planets/venus")/**Map Http web request to URI**/
public class VenusController {

    @Autowired
    VenusRepository venusRepository;

    public VenusController(VenusRepository venusRepository) {
        this.venusRepository = venusRepository;
    }

    @PostMapping()// This is to convert a method in to API POST
    public Venus insert(@RequestBody Venus venus){
        venusRepository.save(venus);
        return venus;
    }
}
