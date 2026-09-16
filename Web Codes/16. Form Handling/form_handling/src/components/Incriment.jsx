import { useState } from "react";
import AddBoxIcon from '@mui/icons-material/AddBox';
import RemoveCircleIcon from '@mui/icons-material/RemoveCircle';
const Incriment=()=>{
const [count,setcount]=useState(0);
const inc=()=>setcount(count+1);
const dec=()=>setcount(count-1);
return(<>
<div className="m-auto p-3 bg-secondary d-inline-block ">
<h2 className="d-flex justify-content-center">{count}</h2>

<button onClick={inc} className="btn bg-primary "><AddBoxIcon /></button>
<button onClick={dec} className="btn bg-primary "> <RemoveCircleIcon /></button></div>         
        
    </>);
}
export default Incriment;