/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  // Motor Controller Ports
  public static final int RightLeader = 0;
  public static final int RightFollower = 3;
  public static final int LeftLeader = 1;
  public static final int LeftFollower = 4;
  public static final int shooter = 6;
  public static final int wheelspinner = 5;
  // Joystick port
  public static final int joystick = 0;
  public static final int xcontroller = 1;
  // Buttons
  public static final int catcher = 3;
  public static final int launch = 1;
  public static final int color = 5;
  public static final int armMover = 11;
  public static final int cancel = 2;
  public static final int toggleArm = 9;
  // Servo
  public static final int gate = 0;
  public static final int intake = 1;
  public static final int actuator = 2;
  // Ultrasound
  public static final int leftUltrasound = 0;
  public static final int frontUltrasound = 1;
  public static final int backUltrasound = 2;
  // Gyro
  public static final int gyroSensor = 0;
}
