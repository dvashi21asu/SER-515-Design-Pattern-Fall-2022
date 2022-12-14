import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ProductSelectDlg extends JDialog {
	private Product SelectedProduct;
	int nProductCategory = 0;
	private boolean m_bLogout = false;
	private JComboBox<Product> ProductNameCom = new JComboBox<>();
	private JRadioButton HighLevelRadio = new JRadioButton();
	private JRadioButton LowLevelRadio = new JRadioButton();
	private JLabel jLabel1 = new JLabel();
	private JButton OKButton = new JButton();
	private ButtonGroup buttonGroup1 = new ButtonGroup();
	private JButton buttonLogout = new JButton();

	ProductSelectDlg() {
		try {
			jbInit();
			setSize(420, 238);
			setModal(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() {
		this.getContentPane().setLayout(null);
		ProductNameCom.setBounds(new Rectangle(155, 41, 203, 22));
		HighLevelRadio.setText("Meat");
		HighLevelRadio.setBounds(new Rectangle(50, 87, 103, 26));
		LowLevelRadio.setToolTipText("");
		LowLevelRadio.setSelected(true);
		LowLevelRadio.setText("Produce");
		LowLevelRadio.setBounds(new Rectangle(236, 88, 103, 26));
		jLabel1.setText("ProductName");
		jLabel1.setBounds(new Rectangle(39, 44, 85, 18));
		OKButton.setText("OK");
		OKButton.setBounds(new Rectangle(78, 139, 79, 29));
		OKButton.addActionListener(this::OKButton_actionPerformed);
		buttonLogout.setText("Logout");
		buttonLogout.setBounds(new Rectangle(224, 140, 73, 31));
		buttonLogout.addActionListener(this::buttonLogout_actionPerformed);
		this.getContentPane().add(ProductNameCom, null);
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(HighLevelRadio, null);
		this.getContentPane().add(LowLevelRadio, null);
		this.getContentPane().add(OKButton, null);
		this.getContentPane().add(buttonLogout, null);
		buttonGroup1.add(HighLevelRadio);
		buttonGroup1.add(LowLevelRadio);
	}

	

	Product ShowDlg(ClassProductList productList) {

		
		ProductIterator theIterator = new ProductIterator(productList);
		Product theProduct;
		while ((theProduct = (Product) theIterator.next()) != null) 
		{
			ProductNameCom.addItem(theProduct);
		}
		setVisible(true);
		return SelectedProduct;
	}

	private void OKButton_actionPerformed(ActionEvent e) {
		SelectedProduct = (Product) ProductNameCom.getSelectedItem();
		if (HighLevelRadio.isSelected())
			nProductCategory = 0; 
		else
			nProductCategory = 1; 
		dispose();
	}

	boolean isLogout() {
		return m_bLogout;
	}

	private void buttonLogout_actionPerformed(ActionEvent e) {
		m_bLogout = true;
		dispose();
	}
}