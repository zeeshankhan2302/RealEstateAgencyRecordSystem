package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class AddNewSaler extends JFrame {

	private JPanel contentPane;
	private JTextField salerFullNameTextField;
	private JTextField salerAddressTextField;
	private JTextField salerOwnerCodeTextField;
	private JTextField salerOrLandLordIdentifierDigit;
	private JTextField salerNameOfConveyerTextField;

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
		
		salerOrLandLordIdentifierDigit = new JTextField();
		panel.add(salerOrLandLordIdentifierDigit);
		salerOrLandLordIdentifierDigit.setColumns(10);
		
		JLabel salerNameOfConveyerJlabel = new JLabel("Name of Conveyer:");
		salerNameOfConveyerJlabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 18));
		salerNameOfConveyerJlabel.setForeground(new Color(224, 255, 255));
		panel.add(salerNameOfConveyerJlabel);
		
		salerNameOfConveyerTextField = new JTextField();
		panel.add(salerNameOfConveyerTextField);
		salerNameOfConveyerTextField.setColumns(10);
	}

}
