package org.usfirst.frc4473.PowerUp.subsystems;

import org.usfirst.frc4473.PowerUp.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class climbLift extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final SpeedController climbLiftVic = RobotMap.climbliftVic;
	
    private final static DigitalInput climbliftHigh = RobotMap.climbliftHigh; //Making a new Limit switch
    private final static DigitalInput climbliftLow = RobotMap.climbliftLow; //Making a new Limit switch
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    

    
    public void stop() 
    {
    	climbLiftVic.set(0);   
    } 
    
    public void up()
    {
    	if(!liftIsUp())
    	{
    		climbLiftVic.set(1.0);
    	}
    	else if(liftIsUp())
    	{
    		climbLiftVic.set(0);   
        }
	}
    public void down()
    {
    	if(!liftIsDown())
    	{
    		climbLiftVic.set(-1.0);
    	}
    	else if(liftIsDown())
    	{
    		climbLiftVic.set(0);   
        }
	}
    
    public static boolean liftIsUp()
    {
    	return !climbliftHigh.get();
    }

    public static boolean liftIsDown()
    {
    	return !climbliftLow.get();
    }
}

