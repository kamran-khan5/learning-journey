 import Card from "./Card";
 import Data from "./Data";
const Home = () => {
  console.log(Data);  
  return (
    <>
    <h1>Home</h1>
    
      {Data.map((val=>{return(
        // eslint-disable-next-line react/jsx-key
        <Card pic={val.pic} 
         desp={val.desp}
          title={val.title}
          link={val.link} 
        />
      );})) }
    
    </>
    )
  };
  
  export default Home;