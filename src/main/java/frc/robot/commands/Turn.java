/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import com.ctre.phoenix.sensors.PigeonIMU;

// turns the robot during autonomous so it can shoot at the goal 
public class Turn extends CommandBase {
  public Turn() {
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    PigeonIMU.FusionStatus fusionStatus = new PigeonIMU.FusionStatus();
    double currentAngle = fusionStatus.heading;
    if (currentAngle <= 90) {
      RobotContainer.myRobot.tankDrive(-50, 50);
    }
  }

  // Called once the command ends or is interrupted.
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}