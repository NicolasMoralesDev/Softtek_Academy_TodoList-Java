import {useContext, useState} from "react";
import {
  Button,
  Dialog,
  DialogHeader,
  DialogBody,
  DialogFooter,
  Input,
  Textarea,
  Typography,
} from "@material-tailwind/react";
import { StateContext } from "../context/StateContext";
import { putTask } from "../helpers/fetchTask";
import Swal from "sweetalert2";


export function ModalEditTask() {

    const { modal, setModal, edit, setEdit, flag, setFlag } : any = useContext(StateContext);


    const handleChange = (e: any) => {
      const { name, value } = e.target;
      setEdit((prevState: any) => ({ ...prevState, [name]: value }));
    };

    const editSubmit = async () => {

     const message = await putTask(edit);
     setFlag(!flag);
     setModal(false);
     Swal.fire({
      title: `${message}`,
      icon: 'success',

    });

    }
 
   const handleOpen = () => setModal(false);
 
  return (
    <>
    <Dialog open={modal} size="xs" handler={()=>""}>
        <div className="flex items-center justify-between">
          <DialogHeader className="flex flex-col items-start">
            {" "}
            <Typography className="mb-1" variant="h4">
              Editar Tarea {" "}
            </Typography>
          </DialogHeader>
          <svg
            xmlns="http://www.w3.org/2000/svg"
            viewBox="0 0 24 24"
            fill="currentColor"
            className="mr-3 h-5 w-5"
            onClick={handleOpen}
          >
            <path
              fillRule="evenodd"
              d="M5.47 5.47a.75.75 0 011.06 0L12 10.94l5.47-5.47a.75.75 0 111.06 1.06L13.06 12l5.47 5.47a.75.75 0 11-1.06 1.06L12 13.06l-5.47 5.47a.75.75 0 01-1.06-1.06L10.94 12 5.47 6.53a.75.75 0 010-1.06z"
              clipRule="evenodd"
            />
          </svg>
        </div>
        <DialogBody>
          <div className="grid gap-6">
            <Input crossOrigin={()=> 1} onChange={handleChange} name="titulo" label="titulo" alt="input titulo" value={edit.titulo} />
            <Textarea onChange={handleChange} name="descripcion" label="Descripcion" value={edit.descripcion} />
          </div>
        </DialogBody>
        <DialogFooter className="space-x-2">
          <Button variant="text" color="gray" onClick={handleOpen}>
            cancelar
          </Button>
          <Button variant="gradient" color="gray" onClick={ editSubmit}>
            editar
          </Button>
        </DialogFooter>
      </Dialog>
    </>
  );
}