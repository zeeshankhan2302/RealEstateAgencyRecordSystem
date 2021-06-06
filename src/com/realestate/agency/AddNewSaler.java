package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.realestate.agency.model.Saler;
import com.realestate.agency.util.RealEstateAgencyUtil;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AddNewSaler extends JFrame {

	private JPanel contentPane;
	private JTextField salerFullNameTextField;
	private JTextField salerAddressTextField;
	private JTextField salerOwnerCodeTextField;
	private JTextField salerOrLandLordIdentifierDigitTextField;
	private JTextField salerNameOfConveyerTextField;

	private int salerOrLandLOrd = -1;

	/**
	 * Create the frame.
	 */
	public AddNewSaler() {
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
		panel.setLayout(new GridLayout(5, 2, 2, 2));

		JLabel salerFullNamesJLabel = new JLabel("Full Names:");
		salerFullNamesJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		salerFullNamesJLabel.setForeground(new Color(224, 255, 255));
		panel.add(salerFullNamesJLabel);

		salerFullNameTextField = new JTextField();
		panel.add(salerFullNameTextField);
		salerFullNameTextField.setColumns(10);

		JLabel salerAddressJlabel = new JLabel("Address:");
		salerAddressJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		salerAddressJlabel.setForeground(new Color(224, 255, 255));
		panel.add(salerAddressJlabel);

		salerAddressTextField = new JTextField();
		panel.add(salerAddressTextField);
		salerAddressTextField.setColumns(10);

		JLabel salerOwnerCodeJLabel = new JLabel("Owner Code:");
		salerOwnerCodeJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		salerOwnerCodeJLabel.setForeground(new Color(224, 255, 255));
		panel.add(salerOwnerCodeJLabel);

		salerOwnerCodeTextField = new JTextField();
		panel.add(salerOwnerCodeTextField);
		salerOwnerCodeTextField.setColumns(10);

		JLabel salerOrLandlordJlabel = new JLabel("Seller or Landlord Digit:");
		salerOrLandlordJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		salerOrLandlordJlabel.setForeground(new Color(224, 255, 255));
		panel.add(salerOrLandlordJlabel);

		salerOrLandLordIdentifierDigitTextField = new JTextField();
		panel.add(salerOrLandLordIdentifierDigitTextField);
		salerOrLandLordIdentifierDigitTextField.setColumns(10);

		JLabel salerNameOfConveyerJlabel = new JLabel("Name of Conveyer:");
		salerNameOfConveyerJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		salerNameOfConveyerJlabel.setForeground(new Color(224, 255, 255));
		panel.add(salerNameOfConveyerJlabel);

		salerNameOfConveyerTextField = new JTextField();
		panel.add(salerNameOfConveyerTextField);
		salerNameOfConveyerTextField.setColumns(10);

		JPanel panelGoBack = new JPanel();
		panelGoBack.setForeground(new Color(224, 255, 255));
		panelGoBack.setBackground(new Color(0, 128, 128));
		contentPane.add(panelGoBack, BorderLayout.SOUTH);
		panelGoBack.setLayout(new BorderLayout(0, 0));

		JButton buttonBackToMainMenu = new JButton("SUBMIT");
		buttonBackToMainMenu.setFont(new Font("Lohit Devanagari", Font.ITALIC, 14));
		buttonBackToMainMenu.setForeground(new Color(224, 255, 255));
		buttonBackToMainMenu.setBackground(new Color(0, 128, 128));

		buttonBackToMainMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				validateInput();
				addSalerToMemory();
				if(salerOrLandLOrd==1 ||salerOrLandLOrd==2)
				removePreviousWindowFromView();

			}

		});
		panelGoBack.add(buttonBackToMainMenu);
		this.setResizable(false);
	}

	// adding saler information to memory
	private void addSalerToMemory() {

		// adding the infor to memory

		Saler saler = new Saler();
		saler.setOwnerName(salerFullNameTextField.getText().toString());
		saler.setOwnerAddress(salerAddressTextField.getText().toString());
		saler.setOwnerId(salerOwnerCodeTextField.getText().toString());

		saler.setSellerOrLandLord(salerOrLandLOrd);

		saler.setNameOfConvenyencer(salerNameOfConveyerTextField.getText().toString());

		RealEstateAgencyUtil.getSalerList().add(saler);

		System.out.println(RealEstateAgencyUtil.getSalerList());
	}

	private void removePreviousWindowFromView() {

		// removing the previous window from view
		JOptionPane.showMessageDialog(AddNewSaler.this, "You added a new saler successfully !!");
		AddNewSaler.this.setVisible(false);
		RealEstateAgencyUtil.menuFrameInstance().setVisible(true);
	}

	private void validateInput() {

		try {
			salerOrLandLOrd = Integer.parseInt(salerOrLandLordIdentifierDigitTextField.getText().toString());

		} catch (Exception e2) {

			if (((salerOrLandLOrd != 1 || salerOrLandLOrd != 2) || salerOrLandLOrd == -1) || salerOrLandLOrd > 2) {
				JOptionPane.showMessageDialog(AddNewSaler.this,
						"The saler or LandLordIdentifier must be a digit either 1 or 2");

			}

			RealEstateAgencyUtil.addNewSalerInstance().setVisible(false);
			RealEstateAgencyUtil.menuFrameInstance().setVisible(true);

		}

	}
}
