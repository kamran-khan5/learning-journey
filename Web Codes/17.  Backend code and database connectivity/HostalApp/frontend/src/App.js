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
