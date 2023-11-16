import { open } from "@material-tailwind/react/types/components/accordion";
import { StateContext } from "./StateContext"
import { useState } from "react"

interface props {
  children: JSX.Element | JSX.Element[]
}

export const StateProvider = ({ children }: props) => {

  const [modal, setModal] = useState<boolean>(false);
  const [flag, setFlag] = useState<boolean>(false);
  const [edit, setEdit] = useState<any>([]);




  return (

    <StateContext.Provider value={{ modal, setModal, flag, setFlag, edit, setEdit }}>
      {children}
    </StateContext.Provider>
  )
}

