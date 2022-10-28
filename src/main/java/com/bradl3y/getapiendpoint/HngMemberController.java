package com.bradl3y.getapiendpoint;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://herokuapp.com", maxAge = 3600)
@RestController
public class HngMemberController {

    private final HngMemberRepository repository;

    HngMemberController(HngMemberRepository repository) {
        this.repository = repository;
    }

    //Return HNG member with provided id, in this case, 1
    @GetMapping("/hng-members/{id}")
    HngMember one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new HngMemberNotFoundException(id));
    }
}
