package hanelemas.tp.ui.composants.compocase.automate;

import hanelemas.tp.ui.composants.compocase.CasePresentation;

public class EtatCaseRond extends AbstractEtatAdapter {

	public EtatCaseRond(CasePresentation p) {
		super(p);
	}

	@Override
	public void resetCase() throws TransitionNonTirableException {
		pres.setEtatCourant(pres.getEtatCaseVide());
	}

}
