package org.usfirst.frc4473.PowerUp.commands;

import org.usfirst.frc4473.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class switchHeight extends Command {
	int counter=0;
	boolean isDone = false; 
	
    public switchHeight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (counter < 200)
    	{
    		Robot.lift.up();
    		counter++;
    	}
    	else 
    	{
    		Robot.lift.stop();
    		isDone = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
