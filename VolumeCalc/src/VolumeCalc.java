
public class VolumeCalc {
	    public static void main(String[] args) {
	        double earthDiameter = 7600.0;
	        double sunDiameter = 865000.0;
	        double earthRadius = earthDiameter / 2.0;
	        double sunRadius = sunDiameter / 2.0;
	        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius, 3);
	        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius, 3);
	        double volumeRatio = volumeSun / volumeEarth;
	        System.out.println("The volume of the Earth is " + volumeEarth + " cubic miles, " +
	                           "the volume of the Sun is " + volumeSun + " cubic miles, " +
	                           "and the ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio + ".");
	    }
	}

