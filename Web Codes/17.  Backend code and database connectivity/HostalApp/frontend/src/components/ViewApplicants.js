import { getApplicant } from '../Service/api';
import { useEffect, useState } from 'react';

const ViewApplicants = () => {

    const [ applicantDetails, setApplicantDetails ] = useState([]);

    useEffect(() => {
        getApplicantsDetails();
    }, []);

    const getApplicantsDetails = async () => {
        const result = await getApplicant();
        setApplicantDetails(result.data);
    }
console.log(applicantDetails);
    return (

<div className="col-md-6 position-absolute start-50 translate-middle-x mt-5">
        <table className="table">
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