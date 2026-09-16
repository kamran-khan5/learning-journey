import bodyParser from 'body-parser';
import cors from 'cors';
import express from 'express';
import mongoose from 'mongoose';
import hostelApplications from './routes/hostelApplications.js';
//--------server---
const app = express();
const port = process.env.PORT || 5000;
//----------
//---Database connectivity----
const connectionURL ="mongodb://127.0.0.1:27017";
mongoose.connect(connectionURL, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log(`Server running on port : ${port}`))
    .catch((error) => console.log(error.message));
//------------------------------------

app.listen(port);
app.use(cors());

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json({ extended: true}))

app.use('/hostelApplicants', hostelApplications);
app.use("/viewApplicants", hostelApplications);
// app.use('/addproduct', hostelApplications);


