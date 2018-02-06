package org.usfirst.frc4473.PowerUp.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc4473.PowerUp.Robot;

import org.usfirst.frc4473.PowerUp.OI;
import org.usfirst.frc4473.PowerUp.RobotMap;

//import org.usfirst.frc4473.PowerUp.RobotMap;
//will need this after parts are set up in RobotMap


/**
 *
 */
public class clawLift extends Subsystem {
	
	 private final SpeedController clawLiftVic = RobotMap.clawLiftVic;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
  public void up()
  {
	  //clawLiftVic.set(oi.secondaryGamepad.getrawaxis(3));//for some reason oi works for robot but not here
  }
    
  public void stop()
  {
	  clawLiftVic.set(0);
  }
}

