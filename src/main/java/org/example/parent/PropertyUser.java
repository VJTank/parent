package org.example.parent;

import org.example.child.MyAppProperties;
import org.springframework.stereotype.Component;

@Component
public class PropertyUser {

    private MyAppProperties properties;

    public String useProperties() {
        System.out.println("Message from child: " + properties.getMessage());
        System.out.println("Number from child: " + properties.getNumber());
        return "Message from parent: " + properties.getMessage() + "Number from parent: " + properties.getNumber();
    }


}
