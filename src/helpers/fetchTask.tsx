

const urlBase = "https://api-todolist-06yh.onrender.com/tareas";

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


export default getAllTask;