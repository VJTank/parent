package org.example.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParentController {

    @Autowired
    @Qualifier("propertyUser")
    private PropertyUser propertyUser;

    @GetMapping("/testP")
    public String testProperties() {
        return propertyUser.useProperties();
    }
}
