package com.heiniger.editor.view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;


public class GUI {
	private JTable editTable;
	private JTable selectTable;
	private JButton btnGenerateXml;
	public GUI(){
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1200, 800);
		window.setVisible(true);
		window.setTitle("Level Editor");		
		window.getContentPane().setLayout(null);		

		selectTable = new JTable();
		selectTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		selectTable.setBounds(39, 35, 220, 499);
		
		editTable = new JTable();
		editTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		editTable.setBounds(304, 35, 857, 499);
		
		window.getContentPane().add(editTable);
		window.getContentPane().add(selectTable);
		
		btnGenerateXml = new JButton("Generate XML");
		btnGenerateXml.setBounds(304, 612, 134, 25);
		window.getContentPane().add(btnGenerateXml);
	}
}
