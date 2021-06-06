package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.realestate.agency.model.RentalProperty;
import com.realestate.agency.util.RealEstateAgencyUtil;

public class AddNewPropertyForLease extends JFrame {

	private JPanel contentPane;
	private JTextField propertyForLeaseAddressTextField;
	private JTextField propertyForLeaseTownTextField;
	private JTextField propertyForLeaseUniqueCodeTextField;
	private JTextField propertyForLeaseOwnerCodeTextField;
	private JTextField propertyForLeaseDigitIdentifierTextField;
	private JTextField propertyForLeaseNameOfTenantTextField;
	private JTextField propertyForLeaseTenantPhoneNumberTextField;

	private int propertyForSaleOrBeingLeased = -1;
	/**
	 * Create the frame.
	 */
	 public AddNewPropertyForLease() {
		 
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
		
		JLabel propertyForLeaseAddressJLabel = new JLabel("Property Street Address:");
		propertyForLeaseAddressJLabel.setBackground(new Color(0, 128, 128));
		propertyForLeaseAddressJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForLeaseAddressJLabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForLeaseAddressJLabel);
		
		propertyForLeaseAddressTextField = new JTextField();
		panel.add(propertyForLeaseAddressTextField);
		propertyForLeaseAddressTextField.setColumns(10);
		
		JLabel propertyForLeaseTownJlabel = new JLabel("Town Location:");
		propertyForLeaseTownJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForLeaseTownJlabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForLeaseTownJlabel);
		
		propertyForLeaseTownTextField = new JTextField();
		panel.add(propertyForLeaseTownTextField);
		propertyForLeaseTownTextField.setColumns(10);
		
		JLabel propertyForLeaseUniqueCodeJLabel = new JLabel("Property Code:");
		propertyForLeaseUniqueCodeJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForLeaseUniqueCodeJLabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForLeaseUniqueCodeJLabel);
		
		propertyForLeaseUniqueCodeTextField = new JTextField();
		panel.add(propertyForLeaseUniqueCodeTextField);
		propertyForLeaseUniqueCodeTextField.setColumns(10);
		
		JLabel propertyForLeaseOwnerCodeJlabel = new JLabel("Property OwnerCode:");
		propertyForLeaseOwnerCodeJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForLeaseOwnerCodeJlabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForLeaseOwnerCodeJlabel);
		
		propertyForLeaseOwnerCodeTextField = new JTextField();
		panel.add(propertyForLeaseOwnerCodeTextField);
		propertyForLeaseOwnerCodeTextField.setColumns(10);
		
		JLabel propertyForSaleOrLeaseIdentifierJlabel = new JLabel("For Sale or Lease Digit:");
		propertyForSaleOrLeaseIdentifierJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForSaleOrLeaseIdentifierJlabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForSaleOrLeaseIdentifierJlabel);
		
		propertyForLeaseDigitIdentifierTextField = new JTextField();
		panel.add(propertyForLeaseDigitIdentifierTextField);
		propertyForLeaseDigitIdentifierTextField.setColumns(10);
		
		JLabel propertyForLeaseNameOfTenantLabel = new JLabel("Name of Tenant:");
		propertyForLeaseNameOfTenantLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForLeaseNameOfTenantLabel.setForeground(new Color(224, 255, 255));
		propertyForLeaseNameOfTenantLabel.setBackground(new Color(0, 128, 128));
		panel.add(propertyForLeaseNameOfTenantLabel);
		
		propertyForLeaseNameOfTenantTextField = new JTextField();
		panel.add(propertyForLeaseNameOfTenantTextField);
		propertyForLeaseNameOfTenantTextField.setColumns(10);
		
		JLabel propertyForLeaseTenantPhoneNumberLabel = new JLabel("Tenant Phone Number:");
		propertyForLeaseTenantPhoneNumberLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		propertyForLeaseTenantPhoneNumberLabel.setBackground(new Color(0, 128, 128));
		propertyForLeaseTenantPhoneNumberLabel.setForeground(new Color(224, 255, 255));
		panel.add(propertyForLeaseTenantPhoneNumberLabel);
		
		propertyForLeaseTenantPhoneNumberTextField = new JTextField();
		panel.add(propertyForLeaseTenantPhoneNumberTextField);
		propertyForLeaseTenantPhoneNumberTextField.setColumns(10);
		
		JPanel panelBackToMainMenuPanel = new JPanel();
		panelBackToMainMenuPanel.setBackground(new Color(0, 128, 128));
		panelBackToMainMenuPanel.setForeground(new Color(224, 255, 255));
		contentPane.add(panelBackToMainMenuPanel, BorderLayout.SOUTH);
		panelBackToMainMenuPanel.setLayout(new BorderLayout(0, 0));
		
		JButton buttonBackToMenu = new JButton("Back To Main Menu");
		buttonBackToMenu.setFont(new Font("Lohit Devanagari", Font.ITALIC, 14));
		buttonBackToMenu.setBackground(new Color(0, 128, 128));
		buttonBackToMenu.setForeground(new Color(224, 255, 255));
		
		buttonBackToMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				validateInput();
				addNewPropertyForLeaseToMemory();
				if (propertyForSaleOrBeingLeased == 1)
					removePreviousWindowFromView();
			}

		});
		
		panelBackToMainMenuPanel.add(buttonBackToMenu);
		this.setResizable(false);
	}

	 private void validateInput() {
		
		 try {
				propertyForSaleOrBeingLeased = Integer.parseInt(propertyForLeaseDigitIdentifierTextField.getText().toString());

			} catch (Exception e2) {

				if (((propertyForSaleOrBeingLeased != 1|| propertyForSaleOrBeingLeased == -1) || propertyForSaleOrBeingLeased > 2)) {
					JOptionPane.showMessageDialog(AddNewPropertyForLease.this, "The Identifier Digit must be a digit 1");

				}

				RealEstateAgencyUtil.addNewPropertyForLeaseInstance().setVisible(false);
				RealEstateAgencyUtil.menuFrameInstance().setVisible(true);

			}
	 }
	 
	 private void addNewPropertyForLeaseToMemory() {
		 
		// adding the infor to memory
			
			RentalProperty leaseProperty=new RentalProperty();
			
			leaseProperty.setStreetAddress(propertyForLeaseAddressTextField.getText());
			leaseProperty.setSurbub(propertyForLeaseTownTextField.getText());
			leaseProperty.setUniquePropertyCode(propertyForLeaseUniqueCodeTextField.getText());
			leaseProperty.setPropertyOwnerCode(propertyForLeaseOwnerCodeTextField.getText());
			leaseProperty.setPropertyForSaleorLeased(propertyForSaleOrBeingLeased);
			leaseProperty.setNameOfTenant(propertyForLeaseNameOfTenantTextField.getText());
			leaseProperty.setTenantPhoneNumber(propertyForLeaseTenantPhoneNumberTextField.getText());
			
			
			RealEstateAgencyUtil.getRentalPropertyList().add(leaseProperty); 
	 }
	 
	 private void removePreviousWindowFromView() {
		 
		// removing the previous window from view
			JOptionPane.showMessageDialog(AddNewPropertyForLease.this, "You added a new property For Lease successfully !!");
			AddNewPropertyForLease.this.setVisible(false);
			RealEstateAgencyUtil.menuFrameInstance().setVisible(true);
	 }
}
