package hanelemas.tp.ui.composants.compocase.automate;

import hanelemas.tp.ui.composants.compocase.CasePresentation;

public abstract class AbstractEtatAdapter implements IEtat{
	
	protected CasePresentation pres;
	
	public AbstractEtatAdapter(CasePresentation p) {
		pres = p ;
	}
	
	@Override
	public void setCaseRond() throws TransitionNonTirableException {
		throw new TransitionNonTirableException();
		
	}

	@Override
	public void setCaseCroix() throws TransitionNonTirableException {
		throw new TransitionNonTirableException();
		
	}

	@Override
	public void resetCase() throws TransitionNonTirableException {
		throw new TransitionNonTirableException();
		
	}
	

}
