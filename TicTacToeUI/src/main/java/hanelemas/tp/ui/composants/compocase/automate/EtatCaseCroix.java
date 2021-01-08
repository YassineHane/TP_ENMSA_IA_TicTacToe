package hanelemas.tp.ui.composants.compocase.automate;

import hanelemas.tp.ui.composants.compocase.CasePresentation;

public class EtatCaseCroix extends AbstractEtatAdapter{

	public EtatCaseCroix(CasePresentation p) {
		super(p);
		
	}
	
	public void resetCase() throws TransitionNonTirableException {
		pres.setEtatCourant(pres.getEtatCaseVide());
	}

}
