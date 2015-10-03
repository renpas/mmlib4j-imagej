package mmlib4j;

import ij.IJ;
import ij.ImagePlus;
import mmlib4j.filtering.MorphologicalOperators;
import mmlib4j.imagej.filters.AbstractRadiusMorphologicalPlugin;
import mmlib4j.images.GrayScaleImage;
import mmlib4j.utils.AdjacencyRelation;

/**
 * MMLib4J - Mathematical Morphology Library for Java 
 * @author Wonder Alexandre Luz Alves
 *
 * Graphic User Interface by ImageJ
 */
public class Morphological_gradient extends AbstractRadiusMorphologicalPlugin {
	
	@Override
	public String getPluginName() {
		return "Morphological Gradient";
	}
	
	@Override
	public GrayScaleImage filterImage(GrayScaleImage image) {
		return MorphologicalOperators.gradient(image, AdjacencyRelation.getCircular(getRadius()));
	}

	
	public static void main(String args[]){
		ImagePlus plus = IJ.openImage();
		Morphological_gradient plugin = new Morphological_gradient();
		plugin.setup(null, plus);
		plugin.run(plus.getProcessor());
	}
}