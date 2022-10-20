import java.awt.*;

class ProduceProductCategoryMenu extends ProductMenu {

	ProduceProductCategoryMenu() {
	}

    void ShowAddButtons() {
		TradingAddButton.addActionListener(e -> TradingAddButton_actionPerformed());
		TradingAddButton.setText("Add");
		TradingAddButton.setBounds(new Rectangle(389, 54, 79, 29));
		OptionAddButton.setText("Add");
		OptionAddButton.setBounds(new Rectangle(390, 125, 79, 29));
		this.getContentPane().add(TradingAddButton, null);
		this.getContentPane().add(OptionAddButton, null);
	}

	void ShowRadios() {
		TradingRadio.setText("Trading");
		TradingRadio.setBounds(new Rectangle(21, 55, 103, 26));
		this.getContentPane().add(TradingRadio, null);
		OptionRadio.setText("ProduceProductExperiment");
		OptionRadio.setBounds(new Rectangle(21, 128, 103, 26));
		this.getContentPane().add(OptionRadio, null);
	}

	void ShowComboxes() {
		TradingCombox.setBounds(new Rectangle(140, 57, 126, 22));
		OptionCombo.setBounds(new Rectangle(137, 127, 126, 22));
		this.getContentPane().add(TradingCombox, null);
		this.getContentPane().add(OptionCombo, null);
		refresh();
	}

	void ShowViewButtons() {
		TradingViewButton.setText("View");
		TradingViewButton.setBounds(new Rectangle(290, 54, 79, 29));
		TradingViewButton.addActionListener(e -> TradingViewButton_actionPerformed());
		OptionViewButton.setText("View");
		OptionViewButton.setBounds(new Rectangle(290, 124, 79, 29));
		this.getContentPane().add(TradingViewButton, null);
		this.getContentPane().add(OptionViewButton, null);
	}

}