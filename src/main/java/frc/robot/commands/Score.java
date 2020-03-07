/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Balllauncher;
import frc.robot.subsystems.Ultrasound;

// Scores during autonomous if it senses the goal 
public class Score extends CommandBase {
  /**
   * Creates a new Score.
   */
  public Score() {
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double currentDistance =  Ultrasound.m_filter.calculate(Ultrasound.ultrasonicFront.getValue()) * 0.125;
      if (currentDistance > 30){
        new Turn();
        Balllauncher.shooter.set(100);
        isFinished();
      }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}