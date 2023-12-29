
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
