import { useContext, useEffect, useState } from 'react'
import './App.css'
import CardTask from './components/CardTask'
import {getAllTask} from './helpers/fetchTask';
import { StateContext } from './context/StateContext';

interface MyState {

  id:number,
  titulo: string;
  descripcion: string;

}


function App() {

  const [tasks, setTaks] =  useState <MyState[]>([]);

  const { flag } : any = useContext(StateContext);

  useEffect(() => {

    const fetchData = async () => {
      const data = await getAllTask();
      setTaks(data);
      
    };

    fetchData();
  }, [flag]);


  return (
    <>
    <section className='p-5'>
       <h1 className="text-center text-white text-4xl">Lista de Tareas</h1>
    </section>
   
      <section className='w-full  flex  justify-center'>
        <div className='container flex flex-row flex-wrap gap-5 justify-center items-center'>
            {
            tasks.map(index => (

                <CardTask key={index.id} id={index.id} titulo={index.titulo} descripcion={index.descripcion} />

            ))
          }
        </div>
        


      </section>

    </>
  )
}

export default App
