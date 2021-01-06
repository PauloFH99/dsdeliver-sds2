import { useEffect } from "react";

type Props = {
    message:string;
}

function Hello({message} :  Props){
    useEffect(() => {

    }, []);
  
    return(
        <h1>Componente {message}</h1>
    )
}

export default Hello;