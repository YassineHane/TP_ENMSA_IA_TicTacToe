package hanelemas.tp.ui.composants.compocase;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import hanelemas.tp.ui.composants.compocase.automate.EtatCaseCroix;
import hanelemas.tp.ui.composants.compocase.automate.EtatCaseRond;
import hanelemas.tp.ui.composants.compocase.automate.EtatCaseVide;
import hanelemas.tp.ui.composants.compocase.automate.IEtat;
import hanelemas.tp.ui.composants.compocase.automate.TransitionNonTirableException;

public class CasePresentation {

	private ICasePresentation maVue;

	private IEtat etatCourant;
	private IEtat etatCaseCroix = new EtatCaseCroix(this);
	private IEtat etatCaseRond = new EtatCaseRond(this);
	private IEtat etatCaseVide = new EtatCaseVide(this);

	private List<ICompoCaseObserver> mesObservers;

	private static Logger LOGGER = Logger.getLogger(CasePresentation.class.getName());

	public CasePresentation() {
		maVue = new CaseVue(this);
		etatCourant = etatCaseVide;
		mesObservers = new ArrayList<ICompoCaseObserver>();
	}

	public void ecouteCompoCase(ICompoCaseObserver obs) {
		mesObservers.add(obs);
	}

	public void stopEcouteCompoCase(ICompoCaseObserver obs) {
		mesObservers.remove(obs);
	}

	public void setEtatCourant(IEtat etat) {
		etatCourant = etat;
	}

	public IEtat getEtatCaseCroix() {
		return etatCaseCroix;
	}

	public IEtat getEtatCaseRond() {
		return etatCaseRond;
	}

	public IEtat getEtatCaseVide() {
		return etatCaseVide;
	}

	public void setCaseCroix() {
		try {
			etatCourant.setCaseCroix();
			maVue.setCaseCroix();
		} catch (TransitionNonTirableException e) {
			LOGGER.severe("Transition Impossible");
		}
	}

	public void setCaseRond() {
		try {
			etatCourant.setCaseRond();
			maVue.setCaseRond();
		} catch (TransitionNonTirableException e) {
			LOGGER.severe("Transition Impossible");
		}
	}

	public void setCaseVide() {
		try {
			etatCourant.resetCase();
			maVue.resetCase();
		} catch (TransitionNonTirableException e) {
			LOGGER.severe("Transition Impossible");
		}
	}

	public void notifyCaseSelected() {
		LOGGER.info("Case Selectionnée");
		for (ICompoCaseObserver ob : mesObservers) {
			ob.caseSelected();
		}
	}

	public ICasePresentation getCaseVue() {
		return maVue;
	}

}
