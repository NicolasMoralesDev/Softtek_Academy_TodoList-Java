
# 📑 App TodoList FullStack

![Portada](https://firebasestorage.googleapis.com/v0/b/fotos-cde1e.appspot.com/o/Captura-Actividad5.PNG?alt=media&token=afa2a178-e26a-4425-822f-83bdf83ce105)




## 💻 Tecnologias usadas

### Front End:
- Tailwind CSS
- TypeScript
- React JS empaquetado con Vite
- Sweet Alert, para los modales animados

### Back End:
- Java
- Spring Boot Framework
- MySql
- Api Docunmentada con Swagger


## 👨🏻‍💻 API Documentacion
## Links importantes

- [Testeo de la Api con swagger]( https://api-todolist-06yh.onrender.com/swagger-ui/index.html#/)
- [Deploy del Front End](https://todolist-nicolas-morales.netlify.app)
(Puede demorar la primera carga de tareas, al ser gratuito el servidor de la base de datos se desconecta cuyando hay inactividad)

#### Traer Todas las Tareas

```http
  GET /tareas/traer
```

#### Traer tarea por Id

```http
  GET /tareas/traer/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Requerido**. Requiere un id valido|

#### Crear Tarea

```http
  POST /tareas/crear
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Tarea`   | `Tarea`  | Requiere un objeto de tipo Tarea en el body|

#### Borrar tarea por Id

```http
  DELETE /tareas/borrar/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Requerido**. Requiere un id valido|



