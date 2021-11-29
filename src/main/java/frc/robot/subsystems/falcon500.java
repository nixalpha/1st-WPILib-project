// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

// import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class falcon500 extends SubsystemBase {
  private static WPI_TalonFX falcon1 = new WPI_TalonFX(2);
  private static WPI_TalonFX falcon2 = new WPI_TalonFX(3);

  public void setSpeed(double speed) {
    falcon1.set(speed);
    falcon2.set(speed);
  }

  /** Creates a new falcon500. */
  public falcon500() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
