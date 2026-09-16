import { useState } from "react";
import RemoveCircleOutlineIcon from '@mui/icons-material/RemoveCircleOutline';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
// eslint-disable-next-line react/prop-types
const MyAcoordian=({Question,Ans})=>{
    
    const [show,setshow]=useState(false);
    return(<>
        <div className='card m-auto' style={{ width:'18rem' }}>
        <p><span onClick={()=>{setshow(!show)}}>{show ? <RemoveCircleOutlineIcon /> : <AddCircleOutlineIcon /> }  </span>  {Question}</p>
       {show && <p>Answer: {Ans}</p>}     
        </div>
        
        
        </>) 

}
export default MyAcoordian;