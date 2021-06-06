package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.realestate.agency.model.RentalProperty;
import com.realestate.agency.util.RealEstateAgencyUtil;

public class RentalPropertiesReport extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public RentalPropertiesReport() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(224, 255, 255));
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setForeground(new Color(224, 255, 255));
		scrollBar.setBackground(new Color(0, 128, 128));
		contentPane.add(scrollBar, BorderLayout.CENTER);

		JTextArea salesReportTextArea = new JTextArea();
		salesReportTextArea.setBackground(new Color(0, 128, 128));
		salesReportTextArea.setForeground(new Color(224, 255, 255));

		addTextToTextArea(salesReportTextArea);
		contentPane.add(salesReportTextArea, BorderLayout.CENTER);
	}

	private void addTextToTextArea(JTextArea textArea) {

		if (RealEstateAgencyUtil.getRentalPropertyList().size() == 0) {
			textArea.setText("NO ITEMS TO DISPLAY KINDLY ADD ITEMS THROUGH MENU OR CSV FILES");
		} else {

			textArea.setText("");
			for (int i = 0; i < RealEstateAgencyUtil.getSalePropertyList().size(); i++) {

				RentalProperty sl = RealEstateAgencyUtil.getRentalPropertyList().get(i);

				textArea.setText(textArea.getText() + "Street Address: " + sl.getStreetAddress() + "\n");
				textArea.setText(textArea.getText() + "Town: " + sl.getSurbub() + "\n");
				textArea.setText(textArea.getText() + "PropertyCode:" + sl.getUniquePropertyCode() + "\n");
				textArea.setText(textArea.getText() + "PropertyOwnerCode: " + sl.getPropertyOwnerCode() + "\n");
				textArea.setText(textArea.getText() + "NameOfTenant: " + sl.getNameOfTenant() + "\n");
				textArea.setText(textArea.getText() + "PhoneNumber: " + sl.getTenantPhoneNumber() + "\n");

				textArea.setText(textArea.getText() + "-----------------------------------------------------------");
				textArea.setText(textArea.getText() + "\n");
				System.out.println("-----------------------------------------------------------");
			}
		}
	}
}
