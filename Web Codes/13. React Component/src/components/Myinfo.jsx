const Myinfo=(props)=>{
  const {name,pic,decription,website}=props;
    //  console.log(props);
    return(<>
    <div style={{ backgroundColor:'lightcyan', width:'30%', textAlign:'center', display:'inline-block', marginLeft:'5px'}}>
        <div><img src={pic} style={{ width:'100%' }} / ></div>
        <p>Name : {name}</p>
        <p>Description: {decription}</p>
        <p>Website : <a href={website}>www.comsats.com</a> </p>
    </div>

    </>);
}
export default Myinfo;