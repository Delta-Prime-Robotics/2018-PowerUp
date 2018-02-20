package org.usfirst.frc4473.PowerUp.commands;

import org.usfirst.frc4473.PowerUp.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class turnToAngle extends Command {

	private PIDController pid;
	
    public turnToAngle(double targetAngle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    	    	 
        pid = new PIDController(0.01, 0, 0, new PIDSource() {
        	PIDSourceType m_sourceType = PIDSourceType.kDisplacement;
        	
        	@Override
        	public double pidGet() {
        		return Robot.drive.getAngle();
        	}
        	
        	@Override
        	public void setPIDSourceType(PIDSourceType sourceType) {
        		m_sourceType = sourceType;
        	}
        	
        	@Override
        	public PIDSourceType getPIDSourceType() {
        		return m_sourceType;
        	}
        	
        }, rotation -> Robot.drive.rotate(rotation));

        pid.setAbsoluteTolerance(0.02);
        pid.setSetpoint(targetAngle);    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	pid.reset();
    	pid.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return pid.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    	pid.disable();
    	Robot.drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
