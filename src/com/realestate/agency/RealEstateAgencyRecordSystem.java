package com.realestate.agency;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class RealEstateAgencyRecordSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//RealEstateAgencyRecordSystem frame = new RealEstateAgencyRecordSystem();
					//frame.setVisible(true);
					
					MenuFrame mf=new MenuFrame();
					mf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RealEstateAgencyRecordSystem() {
		setFont(new Font("Lohit Devanagari", Font.BOLD, 12));
		setTitle("Surbub Real Estate Agency");
		setForeground(new Color(224, 255, 255));
		setBackground(new Color(0, 128, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setForeground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 128, 128));
		panel.setBackground(new Color(0, 128, 128));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 128, 128));
		panel_2.setBackground(new Color(0, 128, 128));
		panel.add(panel_2, "name_8057842341189");
		
		JLabel lblNewLabel = new JLabel("Welcome to Surbub Real Estate Agency");
		lblNewLabel.setForeground(new Color(224, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Lohit Devanagari", Font.ITALIC, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(128, 128, 128));
		panel_1.setBackground(new Color(0, 128, 128));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(4, 4));
		
		JLabel lblNewLabel_1 = new JLabel("NEXT");
		lblNewLabel_1.setFont(new Font("Lohit Devanagari", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, BorderLayout.NORTH);
	}
}
