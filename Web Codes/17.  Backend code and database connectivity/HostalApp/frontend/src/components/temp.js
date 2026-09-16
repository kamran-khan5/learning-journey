//----

//----index.js----
import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter } from 'react-router-dom';
import App from './App';

ReactDOM.render(<BrowserRouter><App /></BrowserRouter>, document.getElementById('root'));
//----Api.js-----
import React from "react";
import Navbar from "./components/Navbar";
import { Route, Routes } from 'react-router-dom';
import AddApplicant from "./components/AddApplicant";
import ViewApplicants from "./components/ViewApplicants";

function App() {
  return (
    <div>
      <h1 className="text-center">Hostel Application System</h1>
      <Navbar />
      <Routes>
        <Route path="/hostelApplicants" element={<AddApplicant />} />
        <Route path="/viewApplicants" element={<ViewApplicants />} />
      </Routes>
    </div>
  );
}
export default App;
//////////------Navbar.js-------///
import { Link } from 'react-router-dom';
const Navbar = () => {
    return (
      <div>
        <div className="w-100 bg-danger">
          <Link to="/hostelApplicants" className="ms-5 me-5 text-decoration-none text-white">
            Apply
          </Link>
          <Link to="/viewApplicants" className="ms-5 me-5 text-decoration-none text-white">
            View-Applications
          </Link>
        </div>
        </div>
      
    );
  
  }
export default Navbar;
//-----AddApplicant,js------
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
        await addApplicant(applicantData);
    }

    return (
      <div className="col-md-6 position-absolute start-50 translate-middle-x mt-5">
        <form >
          <label className="mb-2">Student Name</label>
          <input
            type="text"
            className="form-control mb-3"
            name="studentName"
            onChange={(e) => hanndleChange(e)} //handleChange event 
          />
          <label className="mb-2">Registration Number</label>
          <input
            type="text"
            className="form-control mb-3"
            name="registrationNumber"
            onChange={(e) => hanndleChange(e)}
          />
          <button className="btn btn-primary form-control" onClick={(e) => addDetails(e)}>Apply</button>
        </form>
      </div>
    );
}
export default AddApplicant;
///---------ViewApplicant.js---------
const ViewApplicants = () => {

    const [ applicantDetails, setApplicantDetails ] = useState([]);

    useEffect(() => {
        getApplicantsDetails();
    }, []);

    const getApplicantsDetails = async () => {
        const result = await getApplicant();
        setApplicantDetails(result.data);
    }

    return (
      <div className="col-md-6 position-absolute start-50 translate-middle-x mt-5">
        <table class="table">
          <thead>
            <tr>
              <th scope="col">Student Name</th>
              <th scope="col">Registration Number</th>
            </tr>
          </thead>
          <tbody>
            { applicantDetails.map( details => (
                  <tr>
                    <td>{details.studentName}</td>
                    <td>{details.registrationNumber }</td>
                  </tr> 
            ))
            }
          </tbody>
        </table>
      </div>
    );
}
export default ViewApplicants;
//------Service/api.js--------
import axios from 'axios';

const url = "http://localhost:5000";

export const addApplicant = async (applicantData) => {
    return await axios.post(`${url}/hostelApplicants`, applicantData);
}

export const getApplicant = async () => {
    return await axios.get(`${url}/viewApplicants`)
}
//--------