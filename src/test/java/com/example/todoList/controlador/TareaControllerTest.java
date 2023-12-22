package com.example.todoList.controlador;

import com.example.todoList.model.Message;
import com.example.todoList.model.Tareas;
import com.example.todoList.services.TareasServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TareaControllerTest {


    private  TestRestTemplate testTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private TareasServices tareaServ;

    @LocalServerPort
    int port;

    @BeforeEach
    void setUp() {


        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:"+ port);
        testTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    @DisplayName("Prueba crear tarea")
     void saveTask(){

        Tareas nueva = new Tareas(1L, "programar 7 api", "crear un back con java");
        Message response = tareaServ.crearTareas(nueva);
        assertEquals("Tarea creada con Exito!!", response.getMsg(), "No se pudo crear la tarea!");
        assertTrue(response.getMsg().equals("Tarea creada con Exito!!" ) , "Tarea creada!");

    }

    @Test
    public void deleteById(){

        Message retorno =  tareaServ.borrarTarea(2L);
        assertEquals("Tarea borrada con Exito!!!", retorno.getMsg());
    }

    @Test
    @DisplayName("Prueba get tareas")
    public void getAll(){

        ResponseEntity <?> response =   testTemplate.getForEntity("/tareas/traer", ArrayList.class);
        assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());

    }

    @Test
    @DisplayName("Prueba get tarea por id")
    public void getById(){

//        ResponseEntity <Tareas> response =   testTemplate.getForEntity("/tareas/traer/20", Tareas.class);
//
//        Tareas tarea = response.getBody();
//        assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());

          Tareas tarea =  tareaServ.traerTarea(1L).orElse(null);
          assertEquals("programar", tarea.getTitulo(), "Fallo, no se encontrp la tarea");

    }

}