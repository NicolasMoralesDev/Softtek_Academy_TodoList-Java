import { useEffect, useState } from 'react'
import './App.css'
import CardTask from './components/CardTask'
import getAllTask from './helpers/fetchTask';

interface MyState {
  titulo: string;
  descripcion: string;
}


function App() {
/*   const [tasks, setTaks] =  useState<MyState>({titulo:"", descripcion:""}); */
  const [tasks, setTaks] =  useState([]);




  useEffect(() => {
    const fetchData = async () => {
      const data = await getAllTask();
      setTaks(data);
    };
    fetchData();
  }, []);

  return (
    <>
    <section className='p-5'>
       <h1 className="text-center text-white text-4xl">Lista de Tareas</h1>
    </section>
   
      <section className='w-full  flex  justify-center  '>
        <div className='container flex flex-row flex-wrap gap-1 justify-center items-center'>
            {
            tasks.map(index => (
                <CardTask titulo={index.titulo} descripcion={index.descripcion} />

            ))
          }
        </div>
        


      </section>

    </>
  )
}

export default App
