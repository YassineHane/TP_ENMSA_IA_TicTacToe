package hanelemas.tp.ui.composants.compocase;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class CaseVue extends Button implements ICasePresentation, EventHandler<MouseEvent> {

	private CasePresentation maPresentation;
	
	private Image img;
	private ImageView imgV;
	
	private Image imageVide = new Image("vide.png");
	private Image imageRond = new Image("rond.png");
	private Image imageCroix = new Image("croix.png");
	
	public CaseVue(CasePresentation p) {
		super();
		maPresentation = p;
		img = imageRond;
		imgV = new ImageView(img);
		setAlignment(Pos.CENTER);
		this.setGraphic(imgV);
		this.addEventHandler(MouseEvent.MOUSE_CLICKED, this);
		
		
	}


	@Override
	public void setCaseCroix() {
		setCaseImage(imageCroix);
	}


	@Override
	public void setCaseRond() {
		setCaseImage(imageRond);		
	}


	@Override
	public void resetCase() {
		setCaseImage(imageVide);
		
	}
	
	public void setCaseImage(Image image) {
		img = image;
		imgV.setImage(img);
		this.setGraphic(imgV);
	}

	public CaseVue getCaseVue() {
		return this;
	}

	
	@Override
	public void handle(MouseEvent event) {
		setCaseCroix();
		maPresentation.notifyCaseSelected();
	}
	

	
	
}
