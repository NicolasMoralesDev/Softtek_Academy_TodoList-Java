import { useContext, useState } from 'react'
import { StateContext } from '../context/StateContext';
import { postTask } from '../helpers/fetchTask';
import {
    Card,
    Input,
    Button,
    Typography,
} from "@material-tailwind/react";
import Swal from 'sweetalert2';

const FormCreateTask = () => {

    const [data, setData] = useState([]);
    const { flag, setFlag }: any = useContext(StateContext);


    const handleChange = (e: any) => {
        
        const { name, value } = e.target;
        setData((prevState: any) => ({ ...prevState, [name]: value }));
    };

    const createTask = async () => {

        const message = await postTask(data);
        setFlag(!flag);
        Swal.fire({
            title: `${message}`,
            icon: 'success',

        });
    }

    return (
        <section className='flex justify-center m-16'>
            <Card color="white" shadow={true} className='p-3'>
                <Typography variant="h4" color="black" className='text-center'>
                    Crear Tarea
                </Typography>
                <form className="mt-8 mb-2 w-80 max-w-screen-lg sm:w-96">
                    <div className="mb-1 flex flex-col gap-6">
                        <Typography variant="h6" color="black" className="-mb-3">
                            Titulo
                        </Typography>
                        <Input
                            crossOrigin={Card}
                            size="lg"
                            name='titulo'
                            onChange={handleChange}
                            placeholder="limpiar..."
                            className=" !border-t-white-200"
                        />
                        <Typography variant="h6" color="black" className="-mb-3">
                            Descripcion
                        </Typography>
                        <Input
                            size="lg"
                            crossOrigin={Card}
                            onChange={handleChange}
                            name='descripcion'
                            placeholder="barrer la vereda"
                            className=" !border-t-white-200 "

                        />
                    </div>
                    <Button variant='gradient' color='green' className="mt-6" fullWidth onClick={createTask}>
                        crear
                    </Button>
                </form>
            </Card>
        </section>
    )
}

export default FormCreateTask