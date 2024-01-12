package org.example.parent;

import org.example.child.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyUser {

    @Autowired
    private AppProperties properties;

    public String useProperties() {
        System.out.println("Message from child: " + properties.getName());
        System.out.println("Number from child: " + properties.getDescription());
        return "Message from parent: " + properties.getName() + "Number from parent: " + properties.getDescription();
    }


}
