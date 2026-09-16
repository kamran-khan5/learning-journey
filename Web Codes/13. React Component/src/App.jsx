import Myinfo from "./components/Myinfo";

const App=()=>{
    return(
    <>
    <h1>Hello This is react Mian commponent App</h1>
    <Myinfo name='Ahmed Ali' decription='I am a web Teacher' pic='../public/images/abc.JPG' website='http://www.comsats.edu.pk' />
    <Myinfo name='Hussain' decription='I am a student' pic='../public/images/abc.JPG' website='http://www.comsats.edu.pk' />
    <Myinfo name='Umar Usama' decription='I am a student' pic='../public/images/abc.JPG' website='http://www.comsats.edu.pk' />
    
    </>
);
}
export default App;