package mmlib4j;



import mmlib4j.filtering.MorphologicalOperators;
import mmlib4j.imagej.filters.AbstractFilterPlugin;
import mmlib4j.imagej.filters.annotations.NumericParameter;
import mmlib4j.imagej.filters.annotations.Plugin;
import mmlib4j.images.GrayScaleImage;
import mmlib4j.utils.AdjacencyRelation;

/**
 * MMLib4J - Mathematical Morphology Library for Java 
 * @author Wonder Alexandre Luz Alves
 *
 * Graphic User Interface by ImageJ
 */

@Plugin(name = "White top-hat")
public class White_TopHat extends AbstractFilterPlugin {
	
	@NumericParameter(name="Radius", defaultValue=5D)
	private double radius;
		
	@Override
	public GrayScaleImage filterImage(GrayScaleImage image) {
		return MorphologicalOperators.openingTopHat(image, AdjacencyRelation.getCircular(radius));
	}

}
