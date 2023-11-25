const urlBase = "http://localhost:8080/tareas";

const getAllTask = async ()  => {

    const response = await fetch(`${urlBase}/traer`, {
        method:"GET",
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    });
    const data = await response.json();


    return data;
};


const deleteTask = async (id:number)  => {

    const response = await fetch(`${urlBase}/borrar/${id}`, {
        method:"DELETE",
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    });
    
    const data = await response.json();

    return data.msg;
};


export const putTask = async (tarea: any)  => {

    const response = await fetch(`${urlBase}/editar`, {
        method:"PUT",
        body: JSON.stringify({
           id:tarea.id,
           titulo:tarea.titulo,
           descripcion:tarea.descripcion
        }),
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    });
    
    const data = await response.json();

    return data.msg;
};


export const postTask = async (tarea: any) => {

    const response = await fetch(`${urlBase}/crear`, {

        method:"POST", 
        body:JSON.stringify({
            titulo:tarea.titulo,
            descripcion: tarea.descripcion
        }),
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    });

    const data = await response.json();

    return data.msg;
}


export  {getAllTask, deleteTask};