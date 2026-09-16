import { useState } from "react"; //import useState hook
import { addApplicant } from '../Service/api'; //import addApplicant api from (Service folder, and axios.post api nanme)

const AddApplicant = () => {

    //useState hook with initial values of ""
    const [ applicantData, setApplicantData ] = useState({
        studentName: "",
        registrationNumber: ""

    });

    //Destructuring (for example, instead of applicantData.studentName and applicantData.registrationnNumber)
    //we destructure in one single line as follows
    const { studentName, registrationNumber } = applicantData;

    //event change method to capture and update data inserted via input fields and set using 
    //setApplicantData function of useState hook
    const hanndleChange = (e) => {
        setApplicantData( {...applicantData, [e.target.name] : [e.target.value]});
    }

    //import and call post api (axios.post)
    const addDetails = async (e) => {
        e.preventDefault();
    //--Call api to send data to server
        await addApplicant(applicantData);
    
        //--To clear the input field after submission---  
     setApplicantData({
      studentName: "",
      registrationNumber: ""
     })
     //-----------
      }

    return (
      <div className="col-md-6 position-absolute start-50 translate-middle-x mt-5">
        <form >
          <label className="mb-2">Student Name</label>
          <input
            type="text"
            className="form-control mb-3"
            name="studentName"
            value={applicantData.studentName}
            onChange={(e) => hanndleChange(e)} //handleChange event 
          />
          <label className="mb-2">Registration Number</label>
          <input
            type="text"
            className="form-control mb-3"
            name="registrationNumber"
            value={applicantData.registrationNumber}
            onChange={(e) => hanndleChange(e)}
          />
          <button className="btn btn-primary form-control" onClick={(e) => addDetails(e)}>Apply</button>
        </form>
      </div>
    );
}

export default AddApplicant;