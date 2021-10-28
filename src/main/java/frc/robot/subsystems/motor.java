// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.ControlType;

import frc.robot.Constants;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class motor extends SubsystemBase {
  private static CANSparkMax robotMotor = new CANSparkMax(Constants.motorOnePort, MotorType.kBrushless);

  /** Creates a new motor. */
  public motor() {}

  public void setSpeed(double speed) {
    robotMotor.getPIDController().setReference(speed, ControlType.kDutyCycle);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
