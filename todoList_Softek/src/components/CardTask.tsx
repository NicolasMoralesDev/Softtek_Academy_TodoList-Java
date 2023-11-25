import { useContext } from 'react'
import {
  Card,
  CardBody,
  CardFooter,
  Typography,
  Button,
} from "@material-tailwind/react";
import Swal from "sweetalert2";
import { deleteTask } from "../helpers/fetchTask";
import { StateContext } from "../context/StateContext";
import { ModalEditTask } from './ModalEditTask';

interface Props {
  id: number,
  titulo: string;
  descripcion: string;
}

export default function CardTask(props: Props) {

  const { flag, setFlag, setModal, setEdit }: any = useContext(StateContext);


  const handleOpen = () => {
    setModal(true);
    setEdit(props);
  };

  async function borrarTarea(id: number) {

    Swal.fire({
      title: 'Seguro?',
      text: 'Esta accion es inrreversible!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'continuar',
      denyButtonText: "cancelar"
    }).then((result) => {

      if (result.isConfirmed) {
        async function eliminar(id: any) {
          const message = await deleteTask(id);
          Swal.fire({
            title: `${message}`,
            icon: 'success',
          });
          setFlag(!flag);

        }

        eliminar(id);

      } else if (result.isDenied) {
        Swal.fire("cancelado", "", "info");
        setFlag(!flag);

      }
    });

  };


  return (
    <>
      <ModalEditTask />
      <Card className="mt-6">
        <CardBody>
          <Typography variant="h5" color="blue-gray" className="mb-2">
            {props.titulo ? props.titulo : <></>}
          </Typography>
          <Typography>
            {props.descripcion}
          </Typography>
        </CardBody>
        <CardFooter className="gap-2 flex">

          <Button size="sm" variant="text" onClick={() => { borrarTarea(props.id) }} className="flex items-center gap-2 bg-red-800 text-white">
            Borrar
          </Button>
          <Button size="sm" variant="text" onClick={handleOpen} className="flex items-center gap-2 bg-green-700 text-white">
            Editar
          </Button>

        </CardFooter>
      </Card>

    </>

  );
}
