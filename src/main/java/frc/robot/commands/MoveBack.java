/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Ultrasound;
import edu.wpi.first.wpilibj2.command.CommandBase;

// Moves back during autonomous
public class MoveBack extends CommandBase {

  // A specific button or action on the joystick will control the mechanism (motors) and eventually pick up the ball 
  public MoveBack() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {  
    double currentSpeed = (Ultrasound.kHoldDistance - Ultrasound.currentDistance) * Ultrasound.kP;
    if (Ultrasound.currentDistance <= 30) {
      RobotContainer.myRobot.arcadeDrive(0, 0);
    } else {
     RobotContainer.myRobot.arcadeDrive(currentSpeed, 0); 
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}