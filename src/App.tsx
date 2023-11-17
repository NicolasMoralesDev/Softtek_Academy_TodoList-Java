import { useContext, useEffect, useState } from 'react'
import './App.css'
import icono from "../public/checklist.png";
import CardTask from './components/CardTask'
import { getAllTask } from './helpers/fetchTask';
import { StateContext } from './context/StateContext';
import FormCreateTask from './components/FormCreateTask';
import { Spinner } from '@material-tailwind/react';

interface MyState {

  id: number,
  titulo: string;
  descripcion: string;

}


function App() {

  const [tasks, setTaks] = useState<MyState[]>([]);

  const { flag }: any = useContext(StateContext);

  useEffect(() => {

    const fetchData = async () => {
      const data = await getAllTask();
      setTaks(data);

    };

    fetchData();
  }, [flag]);
  

  return (
    <>
      <section className='p-5 flex justify-center items-center'>
        <img src={icono} className='h-20' alt="icono titulo" />
        <h1 className="text-center text-white text-4xl font-semibold ">Lista de Tareas</h1>
      </section>

      <section className='w-full  flex  justify-center'>
        <div className='container flex flex-row flex-wrap gap-5 justify-center items-center'>
          {
            tasks.length < 0 ?

              <Spinner className="h-16 w-16 text-gray-900/50" />
              
              :

              tasks.map(index => (

                <CardTask key={index.id} id={index.id} titulo={index.titulo} descripcion={index.descripcion} />

              ))
          }
        </div>

      </section>
      <FormCreateTask />
    </>
  )
}

export default App
