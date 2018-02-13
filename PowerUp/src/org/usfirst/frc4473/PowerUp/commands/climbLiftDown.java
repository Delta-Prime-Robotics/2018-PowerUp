package org.usfirst.frc4473.PowerUp.commands;

import org.usfirst.frc4473.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class climbLiftDown extends Command {

    public climbLiftDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.climbLift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.climbLift.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 Robot.climbLift.down(); 	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.climbLift.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
