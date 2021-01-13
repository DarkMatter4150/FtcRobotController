package org.firstinspires.ftc.teamcode.drivecontrol;

public class Angle {
    public static final Angle
            RIGHT = new Angle(),
            LEFT = new Angle(),
            BACKWARD = new Angle(),
            FORWARD = new Angle();

    public enum AngleType {
        CARTESIAN_0_360, HEADING_0_360, CARTESIAN_N180_180, HEADING_N180_180
    }

    enum Direction {
        CLOCKWISE, COUNTER_CLOCKWISE
    }

    private double angle;
    private final AngleType type;

    public Angle(double a, AngleType t) {
        angle = a;
        type = t;

        angle = convertDoubleAngle(type);
    }

    public double getAngle() {
        return angle;
    }

    public double getAngle(AngleType type) {
        return convertAngle(type).getAngle();
    }

    public AngleType getType() {
        return type;
    }

    private Angle convertAngle(AngleType type) {
        return new old.Angle(convertAngleDouble(type), type);
    }

    private double convertAngleDouble(AngleType type) {

    }
}
