package assignment;

//Input for the decide function
public class Input {
    private int NUMPOINTS;
    private int[][] POINTS;
    private Parameters PARAMETERS;
    private Connect[][] LCM;
    private int[] PUV;

    public Input(int NUMPOINTS, int[][] POINTS, Parameters PARAMETERS, Connect[][] LCM, int[] PUV) {
        this.NUMPOINTS = NUMPOINTS;
        this.POINTS = POINTS;
        this.PARAMETERS = PARAMETERS;
        this.LCM = LCM;
        this.PUV = PUV;
    }

    public int getNUMPOINTS() {
        return NUMPOINTS;
    }

    public int[][] getPOINTS() {
        return POINTS;
    }

    public Parameters getPARAMETERS() {
        return PARAMETERS;
    }

    public Connect[][] getLCM() {
        return LCM;
    }

    public int[] getPUV() {
        return PUV;
    }
}