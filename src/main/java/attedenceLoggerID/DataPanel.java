package attedenceLoggerID;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class DataPanel extends JPanel  implements Observer{
	protected displayableData displayable;
	
	public DataPanel(displayableData displayable) {
		this.displayable = displayable;
	}

	@Override
	public void update(Observable o, Object arg) {
		
		if(((boolean)arg)) {
			displayable.intializeDisplayable(((StudentListSource) o).getData());
			this.add(displayable);
		}
		else {
			//displayable.addAtendence(((StudentListSource) o).getData());
		}
		
	}
	
}
