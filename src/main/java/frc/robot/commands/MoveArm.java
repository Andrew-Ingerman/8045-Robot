/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/


//.5 is the top
package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class MoveArm extends CommandBase {
  public static double i = 0;

  private static Boolean IS_RUNNING = false;
  public MoveArm() {
    // Use addRequirements() here to declare subsystem dependencies.
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
      Arm.actuator.setBounds(2, 2, 1.5, 1, 1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println(i);
    if (RobotContainer.joystick.getRawButton(11) ){
      i+=0.003;
    }
    else if (RobotContainer.joystick.getRawButton(8)){
      i-=0.003;
    }
    // double angle = IS_RUNNING ? 0.0: i;
    Arm.actuator.set(i);      
    }
  
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
      Arm.actuator.set(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}