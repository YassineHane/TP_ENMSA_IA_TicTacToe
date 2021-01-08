package hanelemas.tp.ui.composants.compocase.automate;

import hanelemas.tp.ui.composants.compocase.CasePresentation;

public class EtatCaseVide extends AbstractEtatAdapter {

	public EtatCaseVide(CasePresentation p) {
		super(p);
	}
	
	@Override
	public void setCaseRond() throws TransitionNonTirableException{
		pres.setEtatCourant(pres.getEtatCaseRond());

	}
	
	@Override
	public void setCaseCroix() throws TransitionNonTirableException{
		pres.setEtatCourant(pres.getEtatCaseCroix());
		
	}

}
