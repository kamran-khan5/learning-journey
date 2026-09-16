 import { Button } from "@mui/material"
import { useState } from "react"

const Registration = () => {
const [formData,setData]=useState({
    fname:"",
    lname:"",
});

const handleSubmit=(event)=>{
    event.preventDefault();

}
//function to handle events
const inputEvent=(e)=>{
//console.log(e.target.value);
const value=e.target.value;
const name=e.target.name;

setData((preValue)=>{
return{
    ...preValue,
    [name]:value,
}
});

}

    return (
   <>
   <div className="m-auto">
    <form  className="form-control" onSubmit={handleSubmit}>
        <h1>Registration</h1>
        <label>FirstName: <input type='text' placeholder="Enter First Name" onChange={inputEvent} name='fname' value={formData.fname}/> </label>
        <label>LastName: <input type='text' placeholder="Enter Last Name" onChange={inputEvent} name="lname" value={formData.lname} /> </label>

        <Button type='submit' className="btn text-white bg-danger m-2 ">Registor</Button>
    </form>
    </div>
    <div>
        <p>{formData.fname}</p>
        <p>{formData.lname}</p>
        
    </div>
   </>
  )
}

export default Registration