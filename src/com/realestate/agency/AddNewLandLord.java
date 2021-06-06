package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class AddNewLandLord extends JFrame {

	private JPanel contentPane;
	private JTextField landLordFullNameTextField;
	private JTextField landLordAddressTextField;
	private JTextField landLordOwnerCodeTextField;
	private JTextField landLordOrLandLordIdentifierDigit;
	private JTextField landLordBankAccountDetailsTextField;
	private JTextField landLordAmountOfRentReceivedPerWeekTextField;

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
		panelBackMenuPanel.setBackground(new Color(0, 128, 128));
		contentPane.add(panelBackMenuPanel, BorderLayout.SOUTH);
		panelBackMenuPanel.setLayout(new BorderLayout(0, 0));
		
		JButton buttonBackMenu = new JButton("Back To Main Menu");
		buttonBackMenu.setFont(new Font("Lohit Devanagari", Font.ITALIC, 14));
		buttonBackMenu.setForeground(new Color(224, 255, 255));
		buttonBackMenu.setBackground(new Color(0, 128, 128));
		panelBackMenuPanel.add(buttonBackMenu);
		
		this.setResizable(false);
	}
}
