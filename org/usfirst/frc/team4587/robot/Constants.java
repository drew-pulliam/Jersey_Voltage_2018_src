package org.usfirst.frc.team4587.robot;

import edu.wpi.first.wpilibj.Solenoid;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * A list of constants used by the rest of the robot code. This include physics constants as well as constants
 * determined through calibrations.
 */
public class Constants{
    public static double kLooperDt = 0.005;

    public static double kSensorUnitsPerRotation = 4096;
    
    public static double kStepSizeSeconds = 0.01;
    public static double kMaxFeetPerSecond = 10.0;
    public static double kMaxAcceleration = 15.0;
    public static double kMaxJerk = 40.0;
    public static double kWheelBaseFeet = 25.75 / 12.0;
    
    public static final double kLiftAMax = 20;
    public static final double kLiftVMax = 20;

    /* ROBOT PHYSICAL CONSTANTS */

    // Wheels
    public static final double kDriveWheelDiameterInches = 6;
    public static double kTrackWidthInches = 26.655;
    public static double kTrackScrubFactor = 0.924;
    public static final double kInchesPerTic = Constants.kDriveWheelDiameterInches * Math.PI / Constants.kSensorUnitsPerRotation;
    
    //Lift
    public static final double kLiftTicsPerRev = 256.0;
    public static final double kLiftInchesPerRev = 2.5 * Math.PI * (24.0/84.0) * (40.0/44.0); // 40 to 44, 24 to 84, 2.5in dia
    public static final double kLiftInchesPerTic = Constants.kLiftInchesPerRev / Constants.kLiftTicsPerRev;
    public static final double kLiftMaxAmps = 3;
    public static final long kLiftTimeSinceHitMax = 1000*1000*1000;

    // Geometry
    public static double kCenterToFrontBumperDistance = 16.33;
    public static double kCenterToIntakeDistance = 23.11;
    public static double kCenterToRearBumperDistance = 16.99;
    public static double kCenterToSideBumperDistance = 17.225;

    /* CONTROL LOOP GAINS */

    public static final double kPathFollowKa = 0.0001;
    public static final double kPathFollowKv = 0.000275;
    public static final double kPathFollowKp = 0.00025;
    public static final double kPathFollowKg = 0.01;

    public static final double kPathHoldKp = 0.0005;
    public static final double kPathHoldKg = 0.0001;

    public static final double kLiftKp = 0.02;
    public static final double kLiftKa = 0.015;
    public static final double kLiftKv = 0.15;

    public static final double kLiftHoldKp = 0.05;
    public static final double kLiftHoldKi = 0.0;
    public static final double kLiftHoldKd = 0.0;
    public static final double kLiftHoldLowPower = 0.0;
    public static final double kLiftHoldHighPower = 0.14;

    public static final double kTestVelTarget = 1700;
    public static final double kTestDistTarget = 50000;
    public static final double kTestVelError = 250;
    public static final double kTestDistError = 6000;
    
}
