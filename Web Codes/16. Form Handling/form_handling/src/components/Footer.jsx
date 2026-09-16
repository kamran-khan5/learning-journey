const Footer=()=>{
    return(<>
    <div className="p-2 border-top border-2 bg-primary">
        <div className="row" >
            <div className="col-sm" >
                <h2>About Us</h2>
                <ul>
                    <li><a>About Us</a></li>
                    <li><a>Delivery</a></li>
                    <li><a>Terms & Conditions</a></li>
                    <li><a>Custom Links</a></li>
                </ul>
            </div>
            <div className="col-sm"><ul>
                    <h2>My Account</h2>
                    <li><a>My Account</a></li>
                    <li><a>Order History</a></li>
                    <li><a>Newsletters</a></li>
                    <li><a>Gift</a></li>
                </ul></div>

            <div className="col-sm">
                <h2>Customer Service</h2>
            <ul>
                    <li><a>Contact</a></li>
                    <li><a>Return</a></li>
                    <li><a>Brands</a></li>
                    <li><a>Site Map</a></li>
                </ul>
                </div>

        </div>
        </div>
    </>);
}
export default Footer;