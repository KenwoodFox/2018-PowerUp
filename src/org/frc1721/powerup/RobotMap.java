package org.frc1721.powerup;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int dtLeft = 0, dtRight = 1;
	public static VictorSP vspLeft, vspRight;
	public static final int joyLeft = 0;
	public static Joystick stick;
	
	public static RobotDrive rd;
}

