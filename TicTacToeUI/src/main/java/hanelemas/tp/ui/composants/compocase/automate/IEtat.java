package hanelemas.tp.ui.composants.compocase.automate;

public interface IEtat {
	void setCaseRond() throws TransitionNonTirableException;
	void setCaseCroix() throws TransitionNonTirableException;
	void resetCase() throws TransitionNonTirableException;
	

}
