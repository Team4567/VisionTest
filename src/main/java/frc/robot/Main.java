/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;


import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all.
 * Unless you know what you are doing, do not modify this file except to
 * change the parameter class to the startRobot call.
 */
public final class Main {
  private Main() {
  }

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
//    RobotBase.startRobot(Robot::new);

    GripPipeline pl = new GripPipeline();

    Mat inImage = Imgcodecs.imread(args[1], Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);
    pl.process( inImage );
    System.out.println( pl.findContoursOutput().size() );
  }
}
