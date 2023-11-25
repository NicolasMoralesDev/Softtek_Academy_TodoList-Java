
package com.example.todoList.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nico Morales
 */

@Getter @Setter
public class Message {
    
    private String msg;


    public Message(String msg) {
        this.msg = msg;
    }
    
    
    
}
