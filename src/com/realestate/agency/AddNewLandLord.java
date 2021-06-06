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

import com.realestate.agency.model.LandLord;
import com.realestate.agency.model.Saler;
import com.realestate.agency.util.RealEstateAgencyUtil;

import javax.swing.JButton;

public class AddNewLandLord extends JFrame {

	private JPanel contentPane;
	private JTextField landLordFullNameTextField;
	private JTextField landLordAddressTextField;
	private JTextField landLordOwnerCodeTextField;
	private JTextField landLordOrLandLordIdentifierDigit;
	private JTextField landLordBankAccountDetailsTextField;
	private JTextField landLordAmountOfRentReceivedPerWeekTextField;
	private int salerOrLandLOrd = -1;
	double amountOfRent = -1;

	/**
	 * Create the frame.
	 */
	public AddNewLandLord() {
		setForeground(new Color(224, 255, 255));
		setBackground(new Color(0, 128, 128));
		setTitle("Surbub Real Estate Add New LandLord");
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
		panel.setLayout(new GridLayout(6, 2, 2, 2));

		JLabel landLordFullNamesJLabel = new JLabel("Full Names:");
		landLordFullNamesJLabel.setBackground(new Color(0, 128, 128));
		landLordFullNamesJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		landLordFullNamesJLabel.setForeground(new Color(224, 255, 255));
		panel.add(landLordFullNamesJLabel);

		landLordFullNameTextField = new JTextField();
		panel.add(landLordFullNameTextField);
		landLordFullNameTextField.setColumns(10);

		JLabel landLordAddressJlabel = new JLabel("Address:");
		landLordAddressJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		landLordAddressJlabel.setForeground(new Color(224, 255, 255));
		panel.add(landLordAddressJlabel);

		landLordAddressTextField = new JTextField();
		panel.add(landLordAddressTextField);
		landLordAddressTextField.setColumns(10);

		JLabel landLordOwnerCodeJLabel = new JLabel("Owner Code:");
		landLordOwnerCodeJLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		landLordOwnerCodeJLabel.setForeground(new Color(224, 255, 255));
		panel.add(landLordOwnerCodeJLabel);

		landLordOwnerCodeTextField = new JTextField();
		panel.add(landLordOwnerCodeTextField);
		landLordOwnerCodeTextField.setColumns(10);

		JLabel landLordOrLandlordJlabel = new JLabel("Seller or Landlord Digit:");
		landLordOrLandlordJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		landLordOrLandlordJlabel.setForeground(new Color(224, 255, 255));
		panel.add(landLordOrLandlordJlabel);

		landLordOrLandLordIdentifierDigit = new JTextField();
		panel.add(landLordOrLandLordIdentifierDigit);
		landLordOrLandLordIdentifierDigit.setColumns(10);

		JLabel landLordNameOfConveyerJlabel = new JLabel("Bank account Details:");
		landLordNameOfConveyerJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		landLordNameOfConveyerJlabel.setForeground(new Color(224, 255, 255));
		panel.add(landLordNameOfConveyerJlabel);

		landLordBankAccountDetailsTextField = new JTextField();
		panel.add(landLordBankAccountDetailsTextField);
		landLordBankAccountDetailsTextField.setColumns(10);

		JLabel landLordLabelAmountOfRentReceivedPerWeek = new JLabel("Amount of rent received:");
		landLordLabelAmountOfRentReceivedPerWeek.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		landLordLabelAmountOfRentReceivedPerWeek.setBackground(new Color(0, 128, 128));
		landLordLabelAmountOfRentReceivedPerWeek.setForeground(new Color(224, 255, 255));
		panel.add(landLordLabelAmountOfRentReceivedPerWeek);

		landLordAmountOfRentReceivedPerWeekTextField = new JTextField();
		panel.add(landLordAmountOfRentReceivedPerWeekTextField);
		landLordAmountOfRentReceivedPerWeekTextField.setColumns(10);

		JPanel panelBackMenuPanel = new JPanel();
		panelBackMenuPanel.setForeground(new Color(224, 255, 255));
		panelBackMenuPanel.setBackground(new Color(0, 128, 128));
		contentPane.add(panelBackMenuPanel, BorderLayout.SOUTH);
		panelBackMenuPanel.setLayout(new BorderLayout(0, 0));

		JButton buttonBackMenu = new JButton("SUBMIT");
		buttonBackMenu.setFont(new Font("Lohit Devanagari", Font.ITALIC, 14));
		buttonBackMenu.setForeground(new Color(224, 255, 255));
		buttonBackMenu.setBackground(new Color(0, 128, 128));

		buttonBackMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				validateInput();
				addNewLandLordToMemory();
				if (salerOrLandLOrd == 2)
					removePreviousWindowFromView();

			}

		});
		panelBackMenuPanel.add(buttonBackMenu);

		this.setResizable(false);
	}

	public void validateInput() {

		try {
			salerOrLandLOrd = Integer.parseInt(landLordOrLandLordIdentifierDigit.getText().toString());

			try {
				amountOfRent = Double.parseDouble(landLordAmountOfRentReceivedPerWeekTextField.getText());
			} catch (Exception e) {
				JOptionPane.showMessageDialog(AddNewLandLord.this, "You entered invalid amount");
				RealEstateAgencyUtil.addNewLandLordInstance().setVisible(false);
				RealEstateAgencyUtil.menuFrameInstance().setVisible(true);
			}

		} catch (Exception e2) {

			if ((salerOrLandLOrd != 2 || salerOrLandLOrd == -1) || salerOrLandLOrd > 2) {
				JOptionPane.showMessageDialog(AddNewLandLord.this, "The saler or LandLordIdentifier must be a digit 2");

			}

			RealEstateAgencyUtil.addNewLandLordInstance().setVisible(false);
			RealEstateAgencyUtil.menuFrameInstance().setVisible(true);

		}
	}

	public void addNewLandLordToMemory() {

		LandLord landLord = new LandLord();

		landLord.setOwnerName(landLordFullNameTextField.getText().toString());
		landLord.setOwnerAddress(landLordAddressTextField.getText().toString());
		landLord.setOwnerId(landLordOwnerCodeTextField.getText().toString());
		landLord.setSellerOrLandLord(salerOrLandLOrd);
		landLord.setBankAccountDetail(landLordBankAccountDetailsTextField.getText());
		landLord.setAmountOfRent(amountOfRent);

		RealEstateAgencyUtil.getLandLordList().add(landLord);
	}

	private void removePreviousWindowFromView() {

		// removing the previous window from view
		JOptionPane.showMessageDialog(AddNewLandLord.this, "You added a new landlord successfully !!");


		RealEstateAgencyUtil.addNewLandLordInstance().setVisible(false);
		RealEstateAgencyUtil.menuFrameInstance().setVisible(true);
	}
}
