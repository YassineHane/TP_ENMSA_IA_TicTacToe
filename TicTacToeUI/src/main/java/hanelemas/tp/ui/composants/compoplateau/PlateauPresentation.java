package hanelemas.tp.ui.composants.compoplateau;

public class PlateauPresentation {
	private IPlateauPresentation maVue;
	
	public PlateauPresentation() {
		maVue = new PlateauVue(this);
	}
	
	public IPlateauPresentation getPlateauVue() {
		return maVue;
	}
}
