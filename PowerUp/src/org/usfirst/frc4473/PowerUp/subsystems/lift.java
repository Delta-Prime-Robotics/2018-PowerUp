// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4473.PowerUp.subsystems;

import org.usfirst.frc4473.PowerUp.RobotMap;
import org.usfirst.frc4473.PowerUp.commands.*;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
@SuppressWarnings("unused") //Gets rid of pesky yellow lines
public class lift extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	
	private final SpeedController liftVic = RobotMap.liftVic;
	
    private final static DigitalInput liftHigh = RobotMap.liftHigh; //Making a new Limit switch
    private final static DigitalInput liftLow = RobotMap.liftLow; //Making a new Limit switch
    
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	//setDefaultCommand(new liftUp());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
  
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void stop() 
    {
    	liftVic.set(0);   
    } 
    
    public void up()
    {
    	if(!liftIsUp())
    	{
    		liftVic.set(-1.0);
    	}
    	else if(liftIsUp())
    	{
    		liftVic.set(0);   
        }
	}
    public void down()
    {
    	if(!liftIsDown())
    	{
    		liftVic.set(1.0);
    	}
    	else if(liftIsDown())
    	{
    		liftVic.set(0);   
        }
	}
    
    public static boolean liftIsUp()
    {
    	return !liftHigh.get();
    }

    public static boolean liftIsDown()
    {
    	return !liftLow.get();
    }
}