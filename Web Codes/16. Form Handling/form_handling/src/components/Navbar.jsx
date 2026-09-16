import { Outlet,Link } from "react-router-dom";
const Navbar=()=>{
    return(<>
    <nav className="navbar navbar-expand-sm bg-primary navbar-dark text-white">
        <div className="container-fluid ">
            <ul className="navbar-nav">
                <li className="nav-item ">
                    <Link to="/" >Home</Link>
                </li>
                <li className="nav-item display-6 border-1">
                    <a href="#" className="nav-link ">Mobile</a>
                </li>
                <li className="nav-item display-6">
                    <a href="#" className="nav-link " >Jewlary</a>
                </li>
                <li  className="nav-item display-6">
                    <a href="#" className="nav-link ">Furniture</a>
                </li>
            </ul>
        </div>
    </nav>
  
    </>);
}
export default Navbar;