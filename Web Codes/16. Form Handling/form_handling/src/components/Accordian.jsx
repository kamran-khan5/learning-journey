import MyAcoordian from './MyAcoordian';
import { useState } from 'react';
// import './Qlist'
import Qlist from './Qlist';
const Accordian=()=>{
   const [data]=useState(Qlist);  
   return(<>
      <h3>Accordion</h3>  
      {data.map((curElem)=>{
      const {id}=curElem;
        return <MyAcoordian key={id} {...curElem} />
        
      })}
    </>);
}
export default Accordian;