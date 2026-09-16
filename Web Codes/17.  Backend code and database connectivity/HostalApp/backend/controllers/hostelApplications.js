import hostelApplicationModel from "../models/hostelApplication.js";

export const getApplications = async (req, res) => {
    try {
         let query={ "registrationNumber":"nasr"}
        const hostelApplications = await hostelApplicationModel.find();
        res.status(200).json(hostelApplications);

    } catch (error) {
        console.log("i M GET.");
        res.status(404).json({ message: error.message });
    }
};

export const createApplication = async (req, res) => {
    
    const studentName = req.body.studentName;
    const studentNameInStringFormat = studentName.toString();

    const registrationNumber = req.body.registrationNumber;
    const registrationNumberInStringFormat = registrationNumber.toString();

    const newApplicant = new hostelApplicationModel({
        studentName: studentNameInStringFormat,
        registrationNumber: registrationNumberInStringFormat
    });

    try {
        await newApplicant.save();
        res.json(newApplicant);
    } catch (error) {
        console.log("not saved.");
    }  
};

