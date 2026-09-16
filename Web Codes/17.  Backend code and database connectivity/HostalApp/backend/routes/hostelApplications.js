import express from 'express';
import { getApplications, createApplication } from '../controllers/hostelApplications.js';

const router = express.Router();

router.get("/", getApplications);
router.post("/", createApplication);
// router.post("/", createproduct);

export default router;