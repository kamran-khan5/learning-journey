import { Routes, Route } from "react-router-dom";
// import { Accordion } from "@mui/material";
// import Card from "./components/Card";
// import Data from "./components/Data";
// import Footer from "./components/Footer";
// import GetTime from "./components/GetTime";
// import Header from "./components/Header";
// import Incriment from "./components/Incriment";
import TodoList from "./components/TodoList";
import Mylist from "./components/Mylist";
import Layout from "./components/Layout";
import Home from "./components/Home";
import Accordian from "./components/Accordian";
import Registration from "./components/Registration";
import Test from "./components/Test";
const App=()=>{
  return(<>
    
    <Routes>
      <Route path="/" element={<Layout />} >
      <Route index element={<Home />} />
      <Route path="mylist" element={<Mylist />} />
      <Route path="todolist" element={<TodoList />} />
      <Route path="accordian" element={<Accordian />} />
      <Route path="registration" element={<Registration />} />
      <Route path="test" element={<Test />} />
      </Route>
    </Routes> 
    {/* <GetTime />
    <Incriment />
    <TodoList />
  <Accordion /> */}
    {/* Assignment one     */}
      {/* <Header />
      {Data.map((val=>{return(
        // eslint-disable-next-line react/jsx-key
        <Card pic={val.pic} 
         desp={val.desp}
          title={val.title}
          link={val.link} 
        />
      );})) }
  <Footer />     */}
  </>);

}
export default App;