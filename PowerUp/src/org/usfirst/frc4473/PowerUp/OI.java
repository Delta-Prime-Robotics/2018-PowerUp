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

import org.usfirst.frc4473.PowerUp.commands.driveTank;
import org.usfirst.frc4473.PowerUp.commands.grabEngage;
import org.usfirst.frc4473.PowerUp.commands.grabRelease;
import org.usfirst.frc4473.PowerUp.commands.leftLeftAutonomousCommand;
import org.usfirst.frc4473.PowerUp.commands.leftRightAutonomousCommand;
import org.usfirst.frc4473.PowerUp.commands.middleLeftAutonomousCommand;
import org.usfirst.frc4473.PowerUp.commands.middleRightAutonomousCommand;
import org.usfirst.frc4473.PowerUp.commands.rightLeftAutonomousCommand;
import org.usfirst.frc4473.PowerUp.commands.rightRightAutonomousCommand;
import org.usfirst.frc4473.PowerUp.commands.liftDown;
import org.usfirst.frc4473.PowerUp.commands.liftUp;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick rightStick;
    public Joystick leftStick;
    public Joystick secondaryGamepad;
    
    public JoystickButton btnGearLiftUp;
    public JoystickButton btnGearLiftDown;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        secondaryGamepad = new Joystick(2);
        
        leftStick = new Joystick(1);
        
        rightStick = new Joystick(0);
        


        // SmartDashboard Buttons
        SmartDashboard.putData("leftLeftAutonomousCommand", new leftLeftAutonomousCommand());
        SmartDashboard.putData("leftRightAutonomousCommand", new leftRightAutonomousCommand());
        SmartDashboard.putData("middleLeftAutonomousCommand", new middleLeftAutonomousCommand());
        SmartDashboard.putData("middleRightAutonomousCommand", new middleRightAutonomousCommand());
        SmartDashboard.putData("rightLeftAutonomousCommand", new rightLeftAutonomousCommand());
        SmartDashboard.putData("rightRightAutonomousCommand", new rightRightAutonomousCommand());
        SmartDashboard.putData("driveTank", new driveTank());
        SmartDashboard.putData("grabEngage", new grabEngage());
        SmartDashboard.putData("grabRelease", new grabRelease());
        SmartDashboard.putData("liftUp", new liftUp());
        SmartDashboard.putData("liftDown", new liftDown());
        
        btnGearLiftUp = new JoystickButton(secondaryGamepad, 4);
        btnGearLiftUp.whileHeld(new liftUp());
        btnGearLiftDown = new JoystickButton(secondaryGamepad, 1);
        btnGearLiftDown.whileHeld(new liftDown());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getRightStick() {
        return rightStick;
    }

    public Joystick getLeftStick() {
        return leftStick;
    }

    public Joystick getSecondaryGamepad() {
        return secondaryGamepad;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}