/**
PROGRAM: This program draws the people in the GUI.

@author Albert Gabriel P. Abdon (220028)
@version March 9, 2023
**/
/*
I have not discussed the Java language code in my program 
with anyone other than my instructor or the teaching assistants 
assigned to this course.
I have not used Java language code obtained from another student, 
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program 
was obtained from another source, such as a textbook or website, 
that has been clearly noted with a proper citation in the comments 
of my program.
*/

import java.awt.*;
import java.awt.geom.*;

public class Mobu implements DrawingObject {

    private double x;
    private double y;
    private double size;

    public Mobu(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();

      Color bleck = Color.BLACK;

      Path2D.Double mobu = new Path2D.Double();

      mobu.moveTo(x+(size/500)*1.0, y+(size/500)*652.468628);
      mobu.curveTo(x+(size/500)*43.325108, y+(size/500)*651.946228, x+(size/500)*85.650307, y+(size/500)*651.918457, x+(size/500)*127.975098, y+(size/500)*651.772827);
      mobu.curveTo(x+(size/500)*130.46965, y+(size/500)*651.764221, x+(size/500)*134.069122, y+(size/500)*653.26123, x+(size/500)*134.863144, y+(size/500)*648.937378);
      mobu.curveTo(x+(size/500)*135.569336, y+(size/500)*645.091797, x+(size/500)*133.200638, y+(size/500)*643.634216, x+(size/500)*130.321762, y+(size/500)*641.30188);
      
      mobu.curveTo(x+(size/500)*124.585175, y+(size/500)*636.654419, x+(size/500)*119.877968, y+(size/500)*630.910706, x+(size/500)*118.935448, y+(size/500)*622.658264);
      mobu.curveTo(x+(size/500)*116.774704, y+(size/500)*603.739197, x+(size/500)*118.689133, y+(size/500)*585.08667, x+(size/500)*121.846054, y+(size/500)*566.533997);
      mobu.curveTo(x+(size/500)*125.887627, y+(size/500)*542.78241, x+(size/500)*129.493271, y+(size/500)*518.969971, x+(size/500)*133.048203, y+(size/500)*495.144684);
      mobu.curveTo(x+(size/500)*134.688797, y+(size/500)*484.149261, x+(size/500)*136.896805, y+(size/500)*473.2388, x+(size/500)*138.561462, y+(size/500)*462.24649);
      mobu.curveTo(x+(size/500)*139.051498, y+(size/500)*459.010559, x+(size/500)*140.776016, y+(size/500)*457.202789, x+(size/500)*143.317871, y+(size/500)*455.756561);
      mobu.curveTo(x+(size/500)*148.087067, y+(size/500)*453.042999, x+(size/500)*153.159393, y+(size/500)*450.947083, x+(size/500)*158.357819, y+(size/500)*449.310394);
      mobu.curveTo(x+(size/500)*166.785782, y+(size/500)*446.656952, x+(size/500)*173.597, y+(size/500)*441.323273, x+(size/500)*181.211182, y+(size/500)*436.666443);
      mobu.curveTo(x+(size/500)*178.878601, y+(size/500)*431.317535, x+(size/500)*178.120804, y+(size/500)*425.922882, x+(size/500)*172.131775, y+(size/500)*422.592407);
      mobu.curveTo(x+(size/500)*166.212784, y+(size/500)*419.300934, x+(size/500)*161.616562, y+(size/500)*410.932159, x+(size/500)*165.099091, y+(size/500)*402.698303);
      mobu.curveTo(x+(size/500)*167.563171, y+(size/500)*396.872437, x+(size/500)*165.301437, y+(size/500)*391.457642, x+(size/500)*160.317505, y+(size/500)*389.091919);
      mobu.curveTo(x+(size/500)*162.40802, y+(size/500)*383.929596, x+(size/500)*160.135468, y+(size/500)*380.931763, x+(size/500)*154.947266, y+(size/500)*379.294769);
      mobu.curveTo(x+(size/500)*153.073257, y+(size/500)*378.703461, x+(size/500)*152.412003, y+(size/500)*376.732422, x+(size/500)*153.552948, y+(size/500)*374.706207);
      mobu.curveTo(x+(size/500)*153.716446, y+(size/500)*374.415833, x+(size/500)*153.851379, y+(size/500)*374.103241, x+(size/500)*154.051376, y+(size/500)*373.840393);
      mobu.curveTo(x+(size/500)*158.69281, y+(size/500)*367.740601, x+(size/500)*159.929245, y+(size/500)*361.226807, x+(size/500)*156.653976, y+(size/500)*354.05603);
      mobu.curveTo(x+(size/500)*154.971924, y+(size/500)*350.373383, x+(size/500)*155.865341, y+(size/500)*347.98465, x+(size/500)*159.501785, y+(size/500)*345.405792);
      mobu.curveTo(x+(size/500)*167.069565, y+(size/500)*340.03891, x+(size/500)*172.87735, y+(size/500)*332.507874, x+(size/500)*180.703964, y+(size/500)*327.313263);
      mobu.curveTo(x+(size/500)*188.939163, y+(size/500)*321.847473, x+(size/500)*197.684769, y+(size/500)*318.428131, x+(size/500)*207.750076, y+(size/500)*318.593323);
      mobu.curveTo(x+(size/500)*217.723389, y+(size/500)*318.757019, x+(size/500)*227.724014, y+(size/500)*318.045776, x+(size/500)*237.160507, y+(size/500)*322.536621);
      mobu.curveTo(x+(size/500)*240.668243, y+(size/500)*324.205902, x+(size/500)*244.217346, y+(size/500)*325.777679, x+(size/500)*246.642899, y+(size/500)*328.795746);
      mobu.curveTo(x+(size/500)*250.820984, y+(size/500)*333.994415, x+(size/500)*257.476837, y+(size/500)*336.493774, x+(size/500)*261.071716, y+(size/500)*342.208862);
      mobu.curveTo(x+(size/500)*265.059875, y+(size/500)*348.549103, x+(size/500)*268.431305, y+(size/500)*355.13678, x+(size/500)*268.278259, y+(size/500)*362.970398);
      mobu.curveTo(x+(size/500)*268.164368, y+(size/500)*368.800262, x+(size/500)*268.177979, y+(size/500)*374.635742, x+(size/500)*268.295593, y+(size/500)*380.465485);
      mobu.curveTo(x+(size/500)*268.344208, y+(size/500)*382.875763, x+(size/500)*268.353424, y+(size/500)*385.728333, x+(size/500)*266.787231, y+(size/500)*387.118317);
      mobu.curveTo(x+(size/500)*262.297119, y+(size/500)*391.103424, x+(size/500)*264.615784, y+(size/500)*395.038147, x+(size/500)*266.002563, y+(size/500)*399.145294);
      mobu.curveTo(x+(size/500)*268.593903, y+(size/500)*406.819916, x+(size/500)*265.190216, y+(size/500)*417.176056, x+(size/500)*257.974426, y+(size/500)*420.765472);
      mobu.curveTo(x+(size/500)*251.046921, y+(size/500)*424.211456, x+(size/500)*249.741898, y+(size/500)*431.324036, x+(size/500)*245.908783, y+(size/500)*436.763763);
      mobu.curveTo(x+(size/500)*244.777588, y+(size/500)*438.36908, x+(size/500)*246.319138, y+(size/500)*439.402313, x+(size/500)*247.89975, y+(size/500)*439.985382);
      mobu.curveTo(x+(size/500)*260.482086, y+(size/500)*444.626923, x+(size/500)*272.591949, y+(size/500)*450.419281, x+(size/500)*284.563721, y+(size/500)*456.353638);
      mobu.curveTo(x+(size/500)*291.817322, y+(size/500)*459.949188, x+(size/500)*296.172882, y+(size/500)*467.090149, x+(size/500)*296.23761, y+(size/500)*475.435211);
      mobu.curveTo(x+(size/500)*296.370117, y+(size/500)*492.512726, x+(size/500)*298.236572, y+(size/500)*509.49234, x+(size/500)*298.502472, y+(size/500)*526.570923);
      mobu.curveTo(x+(size/500)*298.655151, y+(size/500)*536.377258, x+(size/500)*301.035797, y+(size/500)*546.151917, x+(size/500)*302.456635, y+(size/500)*555.934631);
      mobu.curveTo(x+(size/500)*304.2052, y+(size/500)*567.973633, x+(size/500)*305.644989, y+(size/500)*579.826904, x+(size/500)*304.546326, y+(size/500)*592.248108);
      mobu.curveTo(x+(size/500)*303.623932, y+(size/500)*602.67627, x+(size/500)*303.859161, y+(size/500)*613.503967, x+(size/500)*304.753326, y+(size/500)*624.161682);
      mobu.curveTo(x+(size/500)*305.108917, y+(size/500)*628.399597, x+(size/500)*303.69696, y+(size/500)*631.954895, x+(size/500)*299.684723, y+(size/500)*635.511719);
      mobu.curveTo(x+(size/500)*296.945099, y+(size/500)*637.940308, x+(size/500)*291.918488, y+(size/500)*642.051453, x+(size/500)*293.281006, y+(size/500)*648.094543);
      mobu.curveTo(x+(size/500)*293.763306, y+(size/500)*650.233521, x+(size/500)*294.255035, y+(size/500)*651.516296, x+(size/500)*296.55954, y+(size/500)*651.516296);
      mobu.curveTo(x+(size/500)*308.849396, y+(size/500)*651.516479, x+(size/500)*321.139282, y+(size/500)*651.516418, x+(size/500)*334.387054, y+(size/500)*651.516418);
      mobu.curveTo(x+(size/500)*333.625488, y+(size/500)*643.991333, x+(size/500)*334.417389, y+(size/500)*637.607361, x+(size/500)*334.790771, y+(size/500)*631.22406);
      mobu.curveTo(x+(size/500)*335.238892, y+(size/500)*623.563354, x+(size/500)*337.45993, y+(size/500)*616.667969, x+(size/500)*340.292328, y+(size/500)*609.6745);
      mobu.curveTo(x+(size/500)*344.820618, y+(size/500)*598.493774, x+(size/500)*350.0896, y+(size/500)*587.466553, x+(size/500)*350.833557, y+(size/500)*575.117004);
      mobu.curveTo(x+(size/500)*351.088196, y+(size/500)*570.889343, x+(size/500)*349.313568, y+(size/500)*567.109436, x+(size/500)*348.276001, y+(size/500)*563.120605);
      mobu.curveTo(x+(size/500)*346.075958, y+(size/500)*554.662964, x+(size/500)*341.834229, y+(size/500)*546.797363, x+(size/500)*341.017395, y+(size/500)*537.966797);
      mobu.curveTo(x+(size/500)*340.926117, y+(size/500)*536.979492, x+(size/500)*340.944336, y+(size/500)*535.856628, x+(size/500)*340.476227, y+(size/500)*535.049194);
      mobu.curveTo(x+(size/500)*336.239319, y+(size/500)*527.740906, x+(size/500)*337.479065, y+(size/500)*519.611755, x+(size/500)*336.490631, y+(size/500)*511.75882);
      mobu.curveTo(x+(size/500)*335.101624, y+(size/500)*500.723602, x+(size/500)*334.765076, y+(size/500)*489.546844, x+(size/500)*330.760803, y+(size/500)*478.75647);
      mobu.curveTo(x+(size/500)*326.979462, y+(size/500)*468.566956, x+(size/500)*327.46991, y+(size/500)*457.622894, x+(size/500)*333.608765, y+(size/500)*448.197754);
      mobu.curveTo(x+(size/500)*336.402344, y+(size/500)*443.908722, x+(size/500)*340.865509, y+(size/500)*440.319, x+(size/500)*345.291534, y+(size/500)*437.572723);
      mobu.curveTo(x+(size/500)*351.851898, y+(size/500)*433.502167, x+(size/500)*350.838531, y+(size/500)*428.175079, x+(size/500)*349.244568, y+(size/500)*422.449341);
      mobu.curveTo(x+(size/500)*346.365295, y+(size/500)*412.106384, x+(size/500)*347.164551, y+(size/500)*401.680634, x+(size/500)*348.735199, y+(size/500)*391.329468);
      mobu.curveTo(x+(size/500)*349.977203, y+(size/500)*383.144318, x+(size/500)*352.697327, y+(size/500)*375.183228, x+(size/500)*352.10968, y+(size/500)*366.736053);
      mobu.curveTo(x+(size/500)*351.28067, y+(size/500)*354.82019, x+(size/500)*353.702759, y+(size/500)*343.312408, x+(size/500)*356.491089, y+(size/500)*331.835205);
      mobu.curveTo(x+(size/500)*358.113556, y+(size/500)*325.156982, x+(size/500)*361.945221, y+(size/500)*319.7258, x+(size/500)*366.1716, y+(size/500)*314.631622);
      mobu.curveTo(x+(size/500)*370.735291, y+(size/500)*309.130829, x+(size/500)*375.092743, y+(size/500)*303.5271, x+(size/500)*379.299255, y+(size/500)*297.740784);
      mobu.curveTo(x+(size/500)*382.951416, y+(size/500)*292.717041, x+(size/500)*389.019745, y+(size/500)*290.677216, x+(size/500)*395.097748, y+(size/500)*289.392334);
      mobu.curveTo(x+(size/500)*407.508972, y+(size/500)*286.768646, x+(size/500)*420.181458, y+(size/500)*286.036652, x+(size/500)*432.038452, y+(size/500)*290.463501);
      mobu.curveTo(x+(size/500)*443.370056, y+(size/500)*294.694153, x+(size/500)*453.824921, y+(size/500)*301.222046, x+(size/500)*461.072144, y+(size/500)*311.490051);
      mobu.curveTo(x+(size/500)*465.58374, y+(size/500)*317.882141, x+(size/500)*465.697479, y+(size/500)*325.577148, x+(size/500)*466.097015, y+(size/500)*332.968018);
      mobu.curveTo(x+(size/500)*466.600189, y+(size/500)*342.275909, x+(size/500)*466.447601, y+(size/500)*351.619415, x+(size/500)*466.565338, y+(size/500)*360.947723);
      mobu.curveTo(x+(size/500)*466.575836, y+(size/500)*361.777069, x+(size/500)*466.713928, y+(size/500)*362.696289, x+(size/500)*466.421173, y+(size/500)*363.424377);
      mobu.curveTo(x+(size/500)*461.39151, y+(size/500)*375.934021, x+(size/500)*463.040863, y+(size/500)*389.244385, x+(size/500)*462.11676, y+(size/500)*402.185577);
      mobu.curveTo(x+(size/500)*461.56073, y+(size/500)*409.971985, x+(size/500)*463.40918, y+(size/500)*417.180817, x+(size/500)*470.728546, y+(size/500)*423.035706);
      mobu.curveTo(x+(size/500)*478.315338, y+(size/500)*429.104523, x+(size/500)*485.685028, y+(size/500)*436.264496, x+(size/500)*488.185791, y+(size/500)*446.669861);
      mobu.curveTo(x+(size/500)*489.519196, y+(size/500)*452.217865, x+(size/500)*489.920044, y+(size/500)*457.816223, x+(size/500)*490.114594, y+(size/500)*463.427612);
      mobu.curveTo(x+(size/500)*490.380005, y+(size/500)*471.08374, x+(size/500)*490.078674, y+(size/500)*478.758026, x+(size/500)*490.246674, y+(size/500)*486.419586);
      mobu.curveTo(x+(size/500)*490.369141, y+(size/500)*492.004181, x+(size/500)*489.744232, y+(size/500)*497.38028, x+(size/500)*487.053528, y+(size/500)*502.342255);
      mobu.curveTo(x+(size/500)*484.211365, y+(size/500)*507.583527, x+(size/500)*482.954529, y+(size/500)*513.043579, x+(size/500)*483.169434, y+(size/500)*519.08728);
      mobu.curveTo(x+(size/500)*483.341644, y+(size/500)*523.930054, x+(size/500)*480.957855, y+(size/500)*528.36377, x+(size/500)*479.175995, y+(size/500)*532.832642);
      mobu.curveTo(x+(size/500)*476.770447, y+(size/500)*538.865784, x+(size/500)*476.10257, y+(size/500)*545.122864, x+(size/500)*475.586426, y+(size/500)*551.63855);
      mobu.curveTo(x+(size/500)*474.954773, y+(size/500)*559.612427, x+(size/500)*473.495026, y+(size/500)*567.866516, x+(size/500)*469.540588, y+(size/500)*575.058655);
      mobu.curveTo(x+(size/500)*466.676117, y+(size/500)*580.268372, x+(size/500)*467.920105, y+(size/500)*584.620056, x+(size/500)*470.60556, y+(size/500)*589.024597);
      mobu.curveTo(x+(size/500)*474.757355, y+(size/500)*595.83429, x+(size/500)*479.12442, y+(size/500)*602.512451, x+(size/500)*483.310699, y+(size/500)*609.301575);
      mobu.curveTo(x+(size/500)*484.292816, y+(size/500)*610.894287, x+(size/500)*485.953064, y+(size/500)*612.667175, x+(size/500)*483.454987, y+(size/500)*614.475952);
      mobu.curveTo(x+(size/500)*482.377594, y+(size/500)*615.256042, x+(size/500)*482.723358, y+(size/500)*616.310059, x+(size/500)*483.305756, y+(size/500)*617.127258);
      mobu.curveTo(x+(size/500)*489.391998, y+(size/500)*625.66687, x+(size/500)*489.726013, y+(size/500)*635.431519, x+(size/500)*489.14032, y+(size/500)*645.301758);
      mobu.curveTo(x+(size/500)*488.872833, y+(size/500)*649.809082, x+(size/500)*490.670532, y+(size/500)*650.938965, x+(size/500)*494.93396, y+(size/500)*650.926941);
      mobu.curveTo(x+(size/500)*555.921814, y+(size/500)*650.754395, x+(size/500)*616.910095, y+(size/500)*650.732117, x+(size/500)*677.898254, y+(size/500)*650.643433);
      mobu.curveTo(x+(size/500)*681.383118, y+(size/500)*650.638367, x+(size/500)*684.867554, y+(size/500)*650.372437, x+(size/500)*688.676147, y+(size/500)*650.114014);
      mobu.curveTo(x+(size/500)*689.0, y+(size/500)*678.985229, x+(size/500)*689.0, y+(size/500)*707.97052, x+(size/500)*689.0, y+(size/500)*736.951538);
      mobu.curveTo(x+(size/500)*459.666656, y+(size/500)*736.947327, x+(size/500)*230.333328, y+(size/500)*736.947327, x+(size/500)*1.0, y+(size/500)*736.947327);
      mobu.curveTo(x+(size/500)*1.0, y+(size/500)*708.908875, x+(size/500)*1.0, y+(size/500)*680.923096, x+(size/500)*1.0, y+(size/500)*652.468628);

      mobu.closePath();
      g2d.translate(-50,50);
      g2d.setColor(bleck);
      g2d.fill(mobu);
      g2d.setTransform(reset);
      
    }
}

// path resources from https://www.adobe.com/express/feature/image/convert/svg