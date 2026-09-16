import '../mystyle.css';
import './components/Myfunctions';
import Data from './components/Data';
// import Courses from "./components/Courses";
import Myinfo from "./components/Myinfo";
// import { Myfun, myage, myname } from './components/Myfunctions';
const App=()=>{
 const a=[1,2,3,4,5];
 const sqr=(val,indux,arr)=>{
  return(<>
   <h2>Index is {indux}. value is   {val}. Squre of val is {val*val} from array ={arr} </h2> 

  </>)
 }
  const abc=(value)=>{
  
  return(
    <>
    {/* {a.map(sqr)} */}
    <Myinfo myname={value.myname} myage={value.myage} address={value.address} src={value.src}/>
    </>
 )}
const heading={
  backgroundColor:'green',
  color:'red',
  fontWeight:'bold',
  border:'3px solid brown'  
}

  return(
    <>

    <h1  style={heading}>Lectuer 2 React Components</h1>
   {/* {Data.map(abc)} */}

   {/* <Myinfo myname={Data[0].myname} myage={Data[0].myage} address={Data[0].address} src={Data[0].src}/>
   <Myinfo myname={Data[1].myname} myage={Data[1].myage} address={Data[1].address} src={Data[1].src}/>
   <Myinfo myname={Data[2].myname} myage={Data[2].myage} address={Data[2].address} src={Data[2].src}/> */}

   {/* <Myinfo myname='Atif khan' myage='25' address='Peshawar' src="../public/images/abc.JPG"/>
  <Myinfo myname='Sabir' myage='72' address='kokal waseem' src='../public/images/abc.JPG' />*/}
    </> 
  );
}
export default App;