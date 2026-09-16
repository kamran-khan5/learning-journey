const Card=(props)=>{
   const {pic,title,desp,price,link}=props; 
//    console.log(props);
    return(<>
    <div className="card m-3" style={{ width:'30%', display:'inline-block ' }} >
        <img src={pic} className="card-img-top"/>
        <div className="card-body">
        <h4 className="card-title">{title}</h4>
        <p className="card-text">{desp}</p>
        <p className="card-text">{price} </p>
        <a href={link} className="btn btn-primary" target="_blank">Add to Card</a>
        </div>
    </div>
    </>);
}
export default Card;