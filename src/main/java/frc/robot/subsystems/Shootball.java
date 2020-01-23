/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants;


public class Shootball extends SubsystemBase {
private Joystick j;
private WPI_VictorSPX shooter;


  public Shootball() {
    j = new Joystick(Constants.joystick);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
