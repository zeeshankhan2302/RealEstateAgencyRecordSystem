package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.realestate.agency.util.RealEstateAgencyUtil;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuFrame extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JButton resetDataButton;
	private JButton addSellerButton;
	private JButton buttonAddLandLord;
	private JButton buttonaddAPropertyForSale;
	private JButton buttonAddNewLeasedRentalProperty;
	private JButton buttonGeneratePropertyForSaleReport;
	private JButton buttonGenerateReportForRental;
	private JButton buttonExitProgram;

	/**
	 * Create the frame.
	 */
	public MenuFrame() {
		setBackground(new Color(0, 128, 128));
		setForeground(new Color(224, 255, 255));
		setFont(new Font("Lohit Devanagari", Font.BOLD, 12));
		setTitle("Surbub Real Estate Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(224, 255, 255));
		panel_1.setBackground(new Color(0, 128, 128));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(8, 1, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(224, 255, 255));
		panel_2.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		resetDataButton = new JButton("Reset Data");
		resetDataButton.setBackground(new Color(0, 128, 128));
		resetDataButton.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		resetDataButton.setForeground(new Color(224, 255, 255));
		resetDataButton.addActionListener(this);
		panel_2.add(resetDataButton);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		addSellerButton = new JButton("Add a new Seller");
		addSellerButton.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		addSellerButton.setForeground(new Color(224, 255, 255));
		addSellerButton.setBackground(new Color(0, 128, 128));

		addSellerButton.addActionListener(this);
		panel_3.add(addSellerButton);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		buttonAddLandLord = new JButton("Add a new landlord");
		buttonAddLandLord.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		buttonAddLandLord.setForeground(new Color(224, 255, 255));
		buttonAddLandLord.setBackground(new Color(0, 128, 128));
		buttonAddLandLord.addActionListener(this);
		panel_4.add(buttonAddLandLord);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		buttonaddAPropertyForSale = new JButton("Add a new property for sale");
		buttonaddAPropertyForSale.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		buttonaddAPropertyForSale.setBackground(new Color(0, 128, 128));
		buttonaddAPropertyForSale.setForeground(new Color(224, 255, 255));

		buttonaddAPropertyForSale.addActionListener(this);

		panel_5.add(buttonaddAPropertyForSale);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		buttonAddNewLeasedRentalProperty = new JButton("Set up a new leased rental property");
		buttonAddNewLeasedRentalProperty.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		buttonAddNewLeasedRentalProperty.setBackground(new Color(0, 128, 128));
		buttonAddNewLeasedRentalProperty.setForeground(new Color(224, 255, 255));
		buttonAddNewLeasedRentalProperty.addActionListener(this);
		panel_6.add(buttonAddNewLeasedRentalProperty);

		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(224, 255, 255));
		panel_7.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		buttonGeneratePropertyForSaleReport = new JButton("Generate a report about properties for sale");
		buttonGeneratePropertyForSaleReport.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		buttonGeneratePropertyForSaleReport.setBackground(new Color(0, 128, 128));
		buttonGeneratePropertyForSaleReport.setForeground(new Color(224, 255, 255));
		buttonGeneratePropertyForSaleReport.addActionListener(this);
		panel_7.add(buttonGeneratePropertyForSaleReport);

		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(224, 255, 255));
		panel_8.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		buttonGenerateReportForRental = new JButton("Generate a report about rental properties");
		buttonGenerateReportForRental.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		buttonGenerateReportForRental.setBackground(new Color(0, 128, 128));
		buttonGenerateReportForRental.setForeground(new Color(224, 255, 255));
		buttonGenerateReportForRental.addActionListener(this);
		panel_8.add(buttonGenerateReportForRental);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		buttonExitProgram = new JButton("Exit the program");
		buttonExitProgram.setBackground(new Color(0, 128, 128));
		buttonExitProgram.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		buttonExitProgram.setForeground(new Color(224, 255, 255));
		buttonExitProgram.addActionListener(this);
		panel_9.add(buttonExitProgram);

		this.setResizable(false);
		RealEstateAgencyUtil.realEstateAgencyRecordSystemWelcomeScreenInstance().setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton buttonClicked = (JButton) e.getSource();

		if (buttonClicked == resetDataButton) {
			//handle Data Reset

		} else if (buttonClicked == addSellerButton) {
			//add a new saler
			
			RealEstateAgencyUtil.addNewSalerInstance().setVisible(true);
			removeBackroundWindow();

		} else if (buttonClicked == buttonAddLandLord) {
			//add a newLandLord
			
			RealEstateAgencyUtil.addNewLandLordInstance().setVisible(true);
			removeBackroundWindow();

		} else if (buttonClicked == buttonaddAPropertyForSale) {
			//add a property for sale
			
			RealEstateAgencyUtil.addNewPropertyForSaleInstance().setVisible(true);
			removeBackroundWindow();

		} else if (buttonClicked == buttonAddNewLeasedRentalProperty) {
			//add a new leased RentalProperty
			RealEstateAgencyUtil.addNewPropertyForLeaseInstance().setVisible(true);
			removeBackroundWindow();

		} else if (buttonClicked == buttonGeneratePropertyForSaleReport) {

			//generate Report for sale property
		} else if (buttonClicked == buttonGenerateReportForRental) {
			//generate report for rental property

		} else if (buttonClicked == buttonExitProgram) {
			//do program cleanup here before exit
			
			System.exit(0);

		}
		else {
			JOptionPane.showMessageDialog(this, "An erro occured in the program");
		}
		
	}
	
	private void removeBackroundWindow() {
		
		RealEstateAgencyUtil.menuFrameInstance().setVisible(false);
	}
}
