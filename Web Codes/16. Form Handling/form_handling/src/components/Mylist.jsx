import DeleteIcon from '@mui/icons-material/Delete';
import { useState } from 'react';
const Mylist=(props)=>{
 const [line,setline]=useState(false);
 const del=()=>{return setline(true)};
 console.log(props);
 return(
    <>
    <div>
    <span onClick={del}>
    <DeleteIcon  /> 
    </span>
    <li onClick={()=>{return(props.select(props.id))}} style={{textDecoration:line ?'line-through':'none',display:'inline-block'}} > {props.text}</li>
    </div>
   </>    
    );
    
}
export default Mylist;