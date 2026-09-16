const Myinfo=(props)=>{
   console.log(props);
// let myname=props.myname;
// let age=props.myage;
const {myage,myname,address,src}=props;
  // const myname='kashif nasr';
  return( 
      <>
      <div>
        <img src={src} ></img>
        <p>
      Welcome Mr {myname}</p>
      <p>My age is {myage}</p> 
      <p>My address is {address}</p>
      </div>
      
      </>
    );
  }
export default Myinfo;