package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.realestate.agency.model.SaleProperty;
import com.realestate.agency.model.Saler;
import com.realestate.agency.util.RealEstateAgencyUtil;

import javax.swing.JButton;
import java.awt.FlowLayout;

public class AddNewPropertyForSale extends JFrame {

	private JPanel contentPane;
	private JTextField propertyForSaleAddressTextField;
	private JTextField propertyForSaleTownTextField;
	private JTextField propertyForSaleUniqueCodeTextField;
	private JTextField propertyForSaleOwnerCodeTextField;
	private JTextField propertyForLeaseDigitIdentifierTextField;
	private JTextField propertyForSaleAmountToReceiveTextField;
	private JTextField propertyForSaleAreaOfBuildingTextField;

	private int propertyForSaleOrBeingLeased = -1;
	private double amountOfSale=0;
	private double areaOfBuilding=0;

	/**
	 * Create the frame.
	 */
	public AddNewPropertyForSale() {

		setForeground(new Color(224, 255, 255));
		setBackground(new Color(0, 128, 128));
		setTitle("Surbub Real Estate Add New Saler");
		setFont(new Font("Lohit Devanagari", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setForeground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(253, 245, 230));
		panel.setBackground(new Color(95, 158, 160));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(7, 2, 2, 2));

		JLabel propertyForSaleAddressJLabel = new JLabel("Property Street Address:");
		propertyForSaleAddressJLabel.setBackground(new Color(0, 128, 128));
		propertyForSaleAddressJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleAddressJLabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleAddressJLabel);

		propertyForSaleAddressTextField = new JTextField();
		panel.add(propertyForSaleAddressTextField);
		propertyForSaleAddressTextField.setColumns(10);

		JLabel propertyForSaleTownJlabel = new JLabel("Town Location:");
		propertyForSaleTownJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleTownJlabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleTownJlabel);

		propertyForSaleTownTextField = new JTextField();
		panel.add(propertyForSaleTownTextField);
		propertyForSaleTownTextField.setColumns(10);

		JLabel propertyForSaleUniqueCodeJLabel = new JLabel("Property Code:");
		propertyForSaleUniqueCodeJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleUniqueCodeJLabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleUniqueCodeJLabel);

		propertyForSaleUniqueCodeTextField = new JTextField();
		panel.add(propertyForSaleUniqueCodeTextField);
		propertyForSaleUniqueCodeTextField.setColumns(10);

		JLabel propertyForSaleOwnerCodeJlabel = new JLabel("Property OwnerCode:");
		propertyForSaleOwnerCodeJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleOwnerCodeJlabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleOwnerCodeJlabel);

		propertyForSaleOwnerCodeTextField = new JTextField();
		panel.add(propertyForSaleOwnerCodeTextField);
		propertyForSaleOwnerCodeTextField.setColumns(10);

		JLabel propertyForSaleOrLeaseIdentifierJlabel = new JLabel("For Sale or Lease Digit:");
		propertyForSaleOrLeaseIdentifierJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleOrLeaseIdentifierJlabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleOrLeaseIdentifierJlabel);

		propertyForLeaseDigitIdentifierTextField = new JTextField();
		panel.add(propertyForLeaseDigitIdentifierTextField);
		propertyForLeaseDigitIdentifierTextField.setColumns(10);

		JLabel propertyForSaleAmountToReceiveJlabel = new JLabel("Amount To Receive:");
		propertyForSaleAmountToReceiveJlabel.setForeground(new Color(224, 255, 255));
		propertyForSaleAmountToReceiveJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		panel.add(propertyForSaleAmountToReceiveJlabel);

		propertyForSaleAmountToReceiveTextField = new JTextField();
		panel.add(propertyForSaleAmountToReceiveTextField);
		propertyForSaleAmountToReceiveTextField.setColumns(10);

		JLabel propertyForSaleAreaOfBuildingLabel = new JLabel("Area of Building:");
		propertyForSaleAreaOfBuildingLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleAreaOfBuildingLabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleAreaOfBuildingLabel);

		propertyForSaleAreaOfBuildingTextField = new JTextField();
		panel.add(propertyForSaleAreaOfBuildingTextField);
		propertyForSaleAreaOfBuildingTextField.setColumns(10);

		JPanel backToMainMenuPanel = new JPanel();
		backToMainMenuPanel.setBackground(new Color(0, 128, 128));
		backToMainMenuPanel.setForeground(new Color(224, 255, 255));
		contentPane.add(backToMainMenuPanel, BorderLayout.SOUTH);
		backToMainMenuPanel.setLayout(new BorderLayout(0, 0));

		JButton backToMainMenuButton = new JButton("BackToMainMenu");
		backToMainMenuButton.setFont(new Font("Lohit Devanagari", Font.ITALIC, 14));
		backToMainMenuButton.setBackground(new Color(0, 128, 128));
		backToMainMenuButton.setForeground(new Color(224, 255, 255));

		backToMainMenuButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				validateInput();
				addNewPropertyForSaleToMemory();
				if (propertyForSaleOrBeingLeased == 1)
					removePreviousWindowFromView();
			}

		});

		backToMainMenuPanel.add(backToMainMenuButton);
		this.setResizable(false);
	}

	private void validateInput() {

		
		try {
			propertyForSaleOrBeingLeased = Integer.parseInt(propertyForLeaseDigitIdentifierTextField.getText().toString());

		} catch (Exception e2) {

			if (((propertyForSaleOrBeingLeased != 1|| propertyForSaleOrBeingLeased == -1) || propertyForSaleOrBeingLeased > 2)) {
				JOptionPane.showMessageDialog(AddNewPropertyForSale.this, "The Identifier Digit must be a digit 1");

			}

			RealEstateAgencyUtil.addNewPropertyForSaleInstance().setVisible(false);
			RealEstateAgencyUtil.menuFrameInstance().setVisible(true);

		}
		
		try {
			
			amountOfSale=Double.parseDouble(propertyForSaleAmountToReceiveTextField.getText());
			areaOfBuilding=Double.parseDouble(propertyForSaleAreaOfBuildingTextField.getText());
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(AddNewPropertyForSale.this, "You should enter a valid amount");
			RealEstateAgencyUtil.addNewPropertyForSaleInstance().setVisible(false);
			RealEstateAgencyUtil.menuFrameInstance().setVisible(true);
			
		}
	}

	private void addNewPropertyForSaleToMemory() {

		// adding the infor to memory
		
		SaleProperty saleProperty=new SaleProperty();
		saleProperty.setStreetAddress(propertyForSaleAddressTextField.getText());
		saleProperty.setSurbub(propertyForSaleTownTextField.getText());
		saleProperty.setUniquePropertyCode(propertyForSaleUniqueCodeTextField.getText());
		saleProperty.setPropertyOwnerCode(propertyForSaleOwnerCodeTextField.getText());
		saleProperty.setPropertyForSaleorLeased(propertyForSaleOrBeingLeased);
		saleProperty.setAmountOfSale( amountOfSale);
		saleProperty.setAreaOfTheBuilding(areaOfBuilding);
		
		RealEstateAgencyUtil.getSalePropertyList().add(saleProperty);
	}

	private void removePreviousWindowFromView() {

		// removing the previous window from view
		JOptionPane.showMessageDialog(AddNewPropertyForSale.this, "You added a new property successfully !!");
		AddNewPropertyForSale.this.setVisible(false);
		RealEstateAgencyUtil.menuFrameInstance().setVisible(true);
	}
}
