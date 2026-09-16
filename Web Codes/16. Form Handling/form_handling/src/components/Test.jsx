import { useState } from "react"

const Test = () => {
const [numb,setNumb]=useState();
const [mesg,setMesg]=useState();
const handlechange=(e)=>{
setNumb(e.target.value);
//console.log(e.target.value);
}  
const calc=()=>{

if(numb%2===0){
    setMesg('Even');
}
else {
    setMesg("ODD");
}    
    }

    return (
    <>
    <h2>{numb} is {mesg}</h2>
   
    <input type="number" onChange={handlechange} value={numb} />
    <button onClick={calc}>Calculate</button>
    </>
  )
}

export default Test;