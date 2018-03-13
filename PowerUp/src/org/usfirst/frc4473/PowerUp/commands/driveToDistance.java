package org.usfirst.frc4473.PowerUp.commands;

import org.usfirst.frc4473.PowerUp.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class driveToDistance extends Command {

	double targetDistance = 0;
	private double initAngle;
	boolean isDone = false;
	
    public driveToDistance(double distance) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    	
    	targetDistance = distance;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.resetDistance();
    	initAngle = Robot.drive.getAngle();
        SmartDashboard.putNumber("driveToDistance-initAngle",initAngle);
        SmartDashboard.putNumber("driveToDistance-TargetDistance",targetDistance);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if (targetDistance > 0) {
    		if (Robot.drive.getDistance() < targetDistance) {
    			Robot.drive.driveAtAngle(-0.65, initAngle);
    		}
    		else {
    	        SmartDashboard.putNumber("driveToDistance-DistanceReached",Robot.drive.getDistance());
    			isDone = true;
    		}
    	}
    	else {
			if (Robot.drive.getDistance() > targetDistance) {
				Robot.drive.driveAtAngle(0.65, initAngle);
			}
			else {
		        SmartDashboard.putNumber("driveToDistance-DistanceReached",Robot.drive.getDistance());
				isDone = true;
			}
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isDone;
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
