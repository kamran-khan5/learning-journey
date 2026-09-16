import { useState } from "react";

const GetTime=()=>{
    const [ctime,setTime]=useState(0);
    const gtime=()=>{
         let ntime=new Date().toLocaleTimeString();
         setTime(ntime);
    }
    setInterval(gtime,1000);
    return(<>
    <h1>{ctime}</h1>
        <button onClick={gtime}>GetTime</button>
    </>);
}
export default GetTime;