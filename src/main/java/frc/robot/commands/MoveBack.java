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
  double currentDistance;
  double currentSpeed;

  public MoveBack() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    currentDistance = Ultrasound.m_filter.calculate(Ultrasound.ultrasonicBack.getValue()) * Ultrasound.kValueToInches;
    currentSpeed = (Ultrasound.kHoldDistance - currentDistance) * Ultrasound.kP;
    if (Ultrasound.currentDistance <= 30) {
      RobotContainer.myRobot.arcadeDrive(0, 0);
    } else {
     RobotContainer.myRobot.arcadeDrive(-currentSpeed, 0); 
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}