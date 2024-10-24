package Week2;

public class Elements extends Button {

	public static void main(String[] args) {
		
		Elements e= new Elements();
		e.click();
		e.setText("Inheritance");
		e.submit();
		
		TextField t= new TextField();
		t.getText();
		
		
		CheckBoxButton c= new CheckBoxButton();
		c.clickCheckButton();
		
		RadioButton r= new RadioButton();
		r.selectRadioButton();
	}

}
