package com.example.todoList.services;

import com.example.todoList.model.Message;
import com.example.todoList.model.Tareas;
import com.example.todoList.repository.ITareaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TareasServicesTest {

    @Mock
    private ITareaRepository tareasRepo;

    @InjectMocks
    private TareasServices tareasServ;

    @Test
    @DisplayName("Test get task by id")
    void traerTarea() {

        Tareas esperada = new Tareas();
        esperada.setId(1L);
        esperada.setDescripcion("con springBoot");
        esperada.setTitulo("una api");

        Optional<Tareas> tareaOptional = Optional.of(esperada);

        Mockito.when(tareasRepo.findById(1L)).thenReturn(tareaOptional);

        Tareas resultado = tareasServ.traerTarea(1L).orElse(null);

        Assertions.assertEquals(resultado.getTitulo(), esperada.getTitulo(), "Fallo, no trae la tarea por id");

        Mockito.verify(tareasRepo).findById(1L);


    }

    @Test
    @DisplayName("Test get all tasks")
    void traerTareas() {


        List <Tareas> tareas = new ArrayList<>();

        Tareas tarea1 = new Tareas();
        Tareas tarea2 = new Tareas();
        tareas.add(tarea1);
        tareas.add(tarea2);

        Mockito.when(tareasRepo.findAll()).thenReturn(tareas);

        Assertions.assertEquals(tareasServ.traerTareas(), tareas, "Fallo, no se encontraron tareas!");
        Mockito.verify(tareasRepo).findAll();

    }

    @Test
    @DisplayName("Test create tasks")
    void crearTareas() {

        Tareas tarea = new Tareas();
        tarea.setTitulo("crear una api con expres");
        tarea.setDescripcion("crear un crud");

        Mockito.when(tareasRepo.save(tarea)).thenReturn(tarea);

        Message resultado = tareasServ.crearTareas(tarea);
        Assertions.assertEquals( resultado.getMsg(), new Message("Tarea creada con Exito!!").getMsg() , "Fallo, no se pudo crear la tarea!");
        Assertions.assertTrue(resultado.getMsg() == new Message("Tarea creada con Exito!!").getMsg(), "Fallo el test!");

        Mockito.verify(tareasRepo).save(tarea);
    }

    @Test
    @DisplayName("Test delete task by id")
    void borrarTarea() {

        Tareas esperada = new Tareas();
        esperada.setId(1L);
        esperada.setTitulo("Crear api con MP");
        esperada.setDescripcion("con pasarela de pagos...");

//        Mockito.when(tareasRepo.deleteById(1L));
    }

    @Test
    @DisplayName("Test put task by id")
    void editarTarea() {

//        Tareas esperada = new Tareas();
//        esperada.setId(1L);
//        esperada.setTitulo("Crear api con MP");
//        esperada.setDescripcion("con pasarela de pagos...");
//
//        Tareas editada = new Tareas();
//        esperada.setId(1L);
//        esperada.setTitulo("Crear api");
//        esperada.setDescripcion("con pasarela de pagos...");
//
//        Mockito.when(tareasRepo.save(esperada)).thenReturn(esperada);
//
//        Message mensaje = tareasServ.editarTarea(editada);
//
//
//        Assertions.assertEquals(mensaje.getMsg(), new Message("Tarea modificada con Exito!!").getMsg() );

    }
}