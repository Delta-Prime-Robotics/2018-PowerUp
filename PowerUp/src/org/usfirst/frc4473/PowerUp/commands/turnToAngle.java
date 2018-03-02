package org.usfirst.frc4473.PowerUp.commands;

import org.usfirst.frc4473.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class turnToAngle extends Command {

	double targetAngle;
	boolean isDone = false;
	
    public turnToAngle(double angle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    	
    	targetAngle = angle;
        SmartDashboard.putNumber("targetAngle",targetAngle);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double currentAngle = Robot.drive.getAngle();
    	  
    	double diff = (targetAngle - currentAngle);
    	
    	if (Math.abs(diff) < 5) {
    		isDone = true;
    		Robot.drive.stop();
    		return;
    	}
    	
    	double sign = diff / Math.abs(diff);
    	
    	double rate = sign * 0.6;
    	
    	if (diff < 20) {
    		rate = sign * 0.45;
    	}
    	    	
    	SmartDashboard.putNumber("r8", rate);
    	
    	Robot.drive.rotate(rate);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isDone;
//    	double currentAngle = Robot.drive.getAngle();
//    	
//    	double diff = Math.abs(currentAngle - targetAngle);
//    	SmartDashboard.putNumber("DIFF", diff);
//        return (diff < 2);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
