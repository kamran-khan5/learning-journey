/* eslint-disable react/jsx-key */
import AddBoxIcon from "@mui/icons-material/AddBox";
import { useState } from "react";
import Button from "@mui/material/Button";
import { Stack } from "@mui/material";
import Mylist from "./Mylist";
const TodoList = () => {
  const [listitme, setlistitem] = useState("");
  const [newlist, setnewlist] = useState([]);

  const itemlist = (e) => {
    setlistitem(e.target.value);
  };
  const newitemlist = () => {
    setnewlist((prevalue) => {
      return [...prevalue, listitme];
    });
    setlistitem("");
  };
  const deleteItems = (id) => {
    console.log("deleted");
    setnewlist((prevalue) => {
      return prevalue.filter((arrElem, index) => {
        return index !== id;
      });
    });
  };
  return (
    <>
      <div className="card m-auto mt-5" style={{ width: "18rem" }}>
        <div className="card-card-header text-center text-uppercase">
          <h2>todo list</h2>
        </div>
        <div className="card-body">
          <Stack direction="row" spacing={1}>
            <input type="text" value={listitme} onChange={itemlist} />
            <Button variant="contained" onClick={newitemlist}>
              <AddBoxIcon />
            </Button>
          </Stack>
          <div>
            <ol
              onClick={deleteItems}
              style={{ listStyle: "none", float: "left" }}
            >
              {newlist.map((val, index) => {
                return (
                  <Mylist
                    key={index}
                    text={val}
                    id={index}
                    select={deleteItems}
                  />
                );
              })}
            </ol>
          </div>
        </div>
      </div>
    </>
  );
};
export default TodoList;
