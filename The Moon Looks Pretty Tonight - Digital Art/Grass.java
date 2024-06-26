/**
PROGRAM: This program draws grass.

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

public class Grass implements DrawingObject {

    private double x;
    private double y;
    private double size;

    public Grass(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

	public void draw(Graphics2D g2d) {
      AffineTransform reset = g2d.getTransform();
      Color bleck = Color.BLACK;

      Path2D.Double grass = new Path2D.Double();
      grass.moveTo(x+(size/293)*1.0, y+(size/293)*118.468658);
      grass.curveTo(x+(size/293)*4.86671, y+(size/293)*120.995529, x+(size/293)*7.557237, y+(size/293)*125.055519, x+(size/293)*10.548982, y+(size/293)*128.807236);
      grass.curveTo(x+(size/293)*22.314844, y+(size/293)*143.56189, x+(size/293)*36.782265, y+(size/293)*153.690201, x+(size/293)*55.913795, y+(size/293)*156.307175);
      grass.curveTo(x+(size/293)*61.070843, y+(size/293)*157.012604, x+(size/293)*61.897236, y+(size/293)*156.5923, x+(size/293)*61.891914, y+(size/293)*151.481842);
      grass.curveTo(x+(size/293)*61.888954, y+(size/293)*148.641602, x+(size/293)*61.614227, y+(size/293)*145.84642, x+(size/293)*60.551811, y+(size/293)*143.15181);
      grass.curveTo(x+(size/293)*59.821587, y+(size/293)*141.299759, x+(size/293)*58.878876, y+(size/293)*139.108231, x+(size/293)*61.312805, y+(size/293)*137.885986);
      grass.curveTo(x+(size/293)*63.642479, y+(size/293)*136.71611, x+(size/293)*64.953522, y+(size/293)*138.564911, x+(size/293)*66.146202, y+(size/293)*140.245026);
      grass.curveTo(x+(size/293)*66.42717, y+(size/293)*140.640839, x+(size/293)*66.779427, y+(size/293)*140.986038, x+(size/293)*67.575699, y+(size/293)*141.904495);
      grass.curveTo(x+(size/293)*68.782707, y+(size/293)*139.090439, x+(size/293)*69.861626, y+(size/293)*136.591888, x+(size/293)*70.927208, y+(size/293)*134.087631);
      grass.curveTo(x+(size/293)*74.484177, y+(size/293)*125.728333, x+(size/293)*79.351501, y+(size/293)*118.210663, x+(size/293)*85.478165, y+(size/293)*111.512016);
      grass.curveTo(x+(size/293)*86.964081, y+(size/293)*109.887383, x+(size/293)*88.677216, y+(size/293)*108.041534, x+(size/293)*90.987396, y+(size/293)*109.801033);
      grass.curveTo(x+(size/293)*93.141731, y+(size/293)*111.441849, x+(size/293)*92.417625, y+(size/293)*113.749573, x+(size/293)*91.181335, y+(size/293)*115.658417);
      grass.curveTo(x+(size/293)*86.350426, y+(size/293)*123.117424, x+(size/293)*83.027336, y+(size/293)*131.194366, x+(size/293)*80.628487, y+(size/293)*139.65126);
      grass.curveTo(x+(size/293)*81.256004, y+(size/293)*139.979141, x+(size/293)*81.541626, y+(size/293)*140.259888, x+(size/293)*81.820976, y+(size/293)*140.253769);
      grass.curveTo(x+(size/293)*84.314941, y+(size/293)*140.199356, x+(size/293)*87.506348, y+(size/293)*138.128479, x+(size/293)*89.01545, y+(size/293)*141.2883);
      grass.curveTo(x+(size/293)*90.691536, y+(size/293)*144.797699, x+(size/293)*87.010284, y+(size/293)*146.064636, x+(size/293)*84.979561, y+(size/293)*147.797882);
      grass.curveTo(x+(size/293)*81.557602, y+(size/293)*150.718536, x+(size/293)*78.146538, y+(size/293)*153.591202, x+(size/293)*77.239861, y+(size/293)*159.030548);
      grass.curveTo(x+(size/293)*86.071869, y+(size/293)*160.902863, x+(size/293)*94.683853, y+(size/293)*162.789551, x+(size/293)*104.37896, y+(size/293)*162.762421);
      grass.curveTo(x+(size/293)*103.225662, y+(size/293)*157.24971, x+(size/293)*101.310883, y+(size/293)*152.442841, x+(size/293)*101.133125, y+(size/293)*147.341949);
      grass.curveTo(x+(size/293)*101.069702, y+(size/293)*145.521896, x+(size/293)*100.652824, y+(size/293)*143.655807, x+(size/293)*100.935951, y+(size/293)*141.897446);
      grass.curveTo(x+(size/293)*101.259499, y+(size/293)*139.888016, x+(size/293)*101.277473, y+(size/293)*137.174789, x+(size/293)*104.170464, y+(size/293)*136.955078);
      grass.curveTo(x+(size/293)*107.032837, y+(size/293)*136.737671, x+(size/293)*107.483749, y+(size/293)*139.290771, x+(size/293)*108.151703, y+(size/293)*141.301636);
      grass.curveTo(x+(size/293)*108.616272, y+(size/293)*142.700195, x+(size/293)*108.805092, y+(size/293)*144.190369, x+(size/293)*109.38501, y+(size/293)*145.638657);
      grass.curveTo(x+(size/293)*109.392998, y+(size/293)*140.908447, x+(size/293)*109.893845, y+(size/293)*136.257843, x+(size/293)*110.759155, y+(size/293)*131.646393);
      grass.curveTo(x+(size/293)*111.149719, y+(size/293)*129.565018, x+(size/293)*111.009171, y+(size/293)*126.89357, x+(size/293)*113.805275, y+(size/293)*126.563454);
      grass.curveTo(x+(size/293)*116.864746, y+(size/293)*126.202232, x+(size/293)*116.863029, y+(size/293)*128.957886, x+(size/293)*117.405205, y+(size/293)*130.986542);
      grass.curveTo(x+(size/293)*119.600464, y+(size/293)*139.200531, x+(size/293)*121.222633, y+(size/293)*147.489105, x+(size/293)*121.394005, y+(size/293)*156.043411);
      grass.curveTo(x+(size/293)*121.535164, y+(size/293)*163.08905, x+(size/293)*123.405922, y+(size/293)*164.153534, x+(size/293)*130.986389, y+(size/293)*161.536118);
      grass.curveTo(x+(size/293)*129.116074, y+(size/293)*154.743546, x+(size/293)*126.331573, y+(size/293)*148.174164, x+(size/293)*125.183014, y+(size/293)*141.118134);
      grass.curveTo(x+(size/293)*122.469154, y+(size/293)*124.445908, x+(size/293)*123.239349, y+(size/293)*107.953514, x+(size/293)*127.106812, y+(size/293)*91.588661);
      grass.curveTo(x+(size/293)*127.796051, y+(size/293)*88.672226, x+(size/293)*128.515503, y+(size/293)*85.326279, x+(size/293)*132.707779, y+(size/293)*84.125107);
      grass.curveTo(x+(size/293)*137.672287, y+(size/293)*93.771141, x+(size/293)*136.348663, y+(size/293)*105.54126, x+(size/293)*143.481323, y+(size/293)*114.989304);
      grass.curveTo(x+(size/293)*145.877274, y+(size/293)*107.344978, x+(size/293)*145.739914, y+(size/293)*99.891251, x+(size/293)*146.658875, y+(size/293)*92.607307);
      grass.curveTo(x+(size/293)*147.281937, y+(size/293)*87.668709, x+(size/293)*147.821106, y+(size/293)*82.718338, x+(size/293)*148.533035, y+(size/293)*77.792786);
      grass.curveTo(x+(size/293)*148.770309, y+(size/293)*76.151253, x+(size/293)*149.341019, y+(size/293)*74.246277, x+(size/293)*151.34523, y+(size/293)*74.144211);
      grass.curveTo(x+(size/293)*153.474304, y+(size/293)*74.035774, x+(size/293)*153.83609, y+(size/293)*76.091064, x+(size/293)*154.285675, y+(size/293)*77.630058);
      grass.curveTo(x+(size/293)*157.549713, y+(size/293)*88.803482, x+(size/293)*160.103363, y+(size/293)*100.147957, x+(size/293)*162.330261, y+(size/293)*111.569366);
      grass.curveTo(x+(size/293)*162.832993, y+(size/293)*114.14782, x+(size/293)*163.418915, y+(size/293)*116.710037, x+(size/293)*164.069107, y+(size/293)*119.761032);
      grass.curveTo(x+(size/293)*166.356903, y+(size/293)*116.787476, x+(size/293)*166.408875, y+(size/293)*113.708031, x+(size/293)*167.306, y+(size/293)*110.929688);
      grass.curveTo(x+(size/293)*167.907059, y+(size/293)*109.068268, x+(size/293)*168.042221, y+(size/293)*106.648636, x+(size/293)*170.620804, y+(size/293)*106.51503);
      grass.curveTo(x+(size/293)*173.276474, y+(size/293)*106.377441, x+(size/293)*173.63858, y+(size/293)*108.797096, x+(size/293)*174.184387, y+(size/293)*110.650215);
      grass.curveTo(x+(size/293)*177.340393, y+(size/293)*121.365471, x+(size/293)*176.903763, y+(size/293)*132.370331, x+(size/293)*176.627197, y+(size/293)*143.347305);
      grass.curveTo(x+(size/293)*176.565002, y+(size/293)*145.815536, x+(size/293)*175.983948, y+(size/293)*148.279572, x+(size/293)*176.942688, y+(size/293)*151.323059);
      grass.curveTo(x+(size/293)*188.628006, y+(size/293)*149.257507, x+(size/293)*200.297974, y+(size/293)*147.194687, x+(size/293)*212.262787, y+(size/293)*145.079742);
      grass.curveTo(x+(size/293)*211.509796, y+(size/293)*136.148987, x+(size/293)*204.490356, y+(size/293)*129.217499, x+(size/293)*204.758102, y+(size/293)*119.674782);
      grass.curveTo(x+(size/293)*208.450714, y+(size/293)*121.043808, x+(size/293)*208.964172, y+(size/293)*124.263817, x+(size/293)*211.308884, y+(size/293)*126.423241);
      grass.curveTo(x+(size/293)*212.850082, y+(size/293)*118.699966, x+(size/293)*214.335068, y+(size/293)*111.195068, x+(size/293)*215.855881, y+(size/293)*103.697433);
      grass.curveTo(x+(size/293)*216.120026, y+(size/293)*102.395226, x+(size/293)*216.476151, y+(size/293)*101.103973, x+(size/293)*216.895508, y+(size/293)*99.842804);
      grass.curveTo(x+(size/293)*217.491852, y+(size/293)*98.049362, x+(size/293)*218.276459, y+(size/293)*96.108833, x+(size/293)*220.62706, y+(size/293)*96.685097);
      grass.curveTo(x+(size/293)*223.078735, y+(size/293)*97.286133, x+(size/293)*223.286331, y+(size/293)*99.323242, x+(size/293)*222.861267, y+(size/293)*101.49514);
      grass.curveTo(x+(size/293)*221.414902, y+(size/293)*108.885315, x+(size/293)*221.170105, y+(size/293)*116.364029, x+(size/293)*221.248306, y+(size/293)*123.865524);
      grass.curveTo(x+(size/293)*221.262146, y+(size/293)*125.194435, x+(size/293)*221.250259, y+(size/293)*126.523605, x+(size/293)*221.964691, y+(size/293)*128.138947);
      grass.curveTo(x+(size/293)*223.17511, y+(size/293)*125.607986, x+(size/293)*224.254562, y+(size/293)*123.002769, x+(size/293)*225.635101, y+(size/293)*120.568283);
      grass.curveTo(x+(size/293)*226.860153, y+(size/293)*118.40799, x+(size/293)*228.320328, y+(size/293)*116.358887, x+(size/293)*229.862686, y+(size/293)*114.407722);
      grass.curveTo(x+(size/293)*231.096786, y+(size/293)*112.846535, x+(size/293)*232.971039, y+(size/293)*111.953468, x+(size/293)*234.665939, y+(size/293)*113.346962);
      grass.curveTo(x+(size/293)*236.202118, y+(size/293)*114.60994, x+(size/293)*235.557693, y+(size/293)*116.429131, x+(size/293)*234.415009, y+(size/293)*117.82534);
      grass.curveTo(x+(size/293)*229.222412, y+(size/293)*124.169998, x+(size/293)*228.14151, y+(size/293)*132.027267, x+(size/293)*226.361252, y+(size/293)*139.621857);
      grass.curveTo(x+(size/293)*226.103104, y+(size/293)*140.723145, x+(size/293)*226.165588, y+(size/293)*141.899597, x+(size/293)*226.009811, y+(size/293)*143.969986);
      grass.curveTo(x+(size/293)*232.038574, y+(size/293)*143.969986, x+(size/293)*237.809692, y+(size/293)*143.986343, x+(size/293)*243.580643, y+(size/293)*143.96283);
      grass.curveTo(x+(size/293)*246.323135, y+(size/293)*143.95166, x+(size/293)*246.963913, y+(size/293)*142.297897, x+(size/293)*246.526581, y+(size/293)*139.944611);
      grass.curveTo(x+(size/293)*246.283524, y+(size/293)*138.63681, x+(size/293)*246.194321, y+(size/293)*137.212402, x+(size/293)*245.594208, y+(size/293)*136.073151);
      grass.curveTo(x+(size/293)*241.534409, y+(size/293)*128.365875, x+(size/293)*246.701324, y+(size/293)*123.231621, x+(size/293)*250.646194, y+(size/293)*117.814308);
      grass.curveTo(x+(size/293)*251.727982, y+(size/293)*116.328728, x+(size/293)*253.411469, y+(size/293)*115.190895, x+(size/293)*255.44339, y+(size/293)*115.974426);
      grass.curveTo(x+(size/293)*257.726288, y+(size/293)*116.854744, x+(size/293)*257.904663, y+(size/293)*118.919273, x+(size/293)*257.731415, y+(size/293)*120.990036);
      grass.curveTo(x+(size/293)*257.190674, y+(size/293)*127.452171, x+(size/293)*256.127533, y+(size/293)*133.864929, x+(size/293)*256.226532, y+(size/293)*140.38913);
      grass.curveTo(x+(size/293)*256.269287, y+(size/293)*143.207031, x+(size/293)*257.031586, y+(size/293)*144.623077, x+(size/293)*260.147827, y+(size/293)*144.796646);
      grass.curveTo(x+(size/293)*299.41925, y+(size/293)*146.984222, x+(size/293)*337.932373, y+(size/293)*154.886307, x+(size/293)*376.766968, y+(size/293)*160.375702);
      grass.curveTo(x+(size/293)*378.212463, y+(size/293)*160.580032, x+(size/293)*379.701141, y+(size/293)*161.100937, x+(size/293)*381.404175, y+(size/293)*159.626846);
      grass.curveTo(x+(size/293)*379.340698, y+(size/293)*154.222412, x+(size/293)*375.331177, y+(size/293)*149.959412, x+(size/293)*371.954132, y+(size/293)*145.329163);
      grass.curveTo(x+(size/293)*368.995972, y+(size/293)*141.273193, x+(size/293)*365.953766, y+(size/293)*137.304062, x+(size/293)*365.081451, y+(size/293)*132.183731);
      grass.curveTo(x+(size/293)*364.719055, y+(size/293)*130.056503, x+(size/293)*363.997223, y+(size/293)*127.614388, x+(size/293)*366.513062, y+(size/293)*126.424248);
      grass.curveTo(x+(size/293)*368.925171, y+(size/293)*125.283218, x+(size/293)*370.032654, y+(size/293)*127.546371, x+(size/293)*371.292572, y+(size/293)*129.016174);
      grass.curveTo(x+(size/293)*373.02655, y+(size/293)*131.039154, x+(size/293)*374.701202, y+(size/293)*133.112289, x+(size/293)*377.7995, y+(size/293)*134.341568);
      grass.curveTo(x+(size/293)*376.511169, y+(size/293)*125.933319, x+(size/293)*372.079895, y+(size/293)*118.371811, x+(size/293)*373.459229, y+(size/293)*109.568489);
      grass.curveTo(x+(size/293)*380.97467, y+(size/293)*115.074509, x+(size/293)*382.60965, y+(size/293)*124.577179, x+(size/293)*388.788147, y+(size/293)*132.257645);
      grass.curveTo(x+(size/293)*389.118805, y+(size/293)*126.875488, x+(size/293)*389.62616, y+(size/293)*122.475159, x+(size/293)*389.613434, y+(size/293)*118.076332);
      grass.curveTo(x+(size/293)*389.579742, y+(size/293)*106.429733, x+(size/293)*392.419678, y+(size/293)*95.346001, x+(size/293)*395.838776, y+(size/293)*84.36113);
      grass.curveTo(x+(size/293)*396.387238, y+(size/293)*82.599136, x+(size/293)*397.237061, y+(size/293)*80.664482, x+(size/293)*399.621002, y+(size/293)*81.291679);
      grass.curveTo(x+(size/293)*401.562317, y+(size/293)*81.802414, x+(size/293)*402.039093, y+(size/293)*83.597549, x+(size/293)*401.621613, y+(size/293)*85.337265);
      grass.curveTo(x+(size/293)*398.283508, y+(size/293)*99.248421, x+(size/293)*403.429962, y+(size/293)*112.321312, x+(size/293)*405.727448, y+(size/293)*125.625305);
      grass.curveTo(x+(size/293)*407.791107, y+(size/293)*137.575256, x+(size/293)*410.958954, y+(size/293)*149.312851, x+(size/293)*414.141785, y+(size/293)*161.031479);
      grass.curveTo(x+(size/293)*415.139923, y+(size/293)*164.706436, x+(size/293)*416.531799, y+(size/293)*166.472565, x+(size/293)*420.602356, y+(size/293)*167.061905);
      grass.curveTo(x+(size/293)*445.776581, y+(size/293)*170.706604, x+(size/293)*470.8909, y+(size/293)*174.76329, x+(size/293)*496.048431, y+(size/293)*178.527069);
      grass.curveTo(x+(size/293)*502.620361, y+(size/293)*179.510269, x+(size/293)*509.270874, y+(size/293)*179.987045, x+(size/293)*515.89502, y+(size/293)*180.588989);
      grass.curveTo(x+(size/293)*517.531494, y+(size/293)*180.737701, x+(size/293)*519.366943, y+(size/293)*180.884216, x+(size/293)*520.837036, y+(size/293)*180.319229);
      grass.curveTo(x+(size/293)*529.851257, y+(size/293)*176.854965, x+(size/293)*538.783936, y+(size/293)*173.179001, x+(size/293)*547.750732, y+(size/293)*169.590683);
      grass.curveTo(x+(size/293)*549.632141, y+(size/293)*168.837753, x+(size/293)*550.078552, y+(size/293)*167.304031, x+(size/293)*549.954163, y+(size/293)*165.539062);
      grass.curveTo(x+(size/293)*549.653137, y+(size/293)*161.268723, x+(size/293)*550.210083, y+(size/293)*156.879349, x+(size/293)*547.645935, y+(size/293)*152.955978);
      grass.curveTo(x+(size/293)*546.362793, y+(size/293)*150.992706, x+(size/293)*546.127136, y+(size/293)*148.574493, x+(size/293)*548.698486, y+(size/293)*147.402435);
      grass.curveTo(x+(size/293)*551.278076, y+(size/293)*146.226593, x+(size/293)*552.841125, y+(size/293)*148.183594, x+(size/293)*553.696106, y+(size/293)*150.241608);
      grass.curveTo(x+(size/293)*554.850769, y+(size/293)*153.020935, x+(size/293)*556.167419, y+(size/293)*155.67215, x+(size/293)*558.103638, y+(size/293)*158.521835);
      grass.curveTo(x+(size/293)*558.94574, y+(size/293)*153.413528, x+(size/293)*559.870361, y+(size/293)*148.668488, x+(size/293)*560.482361, y+(size/293)*143.883453);
      grass.curveTo(x+(size/293)*561.33136, y+(size/293)*137.245926, x+(size/293)*564.235291, y+(size/293)*131.498291, x+(size/293)*567.853027, y+(size/293)*126.056358);
      grass.curveTo(x+(size/293)*569.149841, y+(size/293)*124.105721, x+(size/293)*570.173584, y+(size/293)*120.886551, x+(size/293)*573.383301, y+(size/293)*122.265465);
      grass.curveTo(x+(size/293)*576.368164, y+(size/293)*123.547798, x+(size/293)*575.327515, y+(size/293)*126.464661, x+(size/293)*574.830017, y+(size/293)*128.885651);
      grass.curveTo(x+(size/293)*573.224854, y+(size/293)*136.696777, x+(size/293)*571.519226, y+(size/293)*144.487701, x+(size/293)*569.967529, y+(size/293)*152.309265);
      grass.curveTo(x+(size/293)*567.698303, y+(size/293)*163.748276, x+(size/293)*568.373718, y+(size/293)*163.96701, x+(size/293)*579.774231, y+(size/293)*162.912994);
      grass.curveTo(x+(size/293)*594.05896, y+(size/293)*161.5923, x+(size/293)*605.741882, y+(size/293)*153.918747, x+(size/293)*618.394897, y+(size/293)*148.569458);
      grass.curveTo(x+(size/293)*620.983765, y+(size/293)*147.47496, x+(size/293)*620.995605, y+(size/293)*145.266953, x+(size/293)*620.650024, y+(size/293)*143.090332);
      grass.curveTo(x+(size/293)*619.376953, y+(size/293)*135.072342, x+(size/293)*620.477295, y+(size/293)*127.180084, x+(size/293)*621.706116, y+(size/293)*119.285339);
      grass.curveTo(x+(size/293)*621.859497, y+(size/293)*118.300163, x+(size/293)*621.982117, y+(size/293)*117.299706, x+(size/293)*622.257812, y+(size/293)*116.346451);
      grass.curveTo(x+(size/293)*622.720947, y+(size/293)*114.744804, x+(size/293)*623.146973, y+(size/293)*112.900833, x+(size/293)*625.313416, y+(size/293)*112.977745);
      grass.curveTo(x+(size/293)*627.650024, y+(size/293)*113.060699, x+(size/293)*628.072571, y+(size/293)*114.786674, x+(size/293)*628.362549, y+(size/293)*116.786064);
      grass.curveTo(x+(size/293)*629.528625, y+(size/293)*124.82753, x+(size/293)*631.132507, y+(size/293)*132.779861, x+(size/293)*633.510315, y+(size/293)*140.560516);
      grass.curveTo(x+(size/293)*635.451965, y+(size/293)*140.422592, x+(size/293)*635.388184, y+(size/293)*139.041534, x+(size/293)*635.584229, y+(size/293)*138.025482);
      grass.curveTo(x+(size/293)*638.741577, y+(size/293)*121.657661, x+(size/293)*637.911133, y+(size/293)*105.290649, x+(size/293)*635.425415, y+(size/293)*88.941872);
      grass.curveTo(x+(size/293)*635.125122, y+(size/293)*86.966194, x+(size/293)*635.077271, y+(size/293)*85.072662, x+(size/293)*637.076172, y+(size/293)*84.226479);
      grass.curveTo(x+(size/293)*639.48114, y+(size/293)*83.208359, x+(size/293)*640.771545, y+(size/293)*84.92762, x+(size/293)*641.657654, y+(size/293)*86.874886);
      grass.curveTo(x+(size/293)*642.734863, y+(size/293)*89.242386, x+(size/293)*643.107361, y+(size/293)*92.004128, x+(size/293)*645.508789, y+(size/293)*93.709862);
      grass.curveTo(x+(size/293)*647.476562, y+(size/293)*92.374748, x+(size/293)*648.134277, y+(size/293)*90.231468, x+(size/293)*649.165955, y+(size/293)*88.380028);
      grass.curveTo(x+(size/293)*650.327881, y+(size/293)*86.294647, x+(size/293)*651.758057, y+(size/293)*84.499748, x+(size/293)*653.812683, y+(size/293)*83.26619);
      grass.curveTo(x+(size/293)*655.545532, y+(size/293)*82.225822, x+(size/293)*657.383728, y+(size/293)*81.035782, x+(size/293)*659.25, y+(size/293)*82.856064);
      grass.curveTo(x+(size/293)*660.819275, y+(size/293)*84.38665, x+(size/293)*660.48938, y+(size/293)*86.339165, x+(size/293)*659.454773, y+(size/293)*87.930344);
      grass.curveTo(x+(size/293)*650.12915, y+(size/293)*102.273781, x+(size/293)*653.488831, y+(size/293)*118.097794, x+(size/293)*653.966003, y+(size/293)*133.601929);
      grass.curveTo(x+(size/293)*654.080627, y+(size/293)*137.323608, x+(size/293)*656.083801, y+(size/293)*138.013474, x+(size/293)*659.234009, y+(size/293)*137.534561);
      grass.curveTo(x+(size/293)*689.516602, y+(size/293)*132.930756, x+(size/293)*720.08551, y+(size/293)*131.281677, x+(size/293)*750.549927, y+(size/293)*128.510941);
      grass.curveTo(x+(size/293)*764.788025, y+(size/293)*127.215981, x+(size/293)*779.06311, y+(size/293)*126.209381, x+(size/293)*793.260681, y+(size/293)*124.542099);
      grass.curveTo(x+(size/293)*800.407043, y+(size/293)*123.702873, x+(size/293)*806.791809, y+(size/293)*119.992371, x+(size/293)*813.469482, y+(size/293)*117.46167);
      grass.curveTo(x+(size/293)*827.331726, y+(size/293)*112.208138, x+(size/293)*841.035095, y+(size/293)*106.574623, x+(size/293)*854.221008, y+(size/293)*99.730988);
      grass.curveTo(x+(size/293)*857.771179, y+(size/293)*97.888382, x+(size/293)*858.638123, y+(size/293)*96.063271, x+(size/293)*856.613159, y+(size/293)*92.368317);
      grass.curveTo(x+(size/293)*853.014282, y+(size/293)*85.801384, x+(size/293)*849.823669, y+(size/293)*79.006851, x+(size/293)*846.58667, y+(size/293)*72.247932);
      grass.curveTo(x+(size/293)*845.627136, y+(size/293)*70.24437, x+(size/293)*843.951721, y+(size/293)*67.698997, x+(size/293)*846.813171, y+(size/293)*66.103935);
      grass.curveTo(x+(size/293)*849.277893, y+(size/293)*64.730019, x+(size/293)*850.69519, y+(size/293)*67.028625, x+(size/293)*851.993469, y+(size/293)*68.777214);
      grass.curveTo(x+(size/293)*855.239441, y+(size/293)*73.148819, x+(size/293)*858.471375, y+(size/293)*77.530785, x+(size/293)*862.516357, y+(size/293)*83.00042);
      grass.curveTo(x+(size/293)*864.03894, y+(size/293)*74.919861, x+(size/293)*864.985413, y+(size/293)*67.917007, x+(size/293)*866.71698, y+(size/293)*61.113995);
      grass.curveTo(x+(size/293)*870.486633, y+(size/293)*46.304127, x+(size/293)*874.642334, y+(size/293)*31.592253, x+(size/293)*878.687622, y+(size/293)*16.853338);
      grass.curveTo(x+(size/293)*879.034851, y+(size/293)*15.588085, x+(size/293)*879.639282, y+(size/293)*14.364799, x+(size/293)*880.297302, y+(size/293)*13.221653);
      grass.curveTo(x+(size/293)*880.932129, y+(size/293)*12.118827, x+(size/293)*882.051453, y+(size/293)*11.673447, x+(size/293)*883.308105, y+(size/293)*11.953195);
      grass.curveTo(x+(size/293)*884.617859, y+(size/293)*12.244745, x+(size/293)*885.17688, y+(size/293)*13.249891, x+(size/293)*885.333923, y+(size/293)*14.503291);
      grass.curveTo(x+(size/293)*885.587219, y+(size/293)*16.524542, x+(size/293)*885.263245, y+(size/293)*18.460762, x+(size/293)*884.634949, y+(size/293)*20.400015);
      grass.curveTo(x+(size/293)*882.70575, y+(size/293)*26.354746, x+(size/293)*881.645325, y+(size/293)*32.484608, x+(size/293)*881.402771, y+(size/293)*38.829739);
      grass.curveTo(x+(size/293)*885.266479, y+(size/293)*29.875072, x+(size/293)*889.107117, y+(size/293)*20.910324, x+(size/293)*893.010742, y+(size/293)*11.973076);
      grass.curveTo(x+(size/293)*893.942932, y+(size/293)*9.838999, x+(size/293)*895.008789, y+(size/293)*7.753408, x+(size/293)*896.156433, y+(size/293)*5.726667);
      grass.curveTo(x+(size/293)*896.982178, y+(size/293)*4.268501, x+(size/293)*898.058472, y+(size/293)*2.717072, x+(size/293)*900.059326, y+(size/293)*3.38856);
      grass.curveTo(x+(size/293)*902.167603, y+(size/293)*4.096083, x+(size/293)*902.48999, y+(size/293)*6.006367, x+(size/293)*902.230469, y+(size/293)*7.927075);
      grass.curveTo(x+(size/293)*901.803101, y+(size/293)*11.089098, x+(size/293)*900.805847, y+(size/293)*14.097075, x+(size/293)*899.151611, y+(size/293)*16.836565);
      grass.curveTo(x+(size/293)*888.561707, y+(size/293)*34.37339, x+(size/293)*884.80542, y+(size/293)*53.934048, x+(size/293)*882.379822, y+(size/293)*73.855286);
      grass.curveTo(x+(size/293)*881.928284, y+(size/293)*77.563171, x+(size/293)*880.461609, y+(size/293)*81.324631, x+(size/293)*882.227478, y+(size/293)*85.912849);
      grass.curveTo(x+(size/293)*913.968872, y+(size/293)*73.360092, x+(size/293)*945.788086, y+(size/293)*61.332294, x+(size/293)*976.670776, y+(size/293)*46.117668);
      grass.curveTo(x+(size/293)*977.0, y+(size/293)*110.927574, x+(size/293)*977.0, y+(size/293)*175.855148, x+(size/293)*977.0, y+(size/293)*241.0);
      grass.curveTo(x+(size/293)*911.312622, y+(size/293)*241.0, x+(size/293)*845.624939, y+(size/293)*241.0, x+(size/293)*779.742554, y+(size/293)*240.838959);
      grass.curveTo(x+(size/293)*780.745239, y+(size/293)*240.320572, x+(size/293)*781.942749, y+(size/293)*239.963226, x+(size/293)*784.13092, y+(size/293)*239.310257);
      grass.curveTo(x+(size/293)*780.641663, y+(size/293)*238.611526, x+(size/293)*779.509888, y+(size/293)*236.667389, x+(size/293)*779.62384, y+(size/293)*234.400345);
      grass.curveTo(x+(size/293)*779.950317, y+(size/293)*227.901596, x+(size/293)*787.289124, y+(size/293)*230.294388, x+(size/293)*790.053528, y+(size/293)*226.492889);
      grass.curveTo(x+(size/293)*788.348267, y+(size/293)*220.788574, x+(size/293)*783.402527, y+(size/293)*220.408386, x+(size/293)*778.859802, y+(size/293)*220.191177);
      grass.curveTo(x+(size/293)*761.300415, y+(size/293)*219.351593, x+(size/293)*744.876343, y+(size/293)*223.824524, x+(size/293)*729.434021, y+(size/293)*231.900681);
      grass.curveTo(x+(size/293)*725.670532, y+(size/293)*233.868942, x+(size/293)*722.499207, y+(size/293)*236.969482, x+(size/293)*718.882751, y+(size/293)*239.678864);
      grass.curveTo(x+(size/293)*722.414795, y+(size/293)*240.532837, x+(size/293)*725.892212, y+(size/293)*239.333572, x+(size/293)*729.0, y+(size/293)*241.0);
      grass.curveTo(x+(size/293)*486.333313, y+(size/293)*241.0, x+(size/293)*243.666656, y+(size/293)*241.0, x+(size/293)*1.0, y+(size/293)*241.0);
      grass.curveTo(x+(size/293)*1.0, y+(size/293)*200.228867, x+(size/293)*1.0, y+(size/293)*159.583099, x+(size/293)*1.0, y+(size/293)*118.468658);
      grass.closePath();
      g2d.translate(-360,285);
      g2d.setColor(bleck);
      g2d.draw(grass);
      g2d.fill(grass);
      g2d.setTransform(reset);
    }

}

// path resources from https://www.adobe.com/express/feature/image/convert/svg