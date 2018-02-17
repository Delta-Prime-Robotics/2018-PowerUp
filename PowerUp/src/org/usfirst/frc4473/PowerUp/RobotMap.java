// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4473.PowerUp;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DigitalInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveleftDriveSpark;
    public static SpeedController driverightDriveSpark;
    public static DifferentialDrive driveroboDrive;
    // Claw
    public static Compressor armgrabbyCompressor; //Not sure if we actually use this
    public static Solenoid hug;
    // Claw Lift
    public static SpeedController liftVic;
    public static DigitalInput liftHigh;
    public static DigitalInput liftLow;
    // Climb Lift
    public static SpeedController climbliftVic;
    public static DigitalInput climbliftHigh;
    public static DigitalInput climbliftLow;
    // Cameras
    public static UsbCamera camera1;
    public static UsbCamera camera2;
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @SuppressWarnings("deprecation") //Removes yellow lines
	public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	// Drive
        driveleftDriveSpark = new Spark(0);
        //LiveWindow.addActuator("drive", "leftDriveSpark", (Spark) driveleftDriveSpark);
        driveleftDriveSpark.setInverted(false);
        
        driverightDriveSpark = new Spark(1);
       // LiveWindow.addActuator("drive", "rightDriveSpark", (Spark) driverightDriveSpark);
        driverightDriveSpark.setInverted(false);
        
        driveroboDrive = new DifferentialDrive(driveleftDriveSpark, driverightDriveSpark);
        
        driveroboDrive.setSafetyEnabled(true);
        driveroboDrive.setExpiration(0.1);
        driveroboDrive.setMaxOutput(1.0);

        // Claw
        armgrabbyCompressor = new Compressor(); //Values to check
        armgrabbyCompressor.setClosedLoopControl(true);
        hug = new Solenoid(0); //Values to check
        
        // Claw Lift
        liftVic = new VictorSP(2);
        LiveWindow.addActuator("lift", "liftVic", (VictorSP) liftVic);
        liftVic.setInverted(false);
        
        liftHigh = new DigitalInput(8);
        LiveWindow.addSensor("LiftSystem", "lsHigh", liftHigh);
        liftLow = new DigitalInput(9);
        LiveWindow.addSensor("LiftSystem", "lsLow", liftLow);
        
        // Climb Lift
        climbliftVic = new VictorSP(3);
        LiveWindow.addActuator("climblift", "climbliftVic", (VictorSP) climbliftVic);
        climbliftVic.setInverted(false);
        
        climbliftHigh = new DigitalInput(6);
        LiveWindow.addSensor("ClimbSystem", "lsHigh", climbliftHigh);
        climbliftLow = new DigitalInput(7);
        LiveWindow.addSensor("ClimbSystem", "lsHigh", climbliftLow);
        
        // Cameras
        camera1 = CameraServer.getInstance().startAutomaticCapture(0);
        camera2 = CameraServer.getInstance().startAutomaticCapture(1);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}