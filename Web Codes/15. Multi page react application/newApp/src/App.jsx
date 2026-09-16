
import { BrowserRouter, Route,Routes } from "react-router-dom";
import Home from "./components/Home";
import Contact from "./components/Contact";
import About from "./components/About";
import Layout from "./components/Layout";
import Error from "./components/Error";
const App=()=>{
  return(
    <>
    
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<Layout />} >
    <Route index element={<Home/>} />
    <Route path="contact" element={<Contact />} />
    <Route path='about' element={<About />} />
    <Route path='*' element={<Error />} />
    </Route>
    </Routes>
    </BrowserRouter>

    </>
  );
}
export default App;