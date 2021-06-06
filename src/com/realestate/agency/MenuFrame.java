package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class MenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MenuFrame() {
		setBackground(new Color(0, 128, 128));
		setForeground(new Color(224, 255, 255));
		setFont(new Font("Lohit Devanagari", Font.BOLD, 12));
		setTitle("Surbub Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
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
		
		JLabel lblNewLabel = new JLabel("Reset Data");
		lblNewLabel.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(224, 255, 255));
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Add a new Seller");
		lblNewLabel_1.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(224, 255, 255));
		lblNewLabel_1.setBackground(new Color(0, 128, 128));
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_4);
		
		JLabel lblAddANew = new JLabel("Add a new landlord");
		lblAddANew.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblAddANew.setForeground(new Color(224, 255, 255));
		lblAddANew.setBackground(new Color(0, 128, 128));
		panel_4.add(lblAddANew);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Add a new property for sale");
		lblNewLabel_2.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblNewLabel_2.setBackground(new Color(0, 128, 128));
		lblNewLabel_2.setForeground(new Color(224, 255, 255));
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_6);
		
		JLabel lblSetUpA = new JLabel("Set up a new leased rental property");
		lblSetUpA.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblSetUpA.setBackground(new Color(0, 128, 128));
		lblSetUpA.setForeground(new Color(224, 255, 255));
		panel_6.add(lblSetUpA);
		
		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(224, 255, 255));
		panel_7.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_7);
		
		JLabel lblGenerateAReport = new JLabel("Generate a report about properties for sale");
		lblGenerateAReport.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblGenerateAReport.setBackground(new Color(0, 128, 128));
		lblGenerateAReport.setForeground(new Color(224, 255, 255));
		panel_7.add(lblGenerateAReport);
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(224, 255, 255));
		panel_8.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_8);
		
		JLabel lblNewLabel_3 = new JLabel("Generate a report about rental properties");
		lblNewLabel_3.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblNewLabel_3.setBackground(new Color(0, 128, 128));
		lblNewLabel_3.setForeground(new Color(224, 255, 255));
		panel_8.add(lblNewLabel_3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(95, 158, 160));
		panel_1.add(panel_9);
		
		JLabel lblNewLabel_4 = new JLabel("Exit the program");
		lblNewLabel_4.setFont(new Font("Lohit Devanagari", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(224, 255, 255));
		panel_9.add(lblNewLabel_4);
	}

}
