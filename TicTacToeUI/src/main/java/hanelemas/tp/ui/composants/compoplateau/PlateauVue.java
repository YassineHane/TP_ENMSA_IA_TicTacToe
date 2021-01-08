package hanelemas.tp.ui.composants.compoplateau;

import hanelemas.tp.ui.composants.compocase.CasePresentation;
import hanelemas.tp.ui.composants.compocase.CaseVue;
import javafx.scene.layout.GridPane;

public class PlateauVue extends GridPane implements IPlateauPresentation  {
	private PlateauPresentation maPresentation;
	
	
	public PlateauVue(PlateauPresentation p) {
		super();
		for (int i = 0; i<3; i++) {
			for (int j = 0; j < 3; j++) {
				CasePresentation uneCase = new CasePresentation();
				this.add((CaseVue)uneCase.getCaseVue(), i, j);
			}
		}		
	}

}
